// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPhoneEncryptionPublicKeyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneEncryptionPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneEncryptionPublicKeyResponseBody self = new GetPhoneEncryptionPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneEncryptionPublicKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhoneEncryptionPublicKeyResponseBody setData(GetPhoneEncryptionPublicKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhoneEncryptionPublicKeyResponseBodyData getData() {
        return this.data;
    }

    public GetPhoneEncryptionPublicKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhoneEncryptionPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhoneEncryptionPublicKeyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-----BEGIN PUBLIC KEY-----
         * AAA
         * BBB
         * CCC
         * DDD
         * EEE
         * FFF
         * GGG
         * -----END PUBLIC KEY-----</p>
         */
        @NameInMap("EncryptionPublicKey")
        public String encryptionPublicKey;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("EncryptionPublicKeyStatus")
        public String encryptionPublicKeyStatus;

        /**
         * <strong>example:</strong>
         * <p>86138000**</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static GetPhoneEncryptionPublicKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneEncryptionPublicKeyResponseBodyData self = new GetPhoneEncryptionPublicKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhoneEncryptionPublicKeyResponseBodyData setEncryptionPublicKey(String encryptionPublicKey) {
            this.encryptionPublicKey = encryptionPublicKey;
            return this;
        }
        public String getEncryptionPublicKey() {
            return this.encryptionPublicKey;
        }

        public GetPhoneEncryptionPublicKeyResponseBodyData setEncryptionPublicKeyStatus(String encryptionPublicKeyStatus) {
            this.encryptionPublicKeyStatus = encryptionPublicKeyStatus;
            return this;
        }
        public String getEncryptionPublicKeyStatus() {
            return this.encryptionPublicKeyStatus;
        }

        public GetPhoneEncryptionPublicKeyResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
