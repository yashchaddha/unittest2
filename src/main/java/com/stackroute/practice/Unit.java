package com.stackroute.practice;

import java.io.*;

public class Unit
{
    String palindromeCheck(String str)  //test 1 que
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            result=result+str.charAt(i);
        }
        return result;
    }
    boolean  isPower(int number)
    {
        boolean a=true;
        if(number%4==0)
            a=true;
        else
            a=false;
        return a;
    }
    boolean isEven(int number)
    {
        boolean a=true;
        if(number%2==0)
            a=true;
        else
            a=false;
        return a;
    }
    int isFact(int number)
    {
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    int[] isGrades(int grades[])
    {
        int a[]=new int[100];
        int sum=0;
        int min=grades[0];
        int max=grades[0];
        for(int i=0;i<grades.length;i++)
        {
            sum+=grades[i];
        }
        a[0]=sum/grades.length;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<min)
            {
                min=grades[i];
            }
        }
        a[1]=min;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>max)
            {
                max=grades[i];
            }
        }
        a[2]=max;

        return a;
    }
    String contentPrintTextFile(String filename)
    {
        File f;
        FileInputStream fis = null;
        String out = "";
        byte[] b = null;

        try {
            f = new File("/home/yash/Desktop/unitest2-master/src/main/java/com/stackroute/practice/file.txt");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }


        try {
            fis = new FileInputStream(f);
            b = new byte[(int) f.length()];
            fis.read(b);
        } catch (Exception e) {
            System.out.println(e);
        }

        out = new String(b);
        System.out.println(out);

        return out.toUpperCase();
    }
    int contentOfFileTimes(String filename) throws IOException {
        File file = new File("/home/yash/Desktop/unitest2-master/src/main/java/com/stackroute/practice/FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        return countWord;
    }
    String[]  memberData(String name,int age, double Salary)
    {
        String age1=String.valueOf(age);
        String sal=String.valueOf(Salary);
        String[] s= new String[3];
        s[0]=name;
        s[1]=age1;
        s[2]=sal;
        return s;
    }
    byte[] byteFileContent(String Filename) throws IOException {
        File file = new File("/home/yash/Desktop/unitest2-master/src/main/java/com/stackroute/practice/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        String st;
        while ((st = br.readLine()) != null)
        {
            s+=st;
        }
        byte[] bytearr1= s.getBytes();

        return bytearr1;
    }
    
}
