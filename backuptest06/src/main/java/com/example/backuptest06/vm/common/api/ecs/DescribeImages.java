package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig ;
import com.google.gson.Gson;
/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.6.0</version>
</dependency>
*/

/**
 * @author
 * @Description  描述ECS镜像
 * @time 202209280:37
 */
public class DescribeImages {
    /**
    * @Description  根据page描述镜像
    * @Author Bluple
    * @Date 1:08
    * @Version
    * @Param [PageNumber, PageSize]
    * @return void
    */
    public  void DescribeImagesByPageNumber(Integer PageNumber,Integer PageSize) {
        IAcsClient client;
        try {
            client = AliyunEcsClientConfig.createClient();
        } catch (Exception e) {
            throw new RuntimeException("无法创建阿里云客户端", e);
        }
        /** use STS Token
         DefaultProfile profile = DefaultProfile.getProfile(
         "<your-region-id>",           // The region ID
         "<your-access-key-id>",       // The AccessKey ID of the RAM account
         "<your-access-key-secret>",   // The AccessKey Secret of the RAM account
         "<your-sts-token>");          // STS Token
         **/
        DescribeImagesRequest request = new DescribeImagesRequest();
        request.setPageNumber(PageNumber);
        request.setPageSize(PageSize);
        try {
            DescribeImagesResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
    /**
    * @Description 根据imageId描述镜像
    * @Author Bluple
    * @Date 1:09
    * @Version
    * @Param [imageId]
    * @return void
    */
    public  DescribeImagesResponse.Image DescribeImagesByImageId(String imageId) {
        IAcsClient client;
        try {
            client = AliyunEcsClientConfig.createClient();
        } catch (Exception e) {
            throw new RuntimeException("无法创建阿里云客户端", e);
        }
        /** use STS Token
         DefaultProfile profile = DefaultProfile.getProfile(
         "<your-region-id>",           // The region ID
         "<your-access-key-id>",       // The AccessKey ID of the RAM account
         "<your-access-key-secret>",   // The AccessKey Secret of the RAM account
         "<your-sts-token>");          // STS Token
         **/
        DescribeImagesRequest request = new DescribeImagesRequest();
        request.setImageId(imageId);
        try {
            DescribeImagesResponse response = client.getAcsResponse(request);
//            DescribeImagesResponse.Image image  = response.getImages().get(0);
            System.out.println("11111111111111111111111111111111111111");
            System.out.println(new Gson().toJson(response));
            return null;

        } catch (ServerException e) {
            e.printStackTrace();
            return null;
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
            return null;
        }


    }

}
