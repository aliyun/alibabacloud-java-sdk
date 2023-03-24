package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.ExportImageRequest;
import com.aliyuncs.ecs.model.v20140526.ExportImageResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig;
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
 * @Description  导出ECS镜像
 * @time 202209280:39
 */
public class ExportImage {
    public void startExport(String imageId,String oSSBucket){
//        public void startExport(DescribeImagesResponse.Image image){
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
        ExportImageRequest request = new ExportImageRequest();
        request.setImageId(imageId);
        request.setOSSBucket(oSSBucket);

        try {
            ExportImageResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
