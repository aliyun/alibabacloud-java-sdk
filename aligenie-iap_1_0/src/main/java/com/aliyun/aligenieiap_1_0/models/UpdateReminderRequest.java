// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class UpdateReminderRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public UpdateReminderRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public UpdateReminderRequestPayload payload;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDebug")
        public Boolean isDebug;

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
