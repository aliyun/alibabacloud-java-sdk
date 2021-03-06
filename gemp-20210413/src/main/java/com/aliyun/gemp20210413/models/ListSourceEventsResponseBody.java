// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("data")
    public java.util.List<ListSourceEventsResponseBodyData> data;

    // lastRowKey
    @NameInMap("lastRowKey")
    public String lastRowKey;

    // firstRowKey
    @NameInMap("firstRowKey")
    public String firstRowKey;

    public static ListSourceEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsResponseBody self = new ListSourceEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSourceEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListSourceEventsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSourceEventsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceEventsResponseBody setData(java.util.List<ListSourceEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSourceEventsResponseBodyData> getData() {
        return this.data;
    }

    public ListSourceEventsResponseBody setLastRowKey(String lastRowKey) {
        this.lastRowKey = lastRowKey;
        return this;
    }
    public String getLastRowKey() {
        return this.lastRowKey;
    }

    public ListSourceEventsResponseBody setFirstRowKey(String firstRowKey) {
        this.firstRowKey = firstRowKey;
        return this;
    }
    public String getFirstRowKey() {
        return this.firstRowKey;
    }

    public static class ListSourceEventsResponseBodyData extends TeaModel {
        // 规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        // INCIDENT 事件、ALERT 报警、PROBLEM 故障
        @NameInMap("instanceType")
        public String instanceType;

        // 关联对象ID
        @NameInMap("instanceId")
        public Long instanceId;

        // 监控告警源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控告警源名称
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 告警上报时间
        @NameInMap("eventTime")
        public String eventTime;

        // 租户ID
        @NameInMap("tenantRamId")
        public Long tenantRamId;

        // 告警内容json
        @NameInMap("eventJson")
        public String eventJson;

        public static ListSourceEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSourceEventsResponseBodyData self = new ListSourceEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSourceEventsResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListSourceEventsResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListSourceEventsResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListSourceEventsResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public ListSourceEventsResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public ListSourceEventsResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListSourceEventsResponseBodyData setTenantRamId(Long tenantRamId) {
            this.tenantRamId = tenantRamId;
            return this;
        }
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        public ListSourceEventsResponseBodyData setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

    }

}
