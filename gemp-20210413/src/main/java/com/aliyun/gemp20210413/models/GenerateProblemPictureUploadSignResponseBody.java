// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureUploadSignResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GenerateProblemPictureUploadSignResponseBodyData data;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GenerateProblemPictureUploadSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureUploadSignResponseBody self = new GenerateProblemPictureUploadSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureUploadSignResponseBody setData(GenerateProblemPictureUploadSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateProblemPictureUploadSignResponseBodyData getData() {
        return this.data;
    }

    public GenerateProblemPictureUploadSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateProblemPictureUploadSignResponseBodyData extends TeaModel {
        /**
         * <p>ossaccessKeyId</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <p>oss bucket name</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>oss key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>policy</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>signature</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>url</p>
         */
        @NameInMap("url")
        public String url;

        public static GenerateProblemPictureUploadSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateProblemPictureUploadSignResponseBodyData self = new GenerateProblemPictureUploadSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateProblemPictureUploadSignResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateProblemPictureUploadSignResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GenerateProblemPictureUploadSignResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateProblemPictureUploadSignResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateProblemPictureUploadSignResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateProblemPictureUploadSignResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
