// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetOssPropertiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetOssPropertiesResponseBodyResult result;

    public static GetOssPropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssPropertiesResponseBody self = new GetOssPropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssPropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssPropertiesResponseBody setResult(GetOssPropertiesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOssPropertiesResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOssPropertiesResponseBodyResult extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("FolderName")
        public String folderName;

        public static GetOssPropertiesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOssPropertiesResponseBodyResult self = new GetOssPropertiesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOssPropertiesResponseBodyResult setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssPropertiesResponseBodyResult setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetOssPropertiesResponseBodyResult setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetOssPropertiesResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetOssPropertiesResponseBodyResult setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
