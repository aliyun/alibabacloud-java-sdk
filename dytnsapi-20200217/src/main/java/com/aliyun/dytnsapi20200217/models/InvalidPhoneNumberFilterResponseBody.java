// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **MobileNumberIllegal**: The phone number is invalid.</p>
     * <p>*   **EncyrptTypeIllegal**: The encryption type is invalid.</p>
     * <p>*   **MobileNumberTypeNotMatch**: The phone number does not match the encryption type.</p>
     * <p>*   **CarrierIllegal**: The carrier type is invalid.</p>
     * <p>*   **AuthCodeNotExist**: The authorization code does not exist.</p>
     * <p>*   **PortabilityNumberNotSupported**: Mobile number portability is not supported.</p>
     * <p>*   **Unknown**: An unknown exception occurred.</p>
     * <p>*   **AuthCodeAndApiNotMatch**: A system exception occurred.</p>
     * <p>*   **AuthCodeAndApiNotMatch**: The authorization code does not match the API operation.</p>
     * <p>*   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Details about the returned entries.</p>
     */
    @NameInMap("Data")
    public java.util.List<InvalidPhoneNumberFilterResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InvalidPhoneNumberFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvalidPhoneNumberFilterResponseBody self = new InvalidPhoneNumberFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public InvalidPhoneNumberFilterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvalidPhoneNumberFilterResponseBody setData(java.util.List<InvalidPhoneNumberFilterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<InvalidPhoneNumberFilterResponseBodyData> getData() {
        return this.data;
    }

    public InvalidPhoneNumberFilterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvalidPhoneNumberFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvalidPhoneNumberFilterResponseBodyData extends TeaModel {
        /**
         * <p>The returned filter results.</p>
         * <br>
         * <p>*   **YES**: the valid phone number. The mappings are returned.</p>
         * <p>*   **NO**: the invalid phone number. No mappings are returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The encrypted phone number.</p>
         */
        @NameInMap("EncryptedNumber")
        public String encryptedNumber;

        /**
         * <p>The time when the phone number expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The original phone number.</p>
         */
        @NameInMap("OriginalNumber")
        public String originalNumber;

        public static InvalidPhoneNumberFilterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvalidPhoneNumberFilterResponseBodyData self = new InvalidPhoneNumberFilterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvalidPhoneNumberFilterResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public InvalidPhoneNumberFilterResponseBodyData setEncryptedNumber(String encryptedNumber) {
            this.encryptedNumber = encryptedNumber;
            return this;
        }
        public String getEncryptedNumber() {
            return this.encryptedNumber;
        }

        public InvalidPhoneNumberFilterResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public InvalidPhoneNumberFilterResponseBodyData setOriginalNumber(String originalNumber) {
            this.originalNumber = originalNumber;
            return this;
        }
        public String getOriginalNumber() {
            return this.originalNumber;
        }

    }

}
