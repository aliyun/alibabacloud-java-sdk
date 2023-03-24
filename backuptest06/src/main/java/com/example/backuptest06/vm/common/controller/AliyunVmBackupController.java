package com.example.backuptest06.vm.common.controller;

import com.example.backuptest06.vm.common.api.ecs.DescribeImages;
import com.example.backuptest06.vm.common.api.ecs.DownloadImage;
import com.example.backuptest06.vm.common.api.ecs.ExportImage;
import com.example.backuptest06.vm.common.utils.OSSObjectUtils;
import org.springframework.web.bind.annotation.*;
import com.aliyuncs.ecs.model.v20140526.*;


/**
 * @author
 * @Description
 * @time 2022092923:00
 */
@RestController
public class AliyunVmBackupController {
    @GetMapping(value = "/backup/startvmbackup/aliyun")
//    @ApiOperation(value = "虚拟机备份")
    @RequestMapping(value = "/run",method = RequestMethod.POST)
    public static void main(String[] args){
//        DescribeImages describeImages = new DescribeImages();
//        DescribeImagesResponse.Image image =  describeImages.DescribeImagesByImageId("i-2zebx148o1inffl6yyms");
        boolean flag=false;
        long startTime; //程序开始记录时间
        long endTime; //程序结束记录时间
        long TotalTime; //总消耗时间

        ExportImage exportImage = new ExportImage();
        exportImage.startExport("m-2ze2gu2si5vs2n8en5mk","ecs-backup-recovery");
        flag = OSSObjectUtils.isExistObject("ecs-backup-recovery","m-2ze2gu2si5vs2n8en5mk_system.raw.tar.gz");
        startTime = System.currentTimeMillis();
        while(flag){
            flag = OSSObjectUtils.isExistObject("ecs-backup-recovery","m-2ze2gu2si5vs2n8en5mk_system.raw.tar.gz");
        }
        endTime = System.currentTimeMillis();
        TotalTime = endTime - startTime;
        System.out.println("总消耗时间："+TotalTime);
        DownloadImage downloadImage = new DownloadImage();
        downloadImage.startDownload("m-2ze2gu2si5vs2n8en5mk_system.raw.tar.gz");
//        downloadImage.startDownload("test01_m-2ze2gu2si5vs2n8en5mk_system.raw.tar.gz");

    }

    }
