// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappSyncPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PhoneNumbers")
    public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbers> phoneNumbers;

    @NameInMap("RequestId")
    public String requestId;

    public static ChatappSyncPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappSyncPhoneNumberResponseBody self = new ChatappSyncPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappSyncPhoneNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappSyncPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappSyncPhoneNumberResponseBody setPhoneNumbers(java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbers> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public ChatappSyncPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        @NameInMap("MessagingLimitTier")
        public String messagingLimitTier;

        @NameInMap("NameStatus")
        public String nameStatus;

        @NameInMap("NewNameStatus")
        public String newNameStatus;

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

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbers self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setCodeVerificationStatus(String codeVerificationStatus) {
            this.codeVerificationStatus = codeVerificationStatus;
            return this;
        }
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setMessagingLimitTier(String messagingLimitTier) {
            this.messagingLimitTier = messagingLimitTier;
            return this;
        }
        public String getMessagingLimitTier() {
            return this.messagingLimitTier;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setNameStatus(String nameStatus) {
            this.nameStatus = nameStatus;
            return this;
        }
        public String getNameStatus() {
            return this.nameStatus;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setNewNameStatus(String newNameStatus) {
            this.newNameStatus = newNameStatus;
            return this;
        }
        public String getNewNameStatus() {
            return this.newNameStatus;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setQualityRating(String qualityRating) {
            this.qualityRating = qualityRating;
            return this;
        }
        public String getQualityRating() {
            return this.qualityRating;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setStatusCallbackUrl(String statusCallbackUrl) {
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setStatusQueue(String statusQueue) {
            this.statusQueue = statusQueue;
            return this;
        }
        public String getStatusQueue() {
            return this.statusQueue;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setUpCallbackUrl(String upCallbackUrl) {
            this.upCallbackUrl = upCallbackUrl;
            return this;
        }
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setUpQueue(String upQueue) {
            this.upQueue = upQueue;
            return this;
        }
        public String getUpQueue() {
            return this.upQueue;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setVerifiedName(String verifiedName) {
            this.verifiedName = verifiedName;
            return this;
        }
        public String getVerifiedName() {
            return this.verifiedName;
        }

    }

}
