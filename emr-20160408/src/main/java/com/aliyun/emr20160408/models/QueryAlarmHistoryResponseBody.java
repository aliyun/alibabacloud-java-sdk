// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryAlarmHistoryResponseBody extends TeaModel {
    @NameInMap("AlarmHistoryList")
    public QueryAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    @NameInMap("Cursor")
    public String cursor;

    public static QueryAlarmHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmHistoryResponseBody self = new QueryAlarmHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmHistoryResponseBody setAlarmHistoryList(QueryAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public QueryAlarmHistoryResponseBodyAlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public QueryAlarmHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmHistoryResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public QueryAlarmHistoryResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public static class QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("AlarmTime")
        public Long alarmTime;

        @NameInMap("State")
        public String state;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("ClusterId")
        public String clusterId;

        public static QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory self = new QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory();
            return TeaModel.build(map, self);
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class QueryAlarmHistoryResponseBodyAlarmHistoryList extends TeaModel {
        @NameInMap("EmrAlarmHistory")
        public java.util.List<QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory> emrAlarmHistory;

        public static QueryAlarmHistoryResponseBodyAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmHistoryResponseBodyAlarmHistoryList self = new QueryAlarmHistoryResponseBodyAlarmHistoryList();
            return TeaModel.build(map, self);
        }

        public QueryAlarmHistoryResponseBodyAlarmHistoryList setEmrAlarmHistory(java.util.List<QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory> emrAlarmHistory) {
            this.emrAlarmHistory = emrAlarmHistory;
            return this;
        }
        public java.util.List<QueryAlarmHistoryResponseBodyAlarmHistoryListEmrAlarmHistory> getEmrAlarmHistory() {
            return this.emrAlarmHistory;
        }

    }

}
