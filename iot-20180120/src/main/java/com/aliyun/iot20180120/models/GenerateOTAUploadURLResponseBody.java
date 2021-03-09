// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GenerateOTAUploadURLResponseBodyData data;

    public static GenerateOTAUploadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLResponseBody self = new GenerateOTAUploadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOTAUploadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateOTAUploadURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateOTAUploadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateOTAUploadURLResponseBody setData(GenerateOTAUploadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateOTAUploadURLResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateOTAUploadURLResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("OSSAccessKeyId")
        public String OSSAccessKeyId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("ObjectStorage")
        public String objectStorage;

        public static GenerateOTAUploadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOTAUploadURLResponseBodyData self = new GenerateOTAUploadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateOTAUploadURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateOTAUploadURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateOTAUploadURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateOTAUploadURLResponseBodyData setOSSAccessKeyId(String OSSAccessKeyId) {
            this.OSSAccessKeyId = OSSAccessKeyId;
            return this;
        }
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        public GenerateOTAUploadURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateOTAUploadURLResponseBodyData setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public GenerateOTAUploadURLResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GenerateOTAUploadURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

    }

}
