// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateScheduleTaskRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public CreateScheduleTaskRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public CreateScheduleTaskRequestPayload payload;

    /**
     * <p>User Identifier Information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public CreateScheduleTaskRequestUserInfo userInfo;

    public static CreateScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTaskRequest self = new CreateScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTaskRequest setDeviceInfo(CreateScheduleTaskRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CreateScheduleTaskRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CreateScheduleTaskRequest setPayload(CreateScheduleTaskRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public CreateScheduleTaskRequestPayload getPayload() {
        return this.payload;
    }

    public CreateScheduleTaskRequest setUserInfo(CreateScheduleTaskRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateScheduleTaskRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CreateScheduleTaskRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the SkillID of the application. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client application.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer linkage; SKILL_ID: skill ID, used for cloud linkage.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-level device ID, available only after applying for an organization in the Maojing Skill Application Open Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateScheduleTaskRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestDeviceInfo self = new CreateScheduleTaskRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateScheduleTaskRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateScheduleTaskRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduleTaskRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateScheduleTaskRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CreateScheduleTaskRequestPayloadActionDTOs extends TeaModel {
        /**
         * <p>Vendor-defined command</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:{&quot;key&quot;:1}}</p>
         */
        @NameInMap("customAction")
        public java.util.Map<String, ?> customAction;

        public static CreateScheduleTaskRequestPayloadActionDTOs build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayloadActionDTOs self = new CreateScheduleTaskRequestPayloadActionDTOs();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayloadActionDTOs setCustomAction(java.util.Map<String, ?> customAction) {
            this.customAction = customAction;
            return this;
        }
        public java.util.Map<String, ?> getCustomAction() {
            return this.customAction;
        }

    }

    public static class CreateScheduleTaskRequestPayloadScheduleDTOOnce extends TeaModel {
        /**
         * <p>Trigger day</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>Trigger Hour</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger Minute</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>Trigger Month</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>Trigger Year</p>
         * 
         * <strong>example:</strong>
         * <p>2022</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static CreateScheduleTaskRequestPayloadScheduleDTOOnce build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayloadScheduleDTOOnce self = new CreateScheduleTaskRequestPayloadScheduleDTOOnce();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay extends TeaModel {
        /**
         * <p>Trigger hour; Multiple Choice</p>
         */
        @NameInMap("Hours")
        public java.util.List<Integer> hours;

        /**
         * <p>Trigger minute; Multiple Choice</p>
         */
        @NameInMap("Minutes")
        public java.util.List<Integer> minutes;

        public static CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay self = new CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay setHours(java.util.List<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay setMinutes(java.util.List<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public java.util.List<Integer> getMinutes() {
            return this.minutes;
        }

    }

    public static class CreateScheduleTaskRequestPayloadScheduleDTOWeekly extends TeaModel {
        /**
         * <p>Trigger days of the week, where 1–7 represent Monday through Sunday, respectively</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>Trigger hour</p>
         */
        @NameInMap("Hours")
        public java.util.List<Integer> hours;

        /**
         * <p>Trigger minute</p>
         */
        @NameInMap("Minutes")
        public java.util.List<Integer> minutes;

        public static CreateScheduleTaskRequestPayloadScheduleDTOWeekly build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayloadScheduleDTOWeekly self = new CreateScheduleTaskRequestPayloadScheduleDTOWeekly();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOWeekly setHours(java.util.List<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTOWeekly setMinutes(java.util.List<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public java.util.List<Integer> getMinutes() {
            return this.minutes;
        }

    }

    public static class CreateScheduleTaskRequestPayloadScheduleDTO extends TeaModel {
        /**
         * <p>One-time Scan Configuration</p>
         */
        @NameInMap("Once")
        public CreateScheduleTaskRequestPayloadScheduleDTOOnce once;

        /**
         * <p>Schedule end time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1661589255000</p>
         */
        @NameInMap("ScheduleEndTime")
        public Long scheduleEndTime;

        /**
         * <p>Schedule Start Time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656318855000</p>
         */
        @NameInMap("ScheduleStartTime")
        public Long scheduleStartTime;

        /**
         * <p>Schedule Type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Statutory working day schedule configuration</p>
         */
        @NameInMap("StatutoryWorkingDay")
        public CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay statutoryWorkingDay;

        /**
         * <p>Loop schedule configuration</p>
         */
        @NameInMap("Weekly")
        public CreateScheduleTaskRequestPayloadScheduleDTOWeekly weekly;

        public static CreateScheduleTaskRequestPayloadScheduleDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayloadScheduleDTO self = new CreateScheduleTaskRequestPayloadScheduleDTO();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setOnce(CreateScheduleTaskRequestPayloadScheduleDTOOnce once) {
            this.once = once;
            return this;
        }
        public CreateScheduleTaskRequestPayloadScheduleDTOOnce getOnce() {
            return this.once;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setScheduleEndTime(Long scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }
        public Long getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setScheduleStartTime(Long scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }
        public Long getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setStatutoryWorkingDay(CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay statutoryWorkingDay) {
            this.statutoryWorkingDay = statutoryWorkingDay;
            return this;
        }
        public CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        public CreateScheduleTaskRequestPayloadScheduleDTO setWeekly(CreateScheduleTaskRequestPayloadScheduleDTOWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public CreateScheduleTaskRequestPayloadScheduleDTOWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class CreateScheduleTaskRequestPayload extends TeaModel {
        /**
         * <p>Scheduling action parameters</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ActionDTOs")
        public java.util.List<CreateScheduleTaskRequestPayloadActionDTOs> actionDTOs;

        /**
         * <p>Idempotent ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IdempotentId")
        public String idempotentId;

        /**
         * <p>Scheduling information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScheduleDTO")
        public CreateScheduleTaskRequestPayloadScheduleDTO scheduleDTO;

        public static CreateScheduleTaskRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestPayload self = new CreateScheduleTaskRequestPayload();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestPayload setActionDTOs(java.util.List<CreateScheduleTaskRequestPayloadActionDTOs> actionDTOs) {
            this.actionDTOs = actionDTOs;
            return this;
        }
        public java.util.List<CreateScheduleTaskRequestPayloadActionDTOs> getActionDTOs() {
            return this.actionDTOs;
        }

        public CreateScheduleTaskRequestPayload setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public CreateScheduleTaskRequestPayload setScheduleDTO(CreateScheduleTaskRequestPayloadScheduleDTO scheduleDTO) {
            this.scheduleDTO = scheduleDTO;
            return this;
        }
        public CreateScheduleTaskRequestPayloadScheduleDTO getScheduleDTO() {
            return this.scheduleDTO;
        }

    }

    public static class CreateScheduleTaskRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding Type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer links; SKILL_ID: Skill ID, used for cloud-based links.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID:  </p>
         * <ul>
         * <li>OPEN_ID: The default User ID identity.  </li>
         * <li>UNION_ID: The User ID identity at the organization dimension. This is available only after an organization has been requested on the Maojing Skill Application Open Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID; Required if IdType is UNION_ID</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateScheduleTaskRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleTaskRequestUserInfo self = new CreateScheduleTaskRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateScheduleTaskRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateScheduleTaskRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateScheduleTaskRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduleTaskRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateScheduleTaskRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
