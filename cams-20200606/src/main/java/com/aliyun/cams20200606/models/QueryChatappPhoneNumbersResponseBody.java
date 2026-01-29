// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
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
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The phone numbers.</p>
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

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QueryChatappPhoneNumbersResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
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

    public QueryChatappPhoneNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2359</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>0000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2359</p>
         */
        @NameInMap("CloseTime")
        public String closeTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("DayOfWeek")
        public String dayOfWeek;

        /**
         * <strong>example:</strong>
         * <p>0000</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("CallIconVisibility")
        public String callIconVisibility;

        /**
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("CallbackPermissionStatus")
        public String callbackPermissionStatus;

        @NameInMap("HolidaySchedule")
        public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> holidaySchedule;

        /**
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimezoneId")
        public String timezoneId;

        @NameInMap("WeeklyOperatingHours")
        public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> weeklyOperatingHours;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setCallIconVisibility(String callIconVisibility) {
            this.callIconVisibility = callIconVisibility;
            return this;
        }
        public String getCallIconVisibility() {
            return this.callIconVisibility;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setCallbackPermissionStatus(String callbackPermissionStatus) {
            this.callbackPermissionStatus = callbackPermissionStatus;
            return this;
        }
        public String getCallbackPermissionStatus() {
            return this.callbackPermissionStatus;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setHolidaySchedule(java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> holidaySchedule) {
            this.holidaySchedule = holidaySchedule;
            return this;
        }
        public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> getHolidaySchedule() {
            return this.holidaySchedule;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setTimezoneId(String timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }
        public String getTimezoneId() {
            return this.timezoneId;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours setWeeklyOperatingHours(java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> weeklyOperatingHours) {
            this.weeklyOperatingHours = weeklyOperatingHours;
            return this;
        }
        public java.util.List<QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> getWeeklyOperatingHours() {
            return this.weeklyOperatingHours;
        }

    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling extends TeaModel {
        @NameInMap("CallHours")
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours callHours;

        /**
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling setCallHours(QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours callHours) {
            this.callHours = callHours;
            return this;
        }
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCallingCallHours getCallHours() {
            return this.callHours;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure extends TeaModel {
        @NameInMap("Calling")
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling calling;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("CallingCallbackUrl")
        public String callingCallbackUrl;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        public static QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure self = new QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure();
            return TeaModel.build(map, self);
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure setCalling(QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling calling) {
            this.calling = calling;
            return this;
        }
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigureCalling getCalling() {
            return this.calling;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure setCallingCallbackUrl(String callingCallbackUrl) {
            this.callingCallbackUrl = callingCallbackUrl;
            return this;
        }
        public String getCallingCallbackUrl() {
            return this.callingCallbackUrl;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

    }

    public static class QueryChatappPhoneNumbersResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("CallingConfigure")
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure callingConfigure;

        /**
         * <p>The verification status of the phone number.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>REVOKED: The review application is revoked.</li>
         * <li>MORE_INFORMATION_REQUESTED: More information needs to be provided.</li>
         * <li>VERIFIED: The phone number passes the verification.</li>
         * <li>REJECTED: The phone number fails to pass the verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VERIFIED</p>
         */
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        /**
         * <p>Indicates whether it is a WhatsApp Official Business Account (OBA).</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IsOfficial")
        public String isOfficial;

        /**
         * <p>The number of phone numbers to which messages can be sent in a day.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TIER_100K: 100,000</li>
         * <li>TIER_UNLIMITED: unlimited</li>
         * <li>TIER_250: 250</li>
         * <li>TIER_1K: 1,000</li>
         * <li>TIER_50: 50</li>
         * <li>TIER_10K: 10,000</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIER_10</p>
         */
        @NameInMap("MessagingLimitTier")
        public String messagingLimitTier;

        /**
         * <p>The review status of the name.</p>
         * 
         * <strong>example:</strong>
         * <p>Approval</p>
         */
        @NameInMap("NameStatus")
        public String nameStatus;

        /**
         * <p>The review status of the new display name of the enterprise.</p>
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
         * <p>The quality rating of the phone number.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RED: low</li>
         * <li>YELLOW: medium</li>
         * <li>UNKNOWN: unknown</li>
         * <li>GREEN: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GREEN</p>
         */
        @NameInMap("QualityRating")
        public String qualityRating;

        /**
         * <p>The state of the phone number.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>MIGRATED</li>
         * <li>FLAGGED</li>
         * <li>DISCONNECTED</li>
         * <li>UNVERIFIED</li>
         * <li>BANNED</li>
         * <li>RATE_LIMITED</li>
         * <li>PENDING</li>
         * <li>CONNECTED</li>
         * <li>UNKNOWN</li>
         * <li>DELETED</li>
         * <li>RESTRICTED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONNECTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The URL that receives the status reports.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ali.com/status">https://ali.com/status</a></p>
         */
        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        /**
         * <p>The status report queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicom-Queue-****-ChatAppStatus</p>
         */
        @NameInMap("StatusQueue")
        public String statusQueue;

        /**
         * <p>The URL that receives the MO messages.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ali.com/inbound">https://ali.com/inbound</a></p>
         */
        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        /**
         * <p>The mobile originated (MO) message queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicom-Queue-****-ChatAppInbound</p>
         */
        @NameInMap("UpQueue")
        public String upQueue;

        /**
         * <p>The display name of the enterprise to which the phone number belongs.</p>
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

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setCallingConfigure(QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure callingConfigure) {
            this.callingConfigure = callingConfigure;
            return this;
        }
        public QueryChatappPhoneNumbersResponseBodyPhoneNumbersCallingConfigure getCallingConfigure() {
            return this.callingConfigure;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setCodeVerificationStatus(String codeVerificationStatus) {
            this.codeVerificationStatus = codeVerificationStatus;
            return this;
        }
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        public QueryChatappPhoneNumbersResponseBodyPhoneNumbers setIsOfficial(String isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }
        public String getIsOfficial() {
            return this.isOfficial;
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
