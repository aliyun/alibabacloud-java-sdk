// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class UpdateReminderRequest extends TeaModel {
    /**
     * <p>Device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public UpdateReminderRequestDeviceInfo deviceInfo;

    /**
     * <p>The input parameters for this service request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public UpdateReminderRequestPayload payload;

    /**
     * <p>User identifier information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public UpdateReminderRequestUserInfo userInfo;

    public static UpdateReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReminderRequest self = new UpdateReminderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReminderRequest setDeviceInfo(UpdateReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public UpdateReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public UpdateReminderRequest setPayload(UpdateReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public UpdateReminderRequestPayload getPayload() {
        return this.payload;
    }

    public UpdateReminderRequest setUserInfo(UpdateReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UpdateReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class UpdateReminderRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <ul>
         * <li>When the encoding type is set to SKILL_ID, the value is the application\&quot;s Skill ID.</li>
         * <li>When the encoding type is set to PACKAGE_NAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used in the Android application customer flow.  </li>
         * <li>SKILL_ID: Skill ID, used in the cloud-based flow.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID.  </p>
         * <ul>
         * <li>OPEN_ID: Default device ID.  </li>
         * <li>UNION_ID: Organization-level device ID. This value is available only after an organization has been registered on the Tmall Genie skill application platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required when <strong>IdType</strong> is set to <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UpdateReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateReminderRequestDeviceInfo self = new UpdateReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UpdateReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UpdateReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UpdateReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class UpdateReminderRequestPayloadRecurrenceRule extends TeaModel {
        /**
         * <p>The date on which the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>Configure monthly reminders, specifying on which day(s) of each month the reminder is triggered.</p>
         */
        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        /**
         * <p>Configure weekly reminders, indicating on which days of the week the reminder is triggered.</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>The expiration time when the reminder ends, in milliseconds as a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1635134700000</p>
         */
        @NameInMap("EndDateTime")
        public Long endDateTime;

        /**
         * <p>Recurrence type:</p>
         * <ul>
         * <li>ONCE: One-time</li>
         * <li>DAILY: Daily</li>
         * <li>WEEKLY: Weekly</li>
         * <li>MONTHLY: Monthly</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("Freq")
        public String freq;

        /**
         * <p>The hour of the time when the reminder is triggered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>The minute of the time when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>The month in which the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The second of the time when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Second")
        public Integer second;

        /**
         * <p>The effective start time of the reminder, in milliseconds as a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1635134400000</p>
         */
        @NameInMap("StartDateTime")
        public Long startDateTime;

        /**
         * <p>The year of the time when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static UpdateReminderRequestPayloadRecurrenceRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateReminderRequestPayloadRecurrenceRule self = new UpdateReminderRequestPayloadRecurrenceRule();
            return TeaModel.build(map, self);
        }

        public UpdateReminderRequestPayloadRecurrenceRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setDaysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }
        public java.util.List<Integer> getDaysOfMonth() {
            return this.daysOfMonth;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setEndDateTime(Long endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public Long getEndDateTime() {
            return this.endDateTime;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setFreq(String freq) {
            this.freq = freq;
            return this;
        }
        public String getFreq() {
            return this.freq;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setStartDateTime(Long startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public Long getStartDateTime() {
            return this.startDateTime;
        }

        public UpdateReminderRequestPayloadRecurrenceRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class UpdateReminderRequestPayload extends TeaModel {
        /**
         * <p>The detailed content of the reminder message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>更新提醒内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the reminder to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20***34</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether this invocation is for debugging.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        /**
         * <p>Scheduling information for the reminder.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RecurrenceRule")
        public UpdateReminderRequestPayloadRecurrenceRule recurrenceRule;

        public static UpdateReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            UpdateReminderRequestPayload self = new UpdateReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public UpdateReminderRequestPayload setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateReminderRequestPayload setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public UpdateReminderRequestPayload setRecurrenceRule(UpdateReminderRequestPayloadRecurrenceRule recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }
        public UpdateReminderRequestPayloadRecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

    }

    public static class UpdateReminderRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.  </p>
         * <ul>
         * <li>When the encoding type is set to SKILL_ID, the value is the application\&quot;s Skill ID.  </li>
         * <li>When the encoding type is set to PACKAGE_NAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used in the Android application customer link.  </li>
         * <li>SKILL_ID: Skill ID, used in the cloud link.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID  </p>
         * <ul>
         * <li>OPEN_ID: The default User ID identifier.  </li>
         * <li>UNION_ID: The organization-dimension User ID identifier. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required when <strong>IdType</strong> is set to <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UpdateReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateReminderRequestUserInfo self = new UpdateReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public UpdateReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UpdateReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UpdateReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UpdateReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
