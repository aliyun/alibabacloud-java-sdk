// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public GetReminderResponseBodyModel model;

    @NameInMap("Success")
    public Boolean success;

    public static GetReminderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReminderResponseBody self = new GetReminderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReminderResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetReminderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetReminderResponseBody setModel(GetReminderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetReminderResponseBodyModel getModel() {
        return this.model;
    }

    public GetReminderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetReminderResponseBodyModelRemindResponsesRecurrenceRule extends TeaModel {
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

        public static GetReminderResponseBodyModelRemindResponsesRecurrenceRule build(java.util.Map<String, ?> map) throws Exception {
            GetReminderResponseBodyModelRemindResponsesRecurrenceRule self = new GetReminderResponseBodyModelRemindResponsesRecurrenceRule();
            return TeaModel.build(map, self);
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setDaysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }
        public java.util.List<Integer> getDaysOfMonth() {
            return this.daysOfMonth;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public String getEndDateTime() {
            return this.endDateTime;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setFreq(String freq) {
            this.freq = freq;
            return this;
        }
        public String getFreq() {
            return this.freq;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public String getStartDateTime() {
            return this.startDateTime;
        }

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class GetReminderResponseBodyModelRemindResponses extends TeaModel {
        @NameInMap("ActionTopic")
        public String actionTopic;

        @NameInMap("DayDesc")
        public String dayDesc;

        @NameInMap("RecurrenceRule")
        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("RemindTime")
        public String remindTime;

        @NameInMap("RepeatCount")
        public Integer repeatCount;

        @NameInMap("Week")
        public String week;

        public static GetReminderResponseBodyModelRemindResponses build(java.util.Map<String, ?> map) throws Exception {
            GetReminderResponseBodyModelRemindResponses self = new GetReminderResponseBodyModelRemindResponses();
            return TeaModel.build(map, self);
        }

        public GetReminderResponseBodyModelRemindResponses setActionTopic(String actionTopic) {
            this.actionTopic = actionTopic;
            return this;
        }
        public String getActionTopic() {
            return this.actionTopic;
        }

        public GetReminderResponseBodyModelRemindResponses setDayDesc(String dayDesc) {
            this.dayDesc = dayDesc;
            return this;
        }
        public String getDayDesc() {
            return this.dayDesc;
        }

        public GetReminderResponseBodyModelRemindResponses setRecurrenceRule(GetReminderResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }
        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule getRecurrenceRule() {
            return this.recurrenceRule;
        }

        public GetReminderResponseBodyModelRemindResponses setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetReminderResponseBodyModelRemindResponses setRemindTime(String remindTime) {
            this.remindTime = remindTime;
            return this;
        }
        public String getRemindTime() {
            return this.remindTime;
        }

        public GetReminderResponseBodyModelRemindResponses setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public GetReminderResponseBodyModelRemindResponses setWeek(String week) {
            this.week = week;
            return this;
        }
        public String getWeek() {
            return this.week;
        }

    }

    public static class GetReminderResponseBodyModel extends TeaModel {
        @NameInMap("RemindResponses")
        public java.util.List<GetReminderResponseBodyModelRemindResponses> remindResponses;

        public static GetReminderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetReminderResponseBodyModel self = new GetReminderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetReminderResponseBodyModel setRemindResponses(java.util.List<GetReminderResponseBodyModelRemindResponses> remindResponses) {
            this.remindResponses = remindResponses;
            return this;
        }
        public java.util.List<GetReminderResponseBodyModelRemindResponses> getRemindResponses() {
            return this.remindResponses;
        }

    }

}
