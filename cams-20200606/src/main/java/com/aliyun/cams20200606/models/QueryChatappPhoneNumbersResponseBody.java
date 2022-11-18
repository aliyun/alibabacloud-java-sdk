// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PhoneNumbers")
    public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbers> phoneNumbers;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryChatappPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappPhoneNumbersResponseBody self = new QueryChatappPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChatappPhoneNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryChatappPhoneNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryChatappPhoneNumbersResponseBody setPhoneNumbers(java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbers> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public QueryChatappPhoneNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("QualityRating")
        public String qualityRating;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        @NameInMap("StatusQueue")
        public String statusQueue;

        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        @NameInMap("UpQueue")
        public String upQueue;

        @NameInMap("VerifiedName")
        public String verifiedName;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbers self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setQualityRating(String qualityRating) {
            this.qualityRating = qualityRating;
            return this;
        }
        public String getQualityRating() {
            return this.qualityRating;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setStatusCallbackUrl(String statusCallbackUrl) {
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setStatusQueue(String statusQueue) {
            this.statusQueue = statusQueue;
            return this;
        }
        public String getStatusQueue() {
            return this.statusQueue;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setUpCallbackUrl(String upCallbackUrl) {
            this.upCallbackUrl = upCallbackUrl;
            return this;
        }
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setUpQueue(String upQueue) {
            this.upQueue = upQueue;
            return this;
        }
        public String getUpQueue() {
            return this.upQueue;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setVerifiedName(String verifiedName) {
            this.verifiedName = verifiedName;
            return this;
        }
        public String getVerifiedName() {
            return this.verifiedName;
        }

    }

}
