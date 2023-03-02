// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.moguan_sdk20210415.models;

import com.aliyun.tea.*;

public class RegisterDeviceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RegisterDeviceResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceResponseBody self = new RegisterDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceResponseBody setData(RegisterDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterDeviceResponseBodyData getData() {
        return this.data;
    }

    public RegisterDeviceResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public RegisterDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterDeviceResponseBodyData extends TeaModel {
        @NameInMap("License")
        public String license;

        @NameInMap("PublicKey")
        public String publicKey;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("Signature")
        public String signature;

        public static RegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceResponseBodyData self = new RegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceResponseBodyData setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public RegisterDeviceResponseBodyData setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public RegisterDeviceResponseBodyData setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public RegisterDeviceResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
