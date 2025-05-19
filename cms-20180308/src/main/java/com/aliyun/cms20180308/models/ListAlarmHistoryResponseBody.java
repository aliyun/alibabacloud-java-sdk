// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmHistoryResponseBody extends TeaModel {
    @NameInMap("AlarmHistoryList")
    public ListAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1DBBCE29-0F69-435C-B65C-53D1011D1D72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAlarmHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoryResponseBody self = new ListAlarmHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoryResponseBody setAlarmHistoryList(ListAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public ListAlarmHistoryResponseBodyAlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public ListAlarmHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlarmHistoryResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListAlarmHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1548926982000</p>
         */
        @NameInMap("AlarmTime")
        public Long alarmTime;

        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;:&quot;XXX&quot;}</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <strong>example:</strong>
         * <p>1a775e37-dfba-430c-ab9f-7036475c8bfb_2dbe619b-0483-402e-9437-7c7a38fba7ed</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test-demo</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>2851651669</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

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
         * <p>ALARM</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>84401454</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory self = new ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory();
            return TeaModel.build(map, self);
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAlarmHistoryResponseBodyAlarmHistoryList extends TeaModel {
        @NameInMap("AlarmHistory")
        public java.util.List<ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> alarmHistory;

        public static ListAlarmHistoryResponseBodyAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmHistoryResponseBodyAlarmHistoryList self = new ListAlarmHistoryResponseBodyAlarmHistoryList();
            return TeaModel.build(map, self);
        }

        public ListAlarmHistoryResponseBodyAlarmHistoryList setAlarmHistory(java.util.List<ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> alarmHistory) {
            this.alarmHistory = alarmHistory;
            return this;
        }
        public java.util.List<ListAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

    }

}
