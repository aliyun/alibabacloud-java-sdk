// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UpdateAlarmRequest extends TeaModel {
    /**
     * <p>device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public UpdateAlarmRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public UpdateAlarmRequestPayload payload;

    /**
     * <p>User Identifier Information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public UpdateAlarmRequestUserInfo userInfo;

    public static UpdateAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmRequest self = new UpdateAlarmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmRequest setDeviceInfo(UpdateAlarmRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public UpdateAlarmRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public UpdateAlarmRequest setPayload(UpdateAlarmRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public UpdateAlarmRequestPayload getPayload() {
        return this.payload;
    }

    public UpdateAlarmRequest setUserInfo(UpdateAlarmRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UpdateAlarmRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class UpdateAlarmRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the Skill ID of the application. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used in the Android application customer link; SKILL_ID: skill ID, used in the cloud link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID: OPEN_ID: default device ID; UNION_ID: organization-dimension device ID, available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>organization ID; required if IdType is UNION_ID</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UpdateAlarmRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestDeviceInfo self = new UpdateAlarmRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UpdateAlarmRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UpdateAlarmRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateAlarmRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UpdateAlarmRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class UpdateAlarmRequestPayloadMusicInfo extends TeaModel {
        /**
         * <p>Ringtone ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>12</p>
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
         * <p><a href="http://music-url.mp3">http://music-url.mp3</a></p>
         */
        @NameInMap("MusicUrl")
        public String musicUrl;

        public static UpdateAlarmRequestPayloadMusicInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayloadMusicInfo self = new UpdateAlarmRequestPayloadMusicInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayloadMusicInfo setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public UpdateAlarmRequestPayloadMusicInfo setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public UpdateAlarmRequestPayloadMusicInfo setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public UpdateAlarmRequestPayloadMusicInfo setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public UpdateAlarmRequestPayloadMusicInfo setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

    }

    public static class UpdateAlarmRequestPayloadScheduleInfoOnce extends TeaModel {
        /**
         * <p>Trigger time: day</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Day")
        public Integer day;

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

        public static UpdateAlarmRequestPayloadScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayloadScheduleInfoOnce self = new UpdateAlarmRequestPayloadScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayloadScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public UpdateAlarmRequestPayloadScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateAlarmRequestPayloadScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public UpdateAlarmRequestPayloadScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public UpdateAlarmRequestPayloadScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay extends TeaModel {
        /**
         * <p>Trigger Time: Hour</p>
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

        public static UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay self = new UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class UpdateAlarmRequestPayloadScheduleInfoWeekly extends TeaModel {
        /**
         * <p>Collection of days of the week to trigger: Numeric values between 1 and 7, where each number corresponds to a specific day of the week (1 for Monday, 2 for Tuesday, etc.). To trigger every day, include all values from 1 to 7.</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>Trigger Time: Hour</p>
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

        public static UpdateAlarmRequestPayloadScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayloadScheduleInfoWeekly self = new UpdateAlarmRequestPayloadScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayloadScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public UpdateAlarmRequestPayloadScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateAlarmRequestPayloadScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class UpdateAlarmRequestPayloadScheduleInfo extends TeaModel {
        /**
         * <p>One-time: This property is active when the loop type is ONCE.</p>
         */
        @NameInMap("Once")
        public UpdateAlarmRequestPayloadScheduleInfoOnce once;

        /**
         * <p>Statutory Working Day: This property is active when the loop Type is STATUTORY_WORKING_DAY.</p>
         */
        @NameInMap("StatutoryWorkingDay")
        public UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        /**
         * <p>Schedule Type / Loop Type:<br>ONCE -&gt; One-time, WEEKLY -&gt; Weekly loop, STATUTORY_WORKING_DAY -&gt; Statutory working day</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Weekly loop: This property is active when the loop Type is WEEKLY.</p>
         */
        @NameInMap("Weekly")
        public UpdateAlarmRequestPayloadScheduleInfoWeekly weekly;

        public static UpdateAlarmRequestPayloadScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayloadScheduleInfo self = new UpdateAlarmRequestPayloadScheduleInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayloadScheduleInfo setOnce(UpdateAlarmRequestPayloadScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public UpdateAlarmRequestPayloadScheduleInfoOnce getOnce() {
            return this.once;
        }

        public UpdateAlarmRequestPayloadScheduleInfo setStatutoryWorkingDay(UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay) {
            this.statutoryWorkingDay = statutoryWorkingDay;
            return this;
        }
        public UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        public UpdateAlarmRequestPayloadScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAlarmRequestPayloadScheduleInfo setWeekly(UpdateAlarmRequestPayloadScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public UpdateAlarmRequestPayloadScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class UpdateAlarmRequestPayload extends TeaModel {
        /**
         * <p>Alarm ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <p>Ringtone information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MusicInfo")
        public UpdateAlarmRequestPayloadMusicInfo musicInfo;

        /**
         * <p>Schedule information</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScheduleInfo")
        public UpdateAlarmRequestPayloadScheduleInfo scheduleInfo;

        /**
         * <p>Ringtone volume</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static UpdateAlarmRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestPayload self = new UpdateAlarmRequestPayload();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestPayload setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public UpdateAlarmRequestPayload setMusicInfo(UpdateAlarmRequestPayloadMusicInfo musicInfo) {
            this.musicInfo = musicInfo;
            return this;
        }
        public UpdateAlarmRequestPayloadMusicInfo getMusicInfo() {
            return this.musicInfo;
        }

        public UpdateAlarmRequestPayload setScheduleInfo(UpdateAlarmRequestPayloadScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public UpdateAlarmRequestPayloadScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public UpdateAlarmRequestPayload setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class UpdateAlarmRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. If the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID. If the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding Type: There are multiple ways to obtain the User Identifier for Maojing, and each method corresponds to a different encoding Type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application Customer link  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud link</li>
         * </ul>
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
         * <p>Type of the User ID: - OPEN_ID: default User ID identifier - UNION_ID: organization-dimension User ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform</p>
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

        public static UpdateAlarmRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlarmRequestUserInfo self = new UpdateAlarmRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAlarmRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UpdateAlarmRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UpdateAlarmRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateAlarmRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UpdateAlarmRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
