// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public ListRemindersResponseBodyModel model;

    @NameInMap("Success")
    public Boolean success;

    public static ListRemindersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersResponseBody self = new ListRemindersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemindersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListRemindersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListRemindersResponseBody setModel(ListRemindersResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ListRemindersResponseBodyModel getModel() {
        return this.model;
    }

    public ListRemindersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRemindersResponseBodyModelRemindResponsesRecurrenceRule extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("EndDateTime")
        public String endDateTime;

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
        public String startDateTime;

        @NameInMap("Year")
        public Integer year;

        public static ListRemindersResponseBodyModelRemindResponsesRecurrenceRule build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersResponseBodyModelRemindResponsesRecurrenceRule self = new ListRemindersResponseBodyModelRemindResponsesRecurrenceRule();
            return TeaModel.build(map, self);
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setDaysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }
        public java.util.List<Integer> getDaysOfMonth() {
            return this.daysOfMonth;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public String getEndDateTime() {
            return this.endDateTime;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setFreq(String freq) {
            this.freq = freq;
            return this;
        }
        public String getFreq() {
            return this.freq;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public String getStartDateTime() {
            return this.startDateTime;
        }

        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class ListRemindersResponseBodyModelRemindResponses extends TeaModel {
        @NameInMap("ActionTopic")
        public String actionTopic;

        @NameInMap("DayDesc")
        public String dayDesc;

        @NameInMap("RecurrenceRule")
        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("RemindTime")
        public String remindTime;

        @NameInMap("RepeatCount")
        public Integer repeatCount;

        @NameInMap("Week")
        public String week;

        public static ListRemindersResponseBodyModelRemindResponses build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersResponseBodyModelRemindResponses self = new ListRemindersResponseBodyModelRemindResponses();
            return TeaModel.build(map, self);
        }

        public ListRemindersResponseBodyModelRemindResponses setActionTopic(String actionTopic) {
            this.actionTopic = actionTopic;
            return this;
        }
        public String getActionTopic() {
            return this.actionTopic;
        }

        public ListRemindersResponseBodyModelRemindResponses setDayDesc(String dayDesc) {
            this.dayDesc = dayDesc;
            return this;
        }
        public String getDayDesc() {
            return this.dayDesc;
        }

        public ListRemindersResponseBodyModelRemindResponses setRecurrenceRule(ListRemindersResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }
        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

        public ListRemindersResponseBodyModelRemindResponses setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListRemindersResponseBodyModelRemindResponses setRemindTime(String remindTime) {
            this.remindTime = remindTime;
            return this;
        }
        public String getRemindTime() {
            return this.remindTime;
        }

        public ListRemindersResponseBodyModelRemindResponses setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public ListRemindersResponseBodyModelRemindResponses setWeek(String week) {
            this.week = week;
            return this;
        }
        public String getWeek() {
            return this.week;
        }

    }

    public static class ListRemindersResponseBodyModel extends TeaModel {
        @NameInMap("RemindResponses")
        public java.util.List<ListRemindersResponseBodyModelRemindResponses> remindResponses;

        public static ListRemindersResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListRemindersResponseBodyModel self = new ListRemindersResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListRemindersResponseBodyModel setRemindResponses(java.util.List<ListRemindersResponseBodyModelRemindResponses> remindResponses) {
            this.remindResponses = remindResponses;
            return this;
        }
        public java.util.List<ListRemindersResponseBodyModelRemindResponses> getRemindResponses() {
            return this.remindResponses;
        }

    }

}
