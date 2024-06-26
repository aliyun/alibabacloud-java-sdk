// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOssPropertiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeOssPropertiesResponseBodyResult result;

    public static DescribeOssPropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssPropertiesResponseBody self = new DescribeOssPropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssPropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssPropertiesResponseBody setResult(DescribeOssPropertiesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeOssPropertiesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeOssPropertiesResponseBodyResult extends TeaModel {
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

        public static DescribeOssPropertiesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssPropertiesResponseBodyResult self = new DescribeOssPropertiesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOssPropertiesResponseBodyResult setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeOssPropertiesResponseBodyResult setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeOssPropertiesResponseBodyResult setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssPropertiesResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeOssPropertiesResponseBodyResult setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
