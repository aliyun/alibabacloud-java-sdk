// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelAlarmResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelAlarmResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListHotelAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelAlarmResponseBody self = new ListHotelAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelAlarmResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public ListHotelAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelAlarmResponseBody setResult(java.util.List<ListHotelAlarmResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelAlarmResponseBodyResult> getResult() {
        return this.result;
    }

    public ListHotelAlarmResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListHotelAlarmResponseBodyResultScheduleInfoOnce extends TeaModel {
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

        public static ListHotelAlarmResponseBodyResultScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            ListHotelAlarmResponseBodyResultScheduleInfoOnce self = new ListHotelAlarmResponseBodyResultScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class ListHotelAlarmResponseBodyResultScheduleInfoWeekly extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        public static ListHotelAlarmResponseBodyResultScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            ListHotelAlarmResponseBodyResultScheduleInfoWeekly self = new ListHotelAlarmResponseBodyResultScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class ListHotelAlarmResponseBodyResultScheduleInfo extends TeaModel {
        @NameInMap("Once")
        public ListHotelAlarmResponseBodyResultScheduleInfoOnce once;

        // ONCE, WEEKLY
        @NameInMap("Type")
        public String type;

        @NameInMap("Weekly")
        public ListHotelAlarmResponseBodyResultScheduleInfoWeekly weekly;

        public static ListHotelAlarmResponseBodyResultScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHotelAlarmResponseBodyResultScheduleInfo self = new ListHotelAlarmResponseBodyResultScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListHotelAlarmResponseBodyResultScheduleInfo setOnce(ListHotelAlarmResponseBodyResultScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public ListHotelAlarmResponseBodyResultScheduleInfoOnce getOnce() {
            return this.once;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHotelAlarmResponseBodyResultScheduleInfo setWeekly(ListHotelAlarmResponseBodyResultScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public ListHotelAlarmResponseBodyResultScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class ListHotelAlarmResponseBodyResult extends TeaModel {
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        @NameInMap("ScheduleInfo")
        public ListHotelAlarmResponseBodyResultScheduleInfo scheduleInfo;

        @NameInMap("UserOpenId")
        public String userOpenId;

        public static ListHotelAlarmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelAlarmResponseBodyResult self = new ListHotelAlarmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelAlarmResponseBodyResult setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public ListHotelAlarmResponseBodyResult setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public ListHotelAlarmResponseBodyResult setScheduleInfo(ListHotelAlarmResponseBodyResultScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListHotelAlarmResponseBodyResultScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListHotelAlarmResponseBodyResult setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

}
