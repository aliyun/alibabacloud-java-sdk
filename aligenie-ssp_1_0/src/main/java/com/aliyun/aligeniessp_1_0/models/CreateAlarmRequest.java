// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateAlarmRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public CreateAlarmRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public CreateAlarmRequestPayload payload;

    /**
     * <p>User Identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public CreateAlarmRequestUserInfo userInfo;

    public static CreateAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRequest self = new CreateAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRequest setDeviceInfo(CreateAlarmRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CreateAlarmRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CreateAlarmRequest setPayload(CreateAlarmRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public CreateAlarmRequestPayload getPayload() {
        return this.payload;
    }

    public CreateAlarmRequest setUserInfo(CreateAlarmRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateAlarmRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CreateAlarmRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the Skill ID of the application; when the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used in the Android application customer link; SKILL_ID: skill ID, used in the cloud link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-dimension device ID, available only after applying for an organization on the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
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

        public static CreateAlarmRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestDeviceInfo self = new CreateAlarmRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateAlarmRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateAlarmRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAlarmRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateAlarmRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CreateAlarmRequestPayloadMusicInfo extends TeaModel {
        /**
         * <p>Ringtone ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicId")
        public Long musicId;

        /**
         * <p>Ringtone name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx铃声</p>
         */
        @NameInMap("MusicName")
        public String musicName;

        /**
         * <p>Ringtone category ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        /**
         * <p>Ringtone category name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx音乐</p>
         */
        @NameInMap("MusicTypeName")
        public String musicTypeName;

        /**
         * <p>Ringtone URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("MusicUrl")
        public String musicUrl;

        public static CreateAlarmRequestPayloadMusicInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayloadMusicInfo self = new CreateAlarmRequestPayloadMusicInfo();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayloadMusicInfo setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public CreateAlarmRequestPayloadMusicInfo setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public CreateAlarmRequestPayloadMusicInfo setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public CreateAlarmRequestPayloadMusicInfo setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public CreateAlarmRequestPayloadMusicInfo setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

    }

    public static class CreateAlarmRequestPayloadScheduleInfoOnce extends TeaModel {
        /**
         * <p>Trigger Time: Day</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>Trigger Time: Hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger time: Minute</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>Trigger time: Month</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>Trigger time: Year</p>
         * 
         * <strong>example:</strong>
         * <p>2022</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static CreateAlarmRequestPayloadScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayloadScheduleInfoOnce self = new CreateAlarmRequestPayloadScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayloadScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public CreateAlarmRequestPayloadScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateAlarmRequestPayloadScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public CreateAlarmRequestPayloadScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public CreateAlarmRequestPayloadScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay extends TeaModel {
        /**
         * <p>Trigger time: hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger time: minute</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay self = new CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class CreateAlarmRequestPayloadScheduleInfoWeekly extends TeaModel {
        /**
         * <p>Collection of Days of the Week to Trigger</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>Trigger time: hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger Time: Minute</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static CreateAlarmRequestPayloadScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayloadScheduleInfoWeekly self = new CreateAlarmRequestPayloadScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayloadScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreateAlarmRequestPayloadScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateAlarmRequestPayloadScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class CreateAlarmRequestPayloadScheduleInfo extends TeaModel {
        /**
         * <p>One-time: This property is active when the loop type is ONCE.</p>
         */
        @NameInMap("Once")
        public CreateAlarmRequestPayloadScheduleInfoOnce once;

        /**
         * <p>Statutory working day: This property is active when the loop Type is STATUTORY_WORKING_DAY.</p>
         */
        @NameInMap("StatutoryWorkingDay")
        public CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        /**
         * <p>Schedule Type / Loop Type:<br>ONCE -&gt; One-time, WEEKLY -&gt; Weekly loop, STATUTORY_WORKING_DAY -&gt; Statutory working day</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Weekly Loop: This property is active when the loop Type is WEEKLY.</p>
         */
        @NameInMap("Weekly")
        public CreateAlarmRequestPayloadScheduleInfoWeekly weekly;

        public static CreateAlarmRequestPayloadScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayloadScheduleInfo self = new CreateAlarmRequestPayloadScheduleInfo();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayloadScheduleInfo setOnce(CreateAlarmRequestPayloadScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public CreateAlarmRequestPayloadScheduleInfoOnce getOnce() {
            return this.once;
        }

        public CreateAlarmRequestPayloadScheduleInfo setStatutoryWorkingDay(CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay) {
            this.statutoryWorkingDay = statutoryWorkingDay;
            return this;
        }
        public CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        public CreateAlarmRequestPayloadScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAlarmRequestPayloadScheduleInfo setWeekly(CreateAlarmRequestPayloadScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public CreateAlarmRequestPayloadScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class CreateAlarmRequestPayload extends TeaModel {
        /**
         * <p>Ringtone information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MusicInfo")
        public CreateAlarmRequestPayloadMusicInfo musicInfo;

        /**
         * <p>Schedule information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScheduleInfo")
        public CreateAlarmRequestPayloadScheduleInfo scheduleInfo;

        /**
         * <p>Ringtone volume</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static CreateAlarmRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestPayload self = new CreateAlarmRequestPayload();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestPayload setMusicInfo(CreateAlarmRequestPayloadMusicInfo musicInfo) {
            this.musicInfo = musicInfo;
            return this;
        }
        public CreateAlarmRequestPayloadMusicInfo getMusicInfo() {
            return this.musicInfo;
        }

        public CreateAlarmRequestPayload setScheduleInfo(CreateAlarmRequestPayloadScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public CreateAlarmRequestPayloadScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public CreateAlarmRequestPayload setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class CreateAlarmRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding Type. There are multiple ways to obtain the User Identifier for Maojing, and each way corresponds to a different encoding Type: PACKAGE_NAME: APK package name, used for the Android application Customer link; SKILL_ID: Skill ID, used for the cloud link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID: OPEN_ID: default User ID identifier; UNION_ID: organization-dimension User ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateAlarmRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestUserInfo self = new CreateAlarmRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateAlarmRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateAlarmRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAlarmRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateAlarmRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
