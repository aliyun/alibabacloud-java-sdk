// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateUploadTokenResponseBodyData data;

    public static GenerateUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenResponseBody self = new GenerateUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadTokenResponseBody setData(GenerateUploadTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateUploadTokenResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateUploadTokenResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("ServerURL")
        public String serverURL;

        @NameInMap("OssAccessKeyId")
        public String ossAccessKeyId;

        @NameInMap("Policy")
        public String policy;

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

        public GenerateUploadTokenResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateUploadTokenResponseBodyData setServerURL(String serverURL) {
            this.serverURL = serverURL;
            return this;
        }
        public String getServerURL() {
            return this.serverURL;
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

    }

}
