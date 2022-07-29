// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UpdateAlarmRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public UpdateAlarmRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public UpdateAlarmRequestPayload payload;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
        @NameInMap("MusicId")
        public Long musicId;

        @NameInMap("MusicName")
        public String musicName;

        @NameInMap("MusicType")
        public Long musicType;

        @NameInMap("MusicTypeName")
        public String musicTypeName;

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
        @NameInMap("Day")
        public Integer day;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        @NameInMap("Month")
        public Integer month;

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
        @NameInMap("Hour")
        public Integer hour;

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
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

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
        @NameInMap("Once")
        public UpdateAlarmRequestPayloadScheduleInfoOnce once;

        @NameInMap("StatutoryWorkingDay")
        public UpdateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("MusicInfo")
        public UpdateAlarmRequestPayloadMusicInfo musicInfo;

        @NameInMap("ScheduleInfo")
        public UpdateAlarmRequestPayloadScheduleInfo scheduleInfo;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
