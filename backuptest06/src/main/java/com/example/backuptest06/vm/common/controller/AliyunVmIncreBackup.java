package com.example.backuptest06.vm.common.controller;

import com.example.backuptest06.vm.common.utils.IncreBackup;
import com.example.backuptest06.vm.common.utils.TrieTree;
import com.example.backuptest06.vm.common.utils.testDeCompressTarGzip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author
 * @Description
 * @time 2022111022:03
 */
@RestController
public class AliyunVmIncreBackup {
//    @ApiOperation(value = "虚拟机备份")
    private static final int BYTE_SIZE = 2;
    public static void main(String[] args)throws NoSuchAlgorithmException,IOException {
        boolean flag=false;
        long startTime; //程序开始记录时间
        long endTime; //程序结束记录时间
        long TotalTime; //总消耗时间
        startTime = System.currentTimeMillis();

     /*   //求出现在的秒
        long totalSeconds =  startTime / 1000;
        long currentSecond =totalSeconds % 60;

        //求出现在的分
        long totalMinutes =currentSecond / 60;
        long currentMinute = totalMinutes % 60;

        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        //显示时间
        System.out.println("总毫秒为： " +  startTime);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        */

        String algorithm="MD5";
        IncreBackup backup = new IncreBackup();
        File rFile = new File("D:\\Graduate's\\HuaWei_balabala\\ttt03.docx");
        TrieTree t1 = backup.Hash2TrieTree(rFile);

        File rFile02 = new File("D:\\Graduate's\\HuaWei_balabala\\ttt04.docx");
        String str= backup.search(rFile,t1,rFile02);

        endTime = System.currentTimeMillis();
        TotalTime = (endTime - startTime)/1000;
        System.out.println("总消耗时间："+TotalTime+"s");

//
//        File sourceFile=new File("D:\\Graduate's\\HuaWei_balabala\\m-2ze6tciolfdoydrr6ze3_data_xvdb.raw.tar.gz");
//        //解压到哪
//        File targetFile = new File("D:\\Graduate's\\HuaWei_balabala\\tar_gz_test");
//        testDeCompressTarGzip tstg = new testDeCompressTarGzip();
//        tstg.test();
    }
}
