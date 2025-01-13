// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelAlarmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cf2446fc9d144c85aaee4f9ae20a96e7</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>DOU_YIN</p>
     */
    @NameInMap("MusicType")
    public String musicType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rooms")
    public java.util.List<String> rooms;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScheduleInfo")
    public CreateHotelAlarmRequestScheduleInfo scheduleInfo;

    public static CreateHotelAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelAlarmRequest self = new CreateHotelAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotelAlarmRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public CreateHotelAlarmRequest setMusicType(String musicType) {
        this.musicType = musicType;
        return this;
    }
    public String getMusicType() {
        return this.musicType;
    }

    public CreateHotelAlarmRequest setRooms(java.util.List<String> rooms) {
        this.rooms = rooms;
        return this;
    }
    public java.util.List<String> getRooms() {
        return this.rooms;
    }

    public CreateHotelAlarmRequest setScheduleInfo(CreateHotelAlarmRequestScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }
    public CreateHotelAlarmRequestScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    public static class CreateHotelAlarmRequestScheduleInfoOnce extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <strong>example:</strong>
         * <p>2022</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static CreateHotelAlarmRequestScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            CreateHotelAlarmRequestScheduleInfoOnce self = new CreateHotelAlarmRequestScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public CreateHotelAlarmRequestScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public CreateHotelAlarmRequestScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateHotelAlarmRequestScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public CreateHotelAlarmRequestScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public CreateHotelAlarmRequestScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class CreateHotelAlarmRequestScheduleInfoWeekly extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static CreateHotelAlarmRequestScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            CreateHotelAlarmRequestScheduleInfoWeekly self = new CreateHotelAlarmRequestScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public CreateHotelAlarmRequestScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreateHotelAlarmRequestScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public CreateHotelAlarmRequestScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class CreateHotelAlarmRequestScheduleInfo extends TeaModel {
        @NameInMap("Once")
        public CreateHotelAlarmRequestScheduleInfoOnce once;

        /**
         * <p>ONCE, WEEKLY</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Weekly")
        public CreateHotelAlarmRequestScheduleInfoWeekly weekly;

        public static CreateHotelAlarmRequestScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateHotelAlarmRequestScheduleInfo self = new CreateHotelAlarmRequestScheduleInfo();
            return TeaModel.build(map, self);
        }

        public CreateHotelAlarmRequestScheduleInfo setOnce(CreateHotelAlarmRequestScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public CreateHotelAlarmRequestScheduleInfoOnce getOnce() {
            return this.once;
        }

        public CreateHotelAlarmRequestScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHotelAlarmRequestScheduleInfo setWeekly(CreateHotelAlarmRequestScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public CreateHotelAlarmRequestScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

}
