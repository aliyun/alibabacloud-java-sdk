// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateFileUploadURLResponseData data;

    public static GenerateFileUploadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLResponse self = new GenerateFileUploadURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateFileUploadURLResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateFileUploadURLResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateFileUploadURLResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateFileUploadURLResponse setData(GenerateFileUploadURLResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateFileUploadURLResponseData getData() {
        return this.data;
    }

    public static class GenerateFileUploadURLResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("OssAccessKeyId")
        @Validation(required = true)
        public String ossAccessKeyId;

        @NameInMap("Signature")
        @Validation(required = true)
        public String signature;

        @NameInMap("ObjectStorage")
        @Validation(required = true)
        public String objectStorage;

        public static GenerateFileUploadURLResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateFileUploadURLResponseData self = new GenerateFileUploadURLResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateFileUploadURLResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateFileUploadURLResponseData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateFileUploadURLResponseData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateFileUploadURLResponseData setOssAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        public GenerateFileUploadURLResponseData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateFileUploadURLResponseData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

    }

}
