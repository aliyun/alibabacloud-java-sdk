// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberEncryptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PhoneNumberEncryptResponseBodyData> data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("EncryptedNumber")
        public String encryptedNumber;

        @NameInMap("ExpireTime")
        public String expireTime;

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
