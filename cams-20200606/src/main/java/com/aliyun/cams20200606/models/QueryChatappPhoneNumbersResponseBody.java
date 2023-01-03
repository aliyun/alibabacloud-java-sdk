// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A value of OK indicates that the call is successful.
    // *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The list of phone numbers.
    @NameInMap("PhoneNumbers")
    public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbers> phoneNumbers;

    // The ID of the request.
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
        // 号码校验状态。
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        // 号码发送量。
        @NameInMap("MessagingLimitTier")
        public String messagingLimitTier;

        // 名称状态。
        @NameInMap("NameStatus")
        public String nameStatus;

        // 新名称审核状态。
        @NameInMap("NewNameStatus")
        public String newNameStatus;

        // The phone number.
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        // The quality rating of the phone number. Valid values: GREEN, YELLOW, RED, and UNKNOWN.
        @NameInMap("QualityRating")
        public String qualityRating;

        // The status of the phone number. Valid values: PENDING, DELETED, MIGRATED, BANNED, RESTRICTED, RATE_LIMITED, FLAGGED, CONNECTED, DISCONNECTED, UNKNOWN, and UNVERIFIED.
        @NameInMap("Status")
        public String status;

        // The status report notification URL.
        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        // The status report notification queue.
        @NameInMap("StatusQueue")
        public String statusQueue;

        // The MO message notification URL.
        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        // The mobile originated (MO) message notification queue.
        @NameInMap("UpQueue")
        public String upQueue;

        // The name of the company to which the phone number is associated with.
        @NameInMap("VerifiedName")
        public String verifiedName;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbers self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setCodeVerificationStatus(String codeVerificationStatus) {
            this.codeVerificationStatus = codeVerificationStatus;
            return this;
        }
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setMessagingLimitTier(String messagingLimitTier) {
            this.messagingLimitTier = messagingLimitTier;
            return this;
        }
        public String getMessagingLimitTier() {
            return this.messagingLimitTier;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setNameStatus(String nameStatus) {
            this.nameStatus = nameStatus;
            return this;
        }
        public String getNameStatus() {
            return this.nameStatus;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setNewNameStatus(String newNameStatus) {
            this.newNameStatus = newNameStatus;
            return this;
        }
        public String getNewNameStatus() {
            return this.newNameStatus;
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
