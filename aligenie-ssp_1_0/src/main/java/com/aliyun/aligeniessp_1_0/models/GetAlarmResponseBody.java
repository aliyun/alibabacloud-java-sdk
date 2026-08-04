// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlarmResponseBody extends TeaModel {
    /**
     * <p>Status code returned by the alarm service</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>id为空</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Alarm details</p>
     */
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
         * <p>Ringtone ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicId")
        public Long musicId;

        /**
         * <p>Ringtone Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx铃声</p>
         */
        @NameInMap("MusicName")
        public String musicName;

        /**
         * <p>Ringtone Category ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        /**
         * <p>Ringtone Category Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx音乐</p>
         */
        @NameInMap("MusicTypeName")
        public String musicTypeName;

        /**
         * <p>Ringtone URL</p>
         * 
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
         * <p>Trigger time: Day</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>Trigger Time: Hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger Time: Minute</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>Trigger Time: Month</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>Trigger Time: Year</p>
         * 
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
         * <p>Trigger Time: Hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger Time: Minute</p>
         * 
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
        /**
         * <p>Collection of days of the week to trigger: Numeric values between 1 and 7, where each number corresponds to a specific day of the week. If triggered every day, include all numbers.</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>Trigger time: Hour</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>Trigger time: Minute</p>
         * 
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
        /**
         * <p>One-time: This property is active when the loop type is ONCE.</p>
         */
        @NameInMap("Once")
        public GetAlarmResponseBodyResultScheduleInfoOnce once;

        /**
         * <p>Statutory working day: This property is active when the loop Type is STATUTORYWORKINGDAY.</p>
         */
        @NameInMap("StatutoryWorkingDay")
        public GetAlarmResponseBodyResultScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        /**
         * <p>Schedule Type / Loop Type: ONCE -&gt; One-time, WEEKLY -&gt; Weekly loop, STATUTORYWORKINGDAY -&gt; Statutory working day</p>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Weekly loop: This property is active when the loop Type is WEEKLY.</p>
         */
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
         * <p>Alarm ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <p>Ringtone Information</p>
         */
        @NameInMap("MusicInfo")
        public GetAlarmResponseBodyResultMusicInfo musicInfo;

        /**
         * <p>Schedule Information</p>
         */
        @NameInMap("ScheduleInfo")
        public GetAlarmResponseBodyResultScheduleInfo scheduleInfo;

        /**
         * <p>Chinese description of the loop type</p>
         * 
         * <strong>example:</strong>
         * <p>单次</p>
         */
        @NameInMap("ScheduleTypeDesc")
        public String scheduleTypeDesc;

        /**
         * <p>status: 0 Normal, 1 deleted, 2 shutdown</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Trigger date description (one-time)</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-29</p>
         */
        @NameInMap("TriggerDateDesc")
        public String triggerDateDesc;

        /**
         * <p>Trigger time description</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("TriggerTimeDesc")
        public String triggerTimeDesc;

        /**
         * <p>Ringtone volume</p>
         * 
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
