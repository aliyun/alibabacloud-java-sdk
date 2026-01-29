// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappSyncPhoneNumberResponseBody extends TeaModel {
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
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>None.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The phone numbers.</p>
     */
    @NameInMap("PhoneNumbers")
    public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbers> phoneNumbers;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChatappSyncPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappSyncPhoneNumberResponseBody self = new ChatappSyncPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappSyncPhoneNumberResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public ChatappSyncPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule extends TeaModel {
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

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2359</p>
         */
        @NameInMap("CloseTime")
        public String closeTime;

        /**
         * <strong>example:</strong>
         * <p>MONDAY</p>
         */
        @NameInMap("DayOfWeek")
        public String dayOfWeek;

        /**
         * <strong>example:</strong>
         * <p>0000</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours extends TeaModel {
        @NameInMap("HolidaySchedule")
        public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> holidaySchedule;

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
        public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> weeklyOperatingHours;

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours setHolidaySchedule(java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> holidaySchedule) {
            this.holidaySchedule = holidaySchedule;
            return this;
        }
        public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursHolidaySchedule> getHolidaySchedule() {
            return this.holidaySchedule;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours setTimezoneId(String timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }
        public String getTimezoneId() {
            return this.timezoneId;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours setWeeklyOperatingHours(java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> weeklyOperatingHours) {
            this.weeklyOperatingHours = weeklyOperatingHours;
            return this;
        }
        public java.util.List<ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHoursWeeklyOperatingHours> getWeeklyOperatingHours() {
            return this.weeklyOperatingHours;
        }

    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling extends TeaModel {
        @NameInMap("CallHours")
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours callHours;

        /**
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("CallIconVisibility")
        public String callIconVisibility;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CallbackPermissionStatus")
        public String callbackPermissionStatus;

        /**
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling setCallHours(ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours callHours) {
            this.callHours = callHours;
            return this;
        }
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCallingCallHours getCallHours() {
            return this.callHours;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling setCallIconVisibility(String callIconVisibility) {
            this.callIconVisibility = callIconVisibility;
            return this;
        }
        public String getCallIconVisibility() {
            return this.callIconVisibility;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling setCallbackPermissionStatus(String callbackPermissionStatus) {
            this.callbackPermissionStatus = callbackPermissionStatus;
            return this;
        }
        public String getCallbackPermissionStatus() {
            return this.callbackPermissionStatus;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure extends TeaModel {
        @NameInMap("Calling")
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling calling;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aliyun.com">http://aliyun.com</a></p>
         */
        @NameInMap("CallingCallbackUrl")
        public String callingCallbackUrl;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure setCalling(ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling calling) {
            this.calling = calling;
            return this;
        }
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigureCalling getCalling() {
            return this.calling;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure setCallingCallbackUrl(String callingCallbackUrl) {
            this.callingCallbackUrl = callingCallbackUrl;
            return this;
        }
        public String getCallingCallbackUrl() {
            return this.callingCallbackUrl;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

    }

    public static class ChatappSyncPhoneNumberResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("CallingConfigure")
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure callingConfigure;

        /**
         * <p>The verification state of the phone number.</p>
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
         * 
         * <strong>example:</strong>
         * <p>TIER_10</p>
         */
        @NameInMap("MessagingLimitTier")
        public String messagingLimitTier;

        /**
         * <p>The review status of the business display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Approval</p>
         */
        @NameInMap("NameStatus")
        public String nameStatus;

        /**
         * <p>The review status of the new business display name.</p>
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
         * <p>8613800001234</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The quality rating of the phone number.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RED</li>
         * <li>YELLOW</li>
         * <li>GREEN</li>
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
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibaba.com/status">https://www.alibaba.com/status</a></p>
         */
        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        /**
         * <p>The status report queue.</p>
         * 
         * <strong>example:</strong>
         * <p>alicom-09399200-queue</p>
         */
        @NameInMap("StatusQueue")
        public String statusQueue;

        /**
         * <p>The URL that receives the MO messages.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibaba.com/inbound">https://www.alibaba.com/inbound</a></p>
         */
        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        /**
         * <p>The mobile originated (MO) message queue.</p>
         * 
         * <strong>example:</strong>
         * <p>alicom-09399200-queue</p>
         */
        @NameInMap("UpQueue")
        public String upQueue;

        /**
         * <p>The display name of the business to which the phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("VerifiedName")
        public String verifiedName;

        public static ChatappSyncPhoneNumberResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ChatappSyncPhoneNumberResponseBodyPhoneNumbers self = new ChatappSyncPhoneNumberResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setCallingConfigure(ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure callingConfigure) {
            this.callingConfigure = callingConfigure;
            return this;
        }
        public ChatappSyncPhoneNumberResponseBodyPhoneNumbersCallingConfigure getCallingConfigure() {
            return this.callingConfigure;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setCodeVerificationStatus(String codeVerificationStatus) {
            this.codeVerificationStatus = codeVerificationStatus;
            return this;
        }
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        public ChatappSyncPhoneNumberResponseBodyPhoneNumbers setIsOfficial(String isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }
        public String getIsOfficial() {
            return this.isOfficial;
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
