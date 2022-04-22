// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<InvalidPhoneNumberFilterResponseBodyData> data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("EncryptedNumber")
        public String encryptedNumber;

        @NameInMap("ExpireTime")
        public String expireTime;

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
