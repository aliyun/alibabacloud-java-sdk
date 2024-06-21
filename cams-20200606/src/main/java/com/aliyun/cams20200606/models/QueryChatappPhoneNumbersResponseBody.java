// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of phone numbers.</p>
     */
    @NameInMap("PhoneNumbers")
    public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbers> phoneNumbers;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryChatappPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappPhoneNumbersResponseBody self = new QueryChatappPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChatappPhoneNumbersResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The verification status of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>VERIFIED</p>
         */
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        /**
         * <p>The maximum number of messages that can be sent to users by using the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>TIER_10</p>
         */
        @NameInMap("MessagingLimitTier")
        public String messagingLimitTier;

        /**
         * <p>The status of the business name.</p>
         * 
         * <strong>example:</strong>
         * <p>Approval</p>
         */
        @NameInMap("NameStatus")
        public String nameStatus;

        /**
         * <p>The review status of the new business name.</p>
         * 
         * <strong>example:</strong>
         * <p>Approval</p>
         */
        @NameInMap("NewNameStatus")
        public String newNameStatus;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800000</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The quality rating of the phone number. Valid values:</p>
         * <ul>
         * <li><strong>GREEN</strong></li>
         * <li><strong>YELLOW</strong></li>
         * <li><strong>RED</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GREEN</p>
         */
        @NameInMap("QualityRating")
        public String qualityRating;

        /**
         * <p>The status of the phone number.</p>
         * <ul>
         * <li>PENDING</li>
         * <li>DELETED</li>
         * <li>MIGRATED</li>
         * <li>BANNED</li>
         * <li>RESTRICTED</li>
         * <li>RATE_LIMITED</li>
         * <li>FLAGGED</li>
         * <li>CONNECTED</li>
         * <li>DISCONNECTED</li>
         * <li>UNKNOWN</li>
         * <li>UNVERIFIED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONNECTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ali.com/status">https://ali.com/status</a></p>
         */
        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        /**
         * <p>The status report notification queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicom-Queue-****-ChatAppStatus</p>
         */
        @NameInMap("StatusQueue")
        public String statusQueue;

        /**
         * <p>The callback URL to which MO messages are sent by using HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ali.com/inbound">https://ali.com/inbound</a></p>
         */
        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        /**
         * <p>The mobile originated (MO) message notification queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicom-Queue-****-ChatAppInbound</p>
         */
        @NameInMap("UpQueue")
        public String upQueue;

        /**
         * <p>The name of the company with which the phone number is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
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
