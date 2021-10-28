// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CreateReminderRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public CreateReminderRequestDeviceInfo deviceInfo;

    // 服务请求入参
    @NameInMap("Payload")
    public CreateReminderRequestPayload payload;

    // 用户标识信息
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
        // 触发时间的日
        @NameInMap("Day")
        public Integer day;

        // 月循环相关，表示每月的几号的集合,数值范围为1-31
        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        // 周循环相关，表示每周几触发，数值范围为1-7
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        // 结束时间，时间戳毫秒
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

        // 开始时间，时间戳毫秒
        @NameInMap("StartDateTime")
        public Long startDateTime;

        // 触发时间的年
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
        // 提醒内容
        @NameInMap("Content")
        public String content;

        // 设备id
        @NameInMap("DeviceId")
        public String deviceId;

        // 调试标识
        @NameInMap("IsDebug")
        public Boolean isDebug;

        // 提醒调度信息
        @NameInMap("RecurrenceRule")
        public CreateReminderRequestPayloadRecurrenceRule recurrenceRule;

        // 应用id
        @NameInMap("SubjectId")
        public String subjectId;

        // 精灵id
        @NameInMap("UserId")
        public String userId;

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

        public CreateReminderRequestPayload setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
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

        public CreateReminderRequestPayload setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

        public CreateReminderRequestPayload setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateReminderRequestUserInfo extends TeaModel {
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
