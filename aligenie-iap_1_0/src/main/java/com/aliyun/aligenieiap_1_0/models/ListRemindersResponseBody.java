// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>Detailed description of the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>参数不合法。</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Reminder information.</p>
     */
    @NameInMap("Model")
    public ListRemindersResponseBodyModel model;

    /**
     * <p>Indicates the result of the API call. true indicates success, and false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The date on which the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>Information for monthly reminders.</p>
         */
        @NameInMap("DaysOfMonth")
        public java.util.List<Integer> daysOfMonth;

        /**
         * <p>Information for weekly reminders.</p>
         */
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <p>The end time when the reminder becomes inactive.</p>
         * 
         * <strong>example:</strong>
         * <p>1661598000000</p>
         */
        @NameInMap("EndDateTime")
        public String endDateTime;

        /**
         * <p>The recurrence epoch of the reminder.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("Freq")
        public String freq;

        /**
         * <p>The hour of the time when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>The minute of the hour when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>The month when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The second of the time when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Second")
        public Integer second;

        /**
         * <p>The start time when the reminder becomes effective.</p>
         * 
         * <strong>example:</strong>
         * <p>1630054800000</p>
         */
        @NameInMap("StartDateTime")
        public String startDateTime;

        /**
         * <p>The year when the reminder is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021</p>
         */
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
        /**
         * <p>The topic of the action executed by the reminder.</p>
         * 
         * <strong>example:</strong>
         * <p>宝宝快去刷牙</p>
         */
        @NameInMap("ActionTopic")
        public String actionTopic;

        /**
         * <p>Description of the trigger condition for the reminder.</p>
         * 
         * <strong>example:</strong>
         * <p>每天</p>
         */
        @NameInMap("DayDesc")
        public String dayDesc;

        /**
         * <p>The schedule information list, which contains detailed timing information for the reminder.</p>
         */
        @NameInMap("RecurrenceRule")
        public ListRemindersResponseBodyModelRemindResponsesRecurrenceRule recurrenceRule;

        /**
         * <p>The ID of the reminder message.</p>
         * 
         * <strong>example:</strong>
         * <p>20****1</p>
         */
        @NameInMap("RemindId")
        public Long remindId;

        /**
         * <p>The next reminder time.</p>
         * 
         * <strong>example:</strong>
         * <p>1629850800000</p>
         */
        @NameInMap("RemindTime")
        public String remindTime;

        /**
         * <p>The number of times the reminder repeats.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <p>The day of the week on which the reminder is triggered weekly.</p>
         * 
         * <strong>example:</strong>
         * <p>周三</p>
         */
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
        /**
         * <p>The list of reminder information returned by invoking this API.</p>
         */
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
