// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>MobileNumberIllegal</strong>: The phone number is invalid.</li>
     * <li><strong>EncyrptTypeIllegal</strong>: The encryption type is invalid.</li>
     * <li><strong>MobileNumberTypeNotMatch</strong>: The phone number does not match the encryption type.</li>
     * <li><strong>CarrierIllegal</strong>: The carrier type is invalid.</li>
     * <li><strong>AuthCodeNotExist</strong>: The authorization code does not exist.</li>
     * <li><strong>PortabilityNumberNotSupported</strong>: Mobile number portability is not supported.</li>
     * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
     * <li><strong>AuthCodeAndApiNotMatch</strong>: A system exception occurred.</li>
     * <li><strong>AuthCodeAndApiNotMatch</strong>: The authorization code does not match the API operation.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
         * <p>The returned filter results.</p>
         * <ul>
         * <li><strong>YES</strong>: the valid phone number. The mappings are returned.</li>
         * <li><strong>NO</strong>: the invalid phone number. No mappings are returned.</li>
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
         * <p>The time when the phone number expires.</p>
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
