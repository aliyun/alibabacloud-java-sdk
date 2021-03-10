// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponse extends TeaModel {
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
    public GenerateOTAUploadURLResponseData data;

    public static GenerateOTAUploadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLResponse self = new GenerateOTAUploadURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOTAUploadURLResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateOTAUploadURLResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateOTAUploadURLResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateOTAUploadURLResponse setData(GenerateOTAUploadURLResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateOTAUploadURLResponseData getData() {
        return this.data;
    }

    public static class GenerateOTAUploadURLResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("OSSAccessKeyId")
        @Validation(required = true)
        public String OSSAccessKeyId;

        @NameInMap("Signature")
        @Validation(required = true)
        public String signature;

        @NameInMap("FirmwareUrl")
        @Validation(required = true)
        public String firmwareUrl;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("ObjectStorage")
        @Validation(required = true)
        public String objectStorage;

        public static GenerateOTAUploadURLResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOTAUploadURLResponseData self = new GenerateOTAUploadURLResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateOTAUploadURLResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateOTAUploadURLResponseData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateOTAUploadURLResponseData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateOTAUploadURLResponseData setOSSAccessKeyId(String OSSAccessKeyId) {
            this.OSSAccessKeyId = OSSAccessKeyId;
            return this;
        }
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        public GenerateOTAUploadURLResponseData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateOTAUploadURLResponseData setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public GenerateOTAUploadURLResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GenerateOTAUploadURLResponseData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

    }

}
