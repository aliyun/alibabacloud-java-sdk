// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadResultRequest extends TeaModel {
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
    public java.util.List<ReportUploadResultRequestFileFingerprintDTOList> fileFingerprintDTOList;

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

    public static ReportUploadResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadResultRequest self = new ReportUploadResultRequest();
        return TeaModel.build(map, self);
    }

    public ReportUploadResultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReportUploadResultRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ReportUploadResultRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ReportUploadResultRequest setFileFingerprintDTOList(java.util.List<ReportUploadResultRequestFileFingerprintDTOList> fileFingerprintDTOList) {
        this.fileFingerprintDTOList = fileFingerprintDTOList;
        return this;
    }
    public java.util.List<ReportUploadResultRequestFileFingerprintDTOList> getFileFingerprintDTOList() {
        return this.fileFingerprintDTOList;
    }

    public ReportUploadResultRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public ReportUploadResultRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ReportUploadResultRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ReportUploadResultRequest setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }
    public String getToolVersion() {
        return this.toolVersion;
    }

    public ReportUploadResultRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class ReportUploadResultRequestFileFingerprintDTOList extends TeaModel {
        // 文件hash
        @NameInMap("FileHash")
        public String fileHash;

        // 文件大小
        @NameInMap("FileSize")
        public Long fileSize;

        public static ReportUploadResultRequestFileFingerprintDTOList build(java.util.Map<String, ?> map) throws Exception {
            ReportUploadResultRequestFileFingerprintDTOList self = new ReportUploadResultRequestFileFingerprintDTOList();
            return TeaModel.build(map, self);
        }

        public ReportUploadResultRequestFileFingerprintDTOList setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public ReportUploadResultRequestFileFingerprintDTOList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

}
