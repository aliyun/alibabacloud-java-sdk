// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelAlarmRequest extends TeaModel {
    @NameInMap("Alarms")
    public java.util.List<UpdateHotelAlarmRequestAlarms> alarms;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ScheduleInfo")
    public UpdateHotelAlarmRequestScheduleInfo scheduleInfo;

    public static UpdateHotelAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelAlarmRequest self = new UpdateHotelAlarmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelAlarmRequest setAlarms(java.util.List<UpdateHotelAlarmRequestAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }
    public java.util.List<UpdateHotelAlarmRequestAlarms> getAlarms() {
        return this.alarms;
    }

    public UpdateHotelAlarmRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelAlarmRequest setScheduleInfo(UpdateHotelAlarmRequestScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }
    public UpdateHotelAlarmRequestScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    public static class UpdateHotelAlarmRequestAlarms extends TeaModel {
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("UserOpenId")
        public String userOpenId;

        public static UpdateHotelAlarmRequestAlarms build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelAlarmRequestAlarms self = new UpdateHotelAlarmRequestAlarms();
            return TeaModel.build(map, self);
        }

        public UpdateHotelAlarmRequestAlarms setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public UpdateHotelAlarmRequestAlarms setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public UpdateHotelAlarmRequestAlarms setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public UpdateHotelAlarmRequestAlarms setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

    public static class UpdateHotelAlarmRequestScheduleInfoOnce extends TeaModel {
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

        public static UpdateHotelAlarmRequestScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelAlarmRequestScheduleInfoOnce self = new UpdateHotelAlarmRequestScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public UpdateHotelAlarmRequestScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public UpdateHotelAlarmRequestScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateHotelAlarmRequestScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public UpdateHotelAlarmRequestScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public UpdateHotelAlarmRequestScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class UpdateHotelAlarmRequestScheduleInfoWeekly extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        public static UpdateHotelAlarmRequestScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelAlarmRequestScheduleInfoWeekly self = new UpdateHotelAlarmRequestScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public UpdateHotelAlarmRequestScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public UpdateHotelAlarmRequestScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public UpdateHotelAlarmRequestScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class UpdateHotelAlarmRequestScheduleInfo extends TeaModel {
        @NameInMap("Once")
        public UpdateHotelAlarmRequestScheduleInfoOnce once;

        // ONCE, WEEKLY
        @NameInMap("Type")
        public String type;

        @NameInMap("Weekly")
        public UpdateHotelAlarmRequestScheduleInfoWeekly weekly;

        public static UpdateHotelAlarmRequestScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelAlarmRequestScheduleInfo self = new UpdateHotelAlarmRequestScheduleInfo();
            return TeaModel.build(map, self);
        }

        public UpdateHotelAlarmRequestScheduleInfo setOnce(UpdateHotelAlarmRequestScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public UpdateHotelAlarmRequestScheduleInfoOnce getOnce() {
            return this.once;
        }

        public UpdateHotelAlarmRequestScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHotelAlarmRequestScheduleInfo setWeekly(UpdateHotelAlarmRequestScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public UpdateHotelAlarmRequestScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

}
