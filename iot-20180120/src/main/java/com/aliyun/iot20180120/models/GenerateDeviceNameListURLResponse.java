// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateDeviceNameListURLResponse extends TeaModel {
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
    public GenerateDeviceNameListURLResponseData data;

    public static GenerateDeviceNameListURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceNameListURLResponse self = new GenerateDeviceNameListURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceNameListURLResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDeviceNameListURLResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateDeviceNameListURLResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateDeviceNameListURLResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateDeviceNameListURLResponse setData(GenerateDeviceNameListURLResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateDeviceNameListURLResponseData getData() {
        return this.data;
    }

    public static class GenerateDeviceNameListURLResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("Signature")
        @Validation(required = true)
        public String signature;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("ObjectStorage")
        @Validation(required = true)
        public String objectStorage;

        public static GenerateDeviceNameListURLResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDeviceNameListURLResponseData self = new GenerateDeviceNameListURLResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateDeviceNameListURLResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateDeviceNameListURLResponseData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateDeviceNameListURLResponseData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateDeviceNameListURLResponseData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateDeviceNameListURLResponseData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateDeviceNameListURLResponseData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GenerateDeviceNameListURLResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GenerateDeviceNameListURLResponseData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

    }

}
