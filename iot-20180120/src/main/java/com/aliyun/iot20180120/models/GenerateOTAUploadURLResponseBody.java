// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateOTAUploadURLResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateOTAUploadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLResponseBody self = new GenerateOTAUploadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateOTAUploadURLResponseBody setData(GenerateOTAUploadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateOTAUploadURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateOTAUploadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class GenerateOTAUploadURLResponseBodyData extends TeaModel {
        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        @NameInMap("OSSAccessKeyId")
        public String OSSAccessKeyId;

        @NameInMap("ObjectStorage")
        public String objectStorage;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static GenerateOTAUploadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOTAUploadURLResponseBodyData self = new GenerateOTAUploadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateOTAUploadURLResponseBodyData setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public GenerateOTAUploadURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateOTAUploadURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateOTAUploadURLResponseBodyData setOSSAccessKeyId(String OSSAccessKeyId) {
            this.OSSAccessKeyId = OSSAccessKeyId;
            return this;
        }
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        public GenerateOTAUploadURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateOTAUploadURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateOTAUploadURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateOTAUploadURLResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
