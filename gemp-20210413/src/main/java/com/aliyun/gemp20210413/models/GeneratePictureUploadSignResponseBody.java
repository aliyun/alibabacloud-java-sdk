// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureUploadSignResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GeneratePictureUploadSignResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GeneratePictureUploadSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureUploadSignResponseBody self = new GeneratePictureUploadSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneratePictureUploadSignResponseBody setData(GeneratePictureUploadSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneratePictureUploadSignResponseBodyData getData() {
        return this.data;
    }

    public GeneratePictureUploadSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GeneratePictureUploadSignResponseBodyDataFiles extends TeaModel {
        // 文件名称
        @NameInMap("fileName")
        public String fileName;

        // 文件大小
        @NameInMap("fileSize")
        public Long fileSize;

        // 文件类型
        @NameInMap("fileType")
        public String fileType;

        // oss key
        @NameInMap("key")
        public String key;

        public static GeneratePictureUploadSignResponseBodyDataFiles build(java.util.Map<String, ?> map) throws Exception {
            GeneratePictureUploadSignResponseBodyDataFiles self = new GeneratePictureUploadSignResponseBodyDataFiles();
            return TeaModel.build(map, self);
        }

        public GeneratePictureUploadSignResponseBodyDataFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GeneratePictureUploadSignResponseBodyDataFiles setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GeneratePictureUploadSignResponseBodyDataFiles setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GeneratePictureUploadSignResponseBodyDataFiles setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GeneratePictureUploadSignResponseBodyData extends TeaModel {
        // accessKeyId
        @NameInMap("accessKeyId")
        public String accessKeyId;

        // oss bucket name
        @NameInMap("bucketName")
        public String bucketName;

        // files
        @NameInMap("files")
        public java.util.List<GeneratePictureUploadSignResponseBodyDataFiles> files;

        // policy
        @NameInMap("policy")
        public String policy;

        // signature
        @NameInMap("signature")
        public String signature;

        // url
        @NameInMap("url")
        public String url;

        public static GeneratePictureUploadSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneratePictureUploadSignResponseBodyData self = new GeneratePictureUploadSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneratePictureUploadSignResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GeneratePictureUploadSignResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GeneratePictureUploadSignResponseBodyData setFiles(java.util.List<GeneratePictureUploadSignResponseBodyDataFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GeneratePictureUploadSignResponseBodyDataFiles> getFiles() {
            return this.files;
        }

        public GeneratePictureUploadSignResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GeneratePictureUploadSignResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GeneratePictureUploadSignResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
