// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateFileUploadURLResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateFileUploadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLResponseBody self = new GenerateFileUploadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateFileUploadURLResponseBody setData(GenerateFileUploadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateFileUploadURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateFileUploadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateFileUploadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateFileUploadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateFileUploadURLResponseBodyData extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectStorage")
        public String objectStorage;

        @NameInMap("OssAccessKeyId")
        public String ossAccessKeyId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GenerateFileUploadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateFileUploadURLResponseBodyData self = new GenerateFileUploadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateFileUploadURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateFileUploadURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateFileUploadURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateFileUploadURLResponseBodyData setOssAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        public GenerateFileUploadURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateFileUploadURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
