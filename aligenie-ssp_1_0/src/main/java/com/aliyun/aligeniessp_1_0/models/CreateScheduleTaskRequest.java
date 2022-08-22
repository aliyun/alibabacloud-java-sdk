// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateScheduleTaskRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public CreateScheduleTaskRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public CreateScheduleTaskRequestPayload payload;

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
        @NameInMap("Hours")
        public java.util.List<Integer> hours;

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
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hours")
        public java.util.List<Integer> hours;

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
        @NameInMap("Once")
        public CreateScheduleTaskRequestPayloadScheduleDTOOnce once;

        @NameInMap("ScheduleEndTime")
        public Long scheduleEndTime;

        @NameInMap("ScheduleStartTime")
        public Long scheduleStartTime;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("StatutoryWorkingDay")
        public CreateScheduleTaskRequestPayloadScheduleDTOStatutoryWorkingDay statutoryWorkingDay;

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
        @NameInMap("ActionDTOs")
        public java.util.List<CreateScheduleTaskRequestPayloadActionDTOs> actionDTOs;

        @NameInMap("IdempotentId")
        public String idempotentId;

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
