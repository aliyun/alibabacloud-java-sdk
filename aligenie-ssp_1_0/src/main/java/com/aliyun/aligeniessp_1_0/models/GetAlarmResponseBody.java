// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlarmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAlarmResponseBodyResult result;

    public static GetAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmResponseBody self = new GetAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlarmResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlarmResponseBody setResult(GetAlarmResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAlarmResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAlarmResponseBodyResultMusicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicId")
        public Long musicId;

        @NameInMap("MusicName")
        public String musicName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        @NameInMap("MusicTypeName")
        public String musicTypeName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("MusicUrl")
        public String musicUrl;

        public static GetAlarmResponseBodyResultMusicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResultMusicInfo self = new GetAlarmResponseBodyResultMusicInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResultMusicInfo setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public GetAlarmResponseBodyResultMusicInfo setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public GetAlarmResponseBodyResultMusicInfo setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public GetAlarmResponseBodyResultMusicInfo setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public GetAlarmResponseBodyResultMusicInfo setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

    }

    public static class GetAlarmResponseBodyResultScheduleInfoOnce extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <strong>example:</strong>
         * <p>2022</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static GetAlarmResponseBodyResultScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResultScheduleInfoOnce self = new GetAlarmResponseBodyResultScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResultScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public GetAlarmResponseBodyResultScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetAlarmResponseBodyResultScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public GetAlarmResponseBodyResultScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetAlarmResponseBodyResultScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay self = new GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class GetAlarmResponseBodyResultScheduleInfoWeekly extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        public static GetAlarmResponseBodyResultScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResultScheduleInfoWeekly self = new GetAlarmResponseBodyResultScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResultScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public GetAlarmResponseBodyResultScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetAlarmResponseBodyResultScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class GetAlarmResponseBodyResultScheduleInfo extends TeaModel {
        @NameInMap("Once")
        public GetAlarmResponseBodyResultScheduleInfoOnce once;

        @NameInMap("StatutoryWorkingDay")
        public GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        /**
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Weekly")
        public GetAlarmResponseBodyResultScheduleInfoWeekly weekly;

        public static GetAlarmResponseBodyResultScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResultScheduleInfo self = new GetAlarmResponseBodyResultScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResultScheduleInfo setOnce(GetAlarmResponseBodyResultScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public GetAlarmResponseBodyResultScheduleInfoOnce getOnce() {
            return this.once;
        }

        public GetAlarmResponseBodyResultScheduleInfo setStatutoryWorkingDay(GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay statutoryWorkingDay) {
            this.statutoryWorkingDay = statutoryWorkingDay;
            return this;
        }
        public GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        public GetAlarmResponseBodyResultScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlarmResponseBodyResultScheduleInfo setWeekly(GetAlarmResponseBodyResultScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public GetAlarmResponseBodyResultScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class GetAlarmResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("MusicInfo")
        public GetAlarmResponseBodyResultMusicInfo musicInfo;

        @NameInMap("ScheduleInfo")
        public GetAlarmResponseBodyResultScheduleInfo scheduleInfo;

        @NameInMap("ScheduleTypeDesc")
        public String scheduleTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2022-07-29</p>
         */
        @NameInMap("TriggerDateDesc")
        public String triggerDateDesc;

        /**
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("TriggerTimeDesc")
        public String triggerTimeDesc;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetAlarmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmResponseBodyResult self = new GetAlarmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAlarmResponseBodyResult setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public GetAlarmResponseBodyResult setMusicInfo(GetAlarmResponseBodyResultMusicInfo musicInfo) {
            this.musicInfo = musicInfo;
            return this;
        }
        public GetAlarmResponseBodyResultMusicInfo getMusicInfo() {
            return this.musicInfo;
        }

        public GetAlarmResponseBodyResult setScheduleInfo(GetAlarmResponseBodyResultScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetAlarmResponseBodyResultScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetAlarmResponseBodyResult setScheduleTypeDesc(String scheduleTypeDesc) {
            this.scheduleTypeDesc = scheduleTypeDesc;
            return this;
        }
        public String getScheduleTypeDesc() {
            return this.scheduleTypeDesc;
        }

        public GetAlarmResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAlarmResponseBodyResult setTriggerDateDesc(String triggerDateDesc) {
            this.triggerDateDesc = triggerDateDesc;
            return this;
        }
        public String getTriggerDateDesc() {
            return this.triggerDateDesc;
        }

        public GetAlarmResponseBodyResult setTriggerTimeDesc(String triggerTimeDesc) {
            this.triggerTimeDesc = triggerTimeDesc;
            return this;
        }
        public String getTriggerTimeDesc() {
            return this.triggerTimeDesc;
        }

        public GetAlarmResponseBodyResult setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
