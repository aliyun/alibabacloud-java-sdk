// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureUploadSignResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GeneratePictureUploadSignResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>e2d4306a-bf4d-4345-9ae6-158223c85dbd</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>文件A</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>JPG</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>oss key</p>
         * 
         * <strong>example:</strong>
         * <p>problem/25a2316c-b08d-41a5-9f41-b3185d529277</p>
         */
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
        /**
         * <p>accessKeyId</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI1tEoRVPw8GMy1iLRCno7</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <p>oss bucket name</p>
         * 
         * <strong>example:</strong>
         * <p>gam-objects-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>files</p>
         */
        @NameInMap("files")
        public java.util.List<GeneratePictureUploadSignResponseBodyDataFiles> files;

        /**
         * <p>policy</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMS0wNy0xM1QwNDowOTo0NS4yODJaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwXSxbInN0YXJ0cy13aXRoIiwiJGtleSIsInByb2JsZW0iXV19</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>signature</p>
         * 
         * <strong>example:</strong>
         * <p>SHqvIkwUNQd8Hervklir2K8U+ts=</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gam-objects-bucket.oss-cn-shanghai.aliyuncs.com">https://gam-objects-bucket.oss-cn-shanghai.aliyuncs.com</a></p>
         */
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
