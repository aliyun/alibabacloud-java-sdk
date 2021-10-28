// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderResponseBody extends TeaModel {
    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // 提醒信息
    @NameInMap("Model")
    public GetReminderResponseBodyModel model;

    // 服务成功标识
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
        // 天
        @NameInMap("Day")
        public Integer day;

        // 月的第几天 可用作月循环
        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        // 周循环字段，取值范围：1-7
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        // 调度结束时间
        @NameInMap("EndDateTime")
        public Long endDateTime;

        // 调度类型
        @NameInMap("Freq")
        public String freq;

        // 小时
        @NameInMap("Hour")
        public Integer hour;

        // 分
        @NameInMap("Minute")
        public Integer minute;

        // 月
        @NameInMap("Month")
        public Integer month;

        // 秒
        @NameInMap("Second")
        public Integer second;

        // 调度开始时间
        @NameInMap("StartDateTime")
        public Long startDateTime;

        // 年
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

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setEndDateTime(Long endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public Long getEndDateTime() {
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

        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule setStartDateTime(Long startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public Long getStartDateTime() {
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
        // 执行动作topic
        @NameInMap("ActionTopic")
        public String actionTopic;

        // 触发条件描述
        @NameInMap("DayDesc")
        public String dayDesc;

        // 调度信息
        @NameInMap("RecurrenceRule")
        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule;

        // 提醒id
        @NameInMap("RemindId")
        public Long remindId;

        // 下次提醒时间
        @NameInMap("RemindTime")
        public String remindTime;

        // 重复次数
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        // 触发为周几
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
        // 提醒信息
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
