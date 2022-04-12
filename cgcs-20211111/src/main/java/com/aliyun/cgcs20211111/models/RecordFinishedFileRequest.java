// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class RecordFinishedFileRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 上传的bucket名称
    @NameInMap("BucketName")
    public String bucketName;

    // 环境
    @NameInMap("Env")
    public String env;

    // 用于pop传入的文件指纹信息
    @NameInMap("FileFingerprintDTOList")
    public java.util.List<RecordFinishedFileRequestFileFingerprintDTOList> fileFingerprintDTOList;

    // 文件大小
    @NameInMap("FileSize")
    public Long fileSize;

    // 上传文件类型
    @NameInMap("FileType")
    public String fileType;

    // 上传的bucket所在region
    @NameInMap("Region")
    public String region;

    // 上传工具版本
    @NameInMap("ToolVersion")
    public String toolVersion;

    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static RecordFinishedFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordFinishedFileRequest self = new RecordFinishedFileRequest();
        return TeaModel.build(map, self);
    }

    public RecordFinishedFileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RecordFinishedFileRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public RecordFinishedFileRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public RecordFinishedFileRequest setFileFingerprintDTOList(java.util.List<RecordFinishedFileRequestFileFingerprintDTOList> fileFingerprintDTOList) {
        this.fileFingerprintDTOList = fileFingerprintDTOList;
        return this;
    }
    public java.util.List<RecordFinishedFileRequestFileFingerprintDTOList> getFileFingerprintDTOList() {
        return this.fileFingerprintDTOList;
    }

    public RecordFinishedFileRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public RecordFinishedFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public RecordFinishedFileRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public RecordFinishedFileRequest setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }
    public String getToolVersion() {
        return this.toolVersion;
    }

    public RecordFinishedFileRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class RecordFinishedFileRequestFileFingerprintDTOList extends TeaModel {
        // 文件hash
        @NameInMap("FileHash")
        public String fileHash;

        // 文件大小
        @NameInMap("FileSize")
        public Long fileSize;

        public static RecordFinishedFileRequestFileFingerprintDTOList build(java.util.Map<String, ?> map) throws Exception {
            RecordFinishedFileRequestFileFingerprintDTOList self = new RecordFinishedFileRequestFileFingerprintDTOList();
            return TeaModel.build(map, self);
        }

        public RecordFinishedFileRequestFileFingerprintDTOList setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public RecordFinishedFileRequestFileFingerprintDTOList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

}
