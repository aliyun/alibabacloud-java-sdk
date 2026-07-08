// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    /**
     * <p>The status code of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>MobileNumberIllegal</strong>: The mobile number is invalid.</p>
     * </li>
     * <li><p><strong>EncyrptTypeIllegal</strong>: The encryption type is invalid.</p>
     * </li>
     * <li><p><strong>MobileNumberTypeNotMatch</strong>: The mobile number does not match the encryption type.</p>
     * </li>
     * <li><p><strong>CarrierIllegal</strong>: The carrier type is invalid.</p>
     * </li>
     * <li><p><strong>AuthCodeNotExist</strong>: The authorization code does not exist.</p>
     * </li>
     * <li><p><strong>PortabilityNumberNotSupported</strong>: Mobile number portability is not supported.</p>
     * </li>
     * <li><p><strong>Unknown</strong>: An unknown exception occurred.</p>
     * </li>
     * <li><p><strong>AuthCodeAndApiNotMatch</strong>: A system exception occurred.</p>
     * </li>
     * <li><p><strong>AuthCodeAndApiNotMatch</strong>: The AuthCode does not match the API operation.</p>
     * </li>
     * <li><p><strong>RequestFrequencyLimit</strong>: Due to carrier restrictions, repeated high-frequency queries against the same phone number within a short period of time are prohibited. If this error code is returned, try again later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The array of returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<InvalidPhoneNumberFilterResponseBodyData> data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
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
         * <p>The filtering result.</p>
         * <ul>
         * <li><p><strong>YES</strong>: A valid phone number. The mapping relationship is returned.</p>
         * </li>
         * <li><p><strong>NO</strong>: An invalid phone number. The mapping relationship is not returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The encrypted phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1400513****</p>
         */
        @NameInMap("EncryptedNumber")
        public String encryptedNumber;

        /**
         * <p>The expiration time of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-27 16:05:23</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The original phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
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
