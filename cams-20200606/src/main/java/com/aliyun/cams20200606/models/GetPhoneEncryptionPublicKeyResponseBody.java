// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetPhoneEncryptionPublicKeyResponseBodyData data;

    /**
     * <p>Error description information.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <p>The public key.</p>
         * 
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
         * <p>The validity state of the public key. Valid values:</p>
         * <ul>
         * <li>MISMATCH: The public key is invalid.</li>
         * <li>VALID: The public key is valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("EncryptionPublicKeyStatus")
        public String encryptionPublicKeyStatus;

        /**
         * <p>The phone number.</p>
         * 
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
