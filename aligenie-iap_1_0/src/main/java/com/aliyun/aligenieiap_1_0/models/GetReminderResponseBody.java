// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>参数不合法。</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public GetReminderResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("Day")
        public Integer day;

        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>1661598000000</p>
         */
        @NameInMap("EndDateTime")
        public String endDateTime;

        /**
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("Freq")
        public String freq;

        /**
         * <strong>example:</strong>
         * <p>18</p>
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
         * <p>8</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Second")
        public Integer second;

        /**
         * <strong>example:</strong>
         * <p>1630054800000</p>
         */
        @NameInMap("StartDateTime")
        public String startDateTime;

        /**
         * <strong>example:</strong>
         * <p>2021</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>宝宝快去刷牙</p>
         */
        @NameInMap("ActionTopic")
        public String actionTopic;

        /**
         * <strong>example:</strong>
         * <p>每天</p>
         */
        @NameInMap("DayDesc")
        public String dayDesc;

        @NameInMap("RecurrenceRule")
        public GetReminderResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule;

        /**
         * <strong>example:</strong>
         * <p>20*****1</p>
         */
        @NameInMap("RemindId")
        public Long remindId;

        /**
         * <strong>example:</strong>
         * <p>1629850800000</p>
         */
        @NameInMap("RemindTime")
        public String remindTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <strong>example:</strong>
         * <p>周三</p>
         */
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
