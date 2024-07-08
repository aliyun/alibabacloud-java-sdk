// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberEncryptResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
    public java.util.List<PhoneNumberEncryptResponseBodyData> data;

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

    public static PhoneNumberEncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberEncryptResponseBody self = new PhoneNumberEncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberEncryptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberEncryptResponseBody setData(java.util.List<PhoneNumberEncryptResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PhoneNumberEncryptResponseBodyData> getData() {
        return this.data;
    }

    public PhoneNumberEncryptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberEncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberEncryptResponseBodyData extends TeaModel {
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

        public static PhoneNumberEncryptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberEncryptResponseBodyData self = new PhoneNumberEncryptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberEncryptResponseBodyData setEncryptedNumber(String encryptedNumber) {
            this.encryptedNumber = encryptedNumber;
            return this;
        }
        public String getEncryptedNumber() {
            return this.encryptedNumber;
        }

        public PhoneNumberEncryptResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public PhoneNumberEncryptResponseBodyData setOriginalNumber(String originalNumber) {
            this.originalNumber = originalNumber;
            return this;
        }
        public String getOriginalNumber() {
            return this.originalNumber;
        }

    }

}
