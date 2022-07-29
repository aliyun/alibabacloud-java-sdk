// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateAlarmRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public CreateAlarmRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public CreateAlarmRequestPayload payload;

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
        @NameInMap("Hour")
        public Integer hour;

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
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

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
        @NameInMap("Once")
        public CreateAlarmRequestPayloadScheduleInfoOnce once;

        @NameInMap("StatutoryWorkingDay")
        public CreateAlarmRequestPayloadScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("MusicInfo")
        public CreateAlarmRequestPayloadMusicInfo musicInfo;

        @NameInMap("ScheduleInfo")
        public CreateAlarmRequestPayloadScheduleInfo scheduleInfo;

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
