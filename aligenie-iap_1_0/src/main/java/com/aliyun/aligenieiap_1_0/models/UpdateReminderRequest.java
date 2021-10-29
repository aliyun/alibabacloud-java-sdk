// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class UpdateReminderRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public UpdateReminderRequestDeviceInfo deviceInfo;

    // 服务请求入参
    @NameInMap("Payload")
    public UpdateReminderRequestPayload payload;

    // 用户标识信息
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
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型 - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
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
        // 触发时间的日
        @NameInMap("Day")
        public Integer day;

        // 月循环相关，表示每月的几号的集合,数值范围为1-31
        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        // 周循环相关，表示每周几触发，数值范围为1-7
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        // 结束时间，时间戳，毫秒
        @NameInMap("EndDateTime")
        public Long endDateTime;

        // 循环类型:支持单次ONCE、每天DAILY、每周WEEKLY、每月MONTHLY
        @NameInMap("Freq")
        public String freq;

        // 触发时间的时
        @NameInMap("Hour")
        public Integer hour;

        // 触发时间的分
        @NameInMap("Minute")
        public Integer minute;

        // 触发时间的月
        @NameInMap("Month")
        public Integer month;

        // 触发时间的秒
        @NameInMap("Second")
        public Integer second;

        // 开始时间，时间戳，毫秒
        @NameInMap("StartDateTime")
        public Long startDateTime;

        // 触发时间的年
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
        // 提醒内容
        @NameInMap("Content")
        public String content;

        // 提醒id
        @NameInMap("Id")
        public Long id;

        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 提醒调度信息
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
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型 - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
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
