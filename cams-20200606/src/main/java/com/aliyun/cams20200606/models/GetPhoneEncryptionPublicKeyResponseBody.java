// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneEncryptionPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
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
     * <p>The error message.</p>
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
     * <p>DAC72B08-3327-33EF-BEDC-8EC3E83A6575</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneEncryptionPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneEncryptionPublicKeyResponseBody self = new GetPhoneEncryptionPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneEncryptionPublicKeyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * <p>-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt+PMrYw4zUDEk+VeTrp0\n8LZaoVpiVFErX7iuoDjUs4F9vkxMQuIABjcXw\/swzTMEopLORQV28uqN\/2\/x9hjU\****\/Zwa\/Vk5Svp4\niVY4e22FsJCCWUEMvayO8Q+3UGq0eXXQ+8SlUWEMq1VaJ4pwCLsMnmgybA+VmJxi\nkwIDAQAB\n-----END PUBLIC KEY-----&quot;</p>
         */
        @NameInMap("EncryptionPublicKey")
        public String encryptionPublicKey;

        /**
         * <p>The validity status of the public key. Valid values:</p>
         * <ul>
         * <li><p>MISMATCH: invalid.</p>
         * </li>
         * <li><p>VALID: valid.</p>
         * </li>
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
         * <p>861526377****</p>
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
