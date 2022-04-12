// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateUploadTaskRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 应用类型
    @NameInMap("AppType")
    public String appType;

    // 上传的bucket名称
    @NameInMap("BucketName")
    public String bucketName;

    // 环境
    @NameInMap("Env")
    public String env;

    // 游戏链接
    @NameInMap("FileAddress")
    public String fileAddress;

    // 文件大小
    @NameInMap("FileSize")
    public Long fileSize;

    // 上传文件类型
    @NameInMap("FileType")
    public String fileType;

    // 上传进度
    @NameInMap("Progress")
    public Double progress;

    // 上传的bucket所在region
    @NameInMap("Region")
    public String region;

    // 上传状态
    @NameInMap("Status")
    public String status;

    // 上传工具版本
    @NameInMap("UploadToolVersion")
    public String uploadToolVersion;

    // 上传任务类型
    @NameInMap("UploadType")
    public String uploadType;

    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static CreateUploadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadTaskRequest self = new CreateUploadTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateUploadTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateUploadTaskRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateUploadTaskRequest setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
        return this;
    }
    public String getFileAddress() {
        return this.fileAddress;
    }

    public CreateUploadTaskRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public CreateUploadTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateUploadTaskRequest setProgress(Double progress) {
        this.progress = progress;
        return this;
    }
    public Double getProgress() {
        return this.progress;
    }

    public CreateUploadTaskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateUploadTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUploadTaskRequest setUploadToolVersion(String uploadToolVersion) {
        this.uploadToolVersion = uploadToolVersion;
        return this;
    }
    public String getUploadToolVersion() {
        return this.uploadToolVersion;
    }

    public CreateUploadTaskRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public CreateUploadTaskRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
