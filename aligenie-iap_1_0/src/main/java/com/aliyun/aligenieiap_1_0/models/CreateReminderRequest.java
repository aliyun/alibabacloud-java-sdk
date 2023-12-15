// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CreateReminderRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public CreateReminderRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public CreateReminderRequestPayload payload;

    @NameInMap("UserInfo")
    public CreateReminderRequestUserInfo userInfo;

    public static CreateReminderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReminderRequest self = new CreateReminderRequest();
        return TeaModel.build(map, self);
    }

    public CreateReminderRequest setDeviceInfo(CreateReminderRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CreateReminderRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CreateReminderRequest setPayload(CreateReminderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public CreateReminderRequestPayload getPayload() {
        return this.payload;
    }

    public CreateReminderRequest setUserInfo(CreateReminderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateReminderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CreateReminderRequestDeviceInfo extends TeaModel {
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

        public static CreateReminderRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateReminderRequestDeviceInfo self = new CreateReminderRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateReminderRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateReminderRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateReminderRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateReminderRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateReminderRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CreateReminderRequestPayloadRecurrenceRule extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("EndDateTime")
        public Long endDateTime;

        @NameInMap("Freq")
        public String freq;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        @NameInMap("Month")
        public Integer month;

        @NameInMap("Second")
        public Integer second;

        @NameInMap("StartDateTime")
        public Long startDateTime;

        @NameInMap("Year")
        public Integer year;

        public static CreateReminderRequestPayloadRecurrenceRule build(java.util.Map<String, ?> map) throws Exception {
            CreateReminderRequestPayloadRecurrenceRule self = new CreateReminderRequestPayloadRecurrenceRule();
            return TeaModel.build(map, self);
        }

        public CreateReminderRequestPayloadRecurrenceRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public CreateReminderRequestPayloadRecurrenceRule setDaysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }
        public java.util.List<Integer> getDaysOfMonth() {
            return this.daysOfMonth;
        }

        public CreateReminderRequestPayloadRecurrenceRule setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreateReminderRequestPayloadRecurrenceRule setEndDateTime(Long endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public Long getEndDateTime() {
            return this.endDateTime;
        }

        public CreateReminderRequestPayloadRecurrenceRule setFreq(String freq) {
            this.freq = freq;
            return this;
        }
        public String getFreq() {
            return this.freq;
        }

        public CreateReminderRequestPayloadRecurrenceRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateReminderRequestPayloadRecurrenceRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public CreateReminderRequestPayloadRecurrenceRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public CreateReminderRequestPayloadRecurrenceRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public CreateReminderRequestPayloadRecurrenceRule setStartDateTime(Long startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public Long getStartDateTime() {
            return this.startDateTime;
        }

        public CreateReminderRequestPayloadRecurrenceRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class CreateReminderRequestPayload extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("IsDebug")
        public Boolean isDebug;

        @NameInMap("RecurrenceRule")
        public CreateReminderRequestPayloadRecurrenceRule recurrenceRule;

        public static CreateReminderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            CreateReminderRequestPayload self = new CreateReminderRequestPayload();
            return TeaModel.build(map, self);
        }

        public CreateReminderRequestPayload setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateReminderRequestPayload setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public CreateReminderRequestPayload setRecurrenceRule(CreateReminderRequestPayloadRecurrenceRule recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }
        public CreateReminderRequestPayloadRecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

    }

    public static class CreateReminderRequestUserInfo extends TeaModel {
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

        public static CreateReminderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateReminderRequestUserInfo self = new CreateReminderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateReminderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreateReminderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreateReminderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateReminderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreateReminderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
