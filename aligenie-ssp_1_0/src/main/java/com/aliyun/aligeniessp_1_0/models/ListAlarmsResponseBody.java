// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlarmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListAlarmsResponseBodyResult result;

    public static ListAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmsResponseBody self = new ListAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAlarmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmsResponseBody setResult(ListAlarmsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAlarmsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListAlarmsResponseBodyResultModelMusicInfo extends TeaModel {
        @NameInMap("MusicId")
        public Long musicId;

        @NameInMap("MusicName")
        public String musicName;

        @NameInMap("MusicType")
        public Long musicType;

        @NameInMap("MusicTypeName")
        public String musicTypeName;

        @NameInMap("MusicUrl")
        public String musicUrl;

        public static ListAlarmsResponseBodyResultModelMusicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModelMusicInfo self = new ListAlarmsResponseBodyResultModelMusicInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModelMusicInfo setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public ListAlarmsResponseBodyResultModelMusicInfo setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public ListAlarmsResponseBodyResultModelMusicInfo setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public ListAlarmsResponseBodyResultModelMusicInfo setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public ListAlarmsResponseBodyResultModelMusicInfo setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

    }

    public static class ListAlarmsResponseBodyResultModelScheduleInfoOnce extends TeaModel {
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

        public static ListAlarmsResponseBodyResultModelScheduleInfoOnce build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModelScheduleInfoOnce self = new ListAlarmsResponseBodyResultModelScheduleInfoOnce();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoOnce setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoOnce setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoOnce setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoOnce setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoOnce setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay extends TeaModel {
        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        public static ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay self = new ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class ListAlarmsResponseBodyResultModelScheduleInfoWeekly extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        public static ListAlarmsResponseBodyResultModelScheduleInfoWeekly build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModelScheduleInfoWeekly self = new ListAlarmsResponseBodyResultModelScheduleInfoWeekly();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoWeekly setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoWeekly setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfoWeekly setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class ListAlarmsResponseBodyResultModelScheduleInfo extends TeaModel {
        @NameInMap("Once")
        public ListAlarmsResponseBodyResultModelScheduleInfoOnce once;

        @NameInMap("StatutoryWorkingDay")
        public ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay statutoryWorkingDay;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weekly")
        public ListAlarmsResponseBodyResultModelScheduleInfoWeekly weekly;

        public static ListAlarmsResponseBodyResultModelScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModelScheduleInfo self = new ListAlarmsResponseBodyResultModelScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModelScheduleInfo setOnce(ListAlarmsResponseBodyResultModelScheduleInfoOnce once) {
            this.once = once;
            return this;
        }
        public ListAlarmsResponseBodyResultModelScheduleInfoOnce getOnce() {
            return this.once;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfo setStatutoryWorkingDay(ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay statutoryWorkingDay) {
            this.statutoryWorkingDay = statutoryWorkingDay;
            return this;
        }
        public ListAlarmsResponseBodyResultModelScheduleInfoStatutoryWorkingDay getStatutoryWorkingDay() {
            return this.statutoryWorkingDay;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlarmsResponseBodyResultModelScheduleInfo setWeekly(ListAlarmsResponseBodyResultModelScheduleInfoWeekly weekly) {
            this.weekly = weekly;
            return this;
        }
        public ListAlarmsResponseBodyResultModelScheduleInfoWeekly getWeekly() {
            return this.weekly;
        }

    }

    public static class ListAlarmsResponseBodyResultModel extends TeaModel {
        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("MusicInfo")
        public ListAlarmsResponseBodyResultModelMusicInfo musicInfo;

        @NameInMap("ScheduleInfo")
        public ListAlarmsResponseBodyResultModelScheduleInfo scheduleInfo;

        @NameInMap("ScheduleTypeDesc")
        public String scheduleTypeDesc;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TriggerDateDesc")
        public String triggerDateDesc;

        @NameInMap("TriggerTimeDesc")
        public String triggerTimeDesc;

        @NameInMap("Volume")
        public Integer volume;

        public static ListAlarmsResponseBodyResultModel build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResultModel self = new ListAlarmsResponseBodyResultModel();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResultModel setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public ListAlarmsResponseBodyResultModel setMusicInfo(ListAlarmsResponseBodyResultModelMusicInfo musicInfo) {
            this.musicInfo = musicInfo;
            return this;
        }
        public ListAlarmsResponseBodyResultModelMusicInfo getMusicInfo() {
            return this.musicInfo;
        }

        public ListAlarmsResponseBodyResultModel setScheduleInfo(ListAlarmsResponseBodyResultModelScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListAlarmsResponseBodyResultModelScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListAlarmsResponseBodyResultModel setScheduleTypeDesc(String scheduleTypeDesc) {
            this.scheduleTypeDesc = scheduleTypeDesc;
            return this;
        }
        public String getScheduleTypeDesc() {
            return this.scheduleTypeDesc;
        }

        public ListAlarmsResponseBodyResultModel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAlarmsResponseBodyResultModel setTriggerDateDesc(String triggerDateDesc) {
            this.triggerDateDesc = triggerDateDesc;
            return this;
        }
        public String getTriggerDateDesc() {
            return this.triggerDateDesc;
        }

        public ListAlarmsResponseBodyResultModel setTriggerTimeDesc(String triggerTimeDesc) {
            this.triggerTimeDesc = triggerTimeDesc;
            return this;
        }
        public String getTriggerTimeDesc() {
            return this.triggerTimeDesc;
        }

        public ListAlarmsResponseBodyResultModel setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class ListAlarmsResponseBodyResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Model")
        public java.util.List<ListAlarmsResponseBodyResultModel> model;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlarmsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsResponseBodyResult self = new ListAlarmsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAlarmsResponseBodyResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAlarmsResponseBodyResult setModel(java.util.List<ListAlarmsResponseBodyResultModel> model) {
            this.model = model;
            return this;
        }
        public java.util.List<ListAlarmsResponseBodyResultModel> getModel() {
            return this.model;
        }

        public ListAlarmsResponseBodyResult setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListAlarmsResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlarmsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
