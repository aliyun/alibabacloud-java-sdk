// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateUploadTokenResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenResponseBody self = new GenerateUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenResponseBody setData(GenerateUploadTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateUploadTokenResponseBodyData getData() {
        return this.data;
    }

    public GenerateUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateUploadTokenResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("OssAccessKeyId")
        public String ossAccessKeyId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("ServerURL")
        public String serverURL;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("X-Amz-Algorithm")
        public String xAmzAlgorithm;

        @NameInMap("X-Amz-Credential")
        public String xAmzCredential;

        @NameInMap("X-Amz-Date")
        public String xAmzDate;

        @NameInMap("X-Amz-Signature")
        public String xAmzSignature;

        public static GenerateUploadTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadTokenResponseBodyData self = new GenerateUploadTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateUploadTokenResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateUploadTokenResponseBodyData setOssAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        public GenerateUploadTokenResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateUploadTokenResponseBodyData setServerURL(String serverURL) {
            this.serverURL = serverURL;
            return this;
        }
        public String getServerURL() {
            return this.serverURL;
        }

        public GenerateUploadTokenResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateUploadTokenResponseBodyData setXAmzAlgorithm(String xAmzAlgorithm) {
            this.xAmzAlgorithm = xAmzAlgorithm;
            return this;
        }
        public String getXAmzAlgorithm() {
            return this.xAmzAlgorithm;
        }

        public GenerateUploadTokenResponseBodyData setXAmzCredential(String xAmzCredential) {
            this.xAmzCredential = xAmzCredential;
            return this;
        }
        public String getXAmzCredential() {
            return this.xAmzCredential;
        }

        public GenerateUploadTokenResponseBodyData setXAmzDate(String xAmzDate) {
            this.xAmzDate = xAmzDate;
            return this;
        }
        public String getXAmzDate() {
            return this.xAmzDate;
        }

        public GenerateUploadTokenResponseBodyData setXAmzSignature(String xAmzSignature) {
            this.xAmzSignature = xAmzSignature;
            return this;
        }
        public String getXAmzSignature() {
            return this.xAmzSignature;
        }

    }

}
