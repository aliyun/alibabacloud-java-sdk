// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaFileOSSPropertiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult result;

    public static DescribeBlockchainSchemaFileOSSPropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaFileOSSPropertiesResponseBody self = new DescribeBlockchainSchemaFileOSSPropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaFileOSSPropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainSchemaFileOSSPropertiesResponseBody setResult(DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult extends TeaModel {
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

        public static DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult self = new DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeBlockchainSchemaFileOSSPropertiesResponseBodyResult setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
