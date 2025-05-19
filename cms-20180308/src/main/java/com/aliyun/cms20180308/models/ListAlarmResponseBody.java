// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmList")
    public ListAlarmResponseBodyAlarmList alarmList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <strong>example:</strong>
     * <p>EFD27F56-5799-4CE8-B625-56DF3332331C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmResponseBody self = new ListAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmResponseBody setAlarmList(ListAlarmResponseBodyAlarmList alarmList) {
        this.alarmList = alarmList;
        return this;
    }
    public ListAlarmResponseBodyAlarmList getAlarmList() {
        return this.alarmList;
    }

    public ListAlarmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlarmResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAlarmResponseBodyAlarmListAlarm extends TeaModel {
        /**
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <strong>example:</strong>
         * <p>[&quot;test4nudou&quot;]</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <strong>example:</strong>
         * <p>[&quot;{\&quot;instanceId\&quot;:\&quot; i-abcdefgh123456\&quot;}&quot;]</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <strong>example:</strong>
         * <p>i-2ze3w55tr2rcpejpcfap_72071739-396b-497d-849c-59a73de44bcf</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static ListAlarmResponseBodyAlarmListAlarm build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmResponseBodyAlarmListAlarm self = new ListAlarmResponseBodyAlarmListAlarm();
            return TeaModel.build(map, self);
        }

        public ListAlarmResponseBodyAlarmListAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ListAlarmResponseBodyAlarmListAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public ListAlarmResponseBodyAlarmListAlarm setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public ListAlarmResponseBodyAlarmListAlarm setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAlarmResponseBodyAlarmListAlarm setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public ListAlarmResponseBodyAlarmListAlarm setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ListAlarmResponseBodyAlarmListAlarm setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmResponseBodyAlarmListAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListAlarmResponseBodyAlarmListAlarm setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlarmResponseBodyAlarmListAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAlarmResponseBodyAlarmListAlarm setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public ListAlarmResponseBodyAlarmListAlarm setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListAlarmResponseBodyAlarmListAlarm setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ListAlarmResponseBodyAlarmListAlarm setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public ListAlarmResponseBodyAlarmListAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAlarmResponseBodyAlarmListAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ListAlarmResponseBodyAlarmListAlarm setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ListAlarmResponseBodyAlarmListAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class ListAlarmResponseBodyAlarmList extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<ListAlarmResponseBodyAlarmListAlarm> alarm;

        public static ListAlarmResponseBodyAlarmList build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmResponseBodyAlarmList self = new ListAlarmResponseBodyAlarmList();
            return TeaModel.build(map, self);
        }

        public ListAlarmResponseBodyAlarmList setAlarm(java.util.List<ListAlarmResponseBodyAlarmListAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<ListAlarmResponseBodyAlarmListAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
