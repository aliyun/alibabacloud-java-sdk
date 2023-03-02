// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListSourceEventsResponseBodyData> data;

    /**
     * <p>firstRowKey</p>
     */
    @NameInMap("firstRowKey")
    public String firstRowKey;

    /**
     * <p>lastRowKey</p>
     */
    @NameInMap("lastRowKey")
    public String lastRowKey;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListSourceEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsResponseBody self = new ListSourceEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsResponseBody setData(java.util.List<ListSourceEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSourceEventsResponseBodyData> getData() {
        return this.data;
    }

    public ListSourceEventsResponseBody setFirstRowKey(String firstRowKey) {
        this.firstRowKey = firstRowKey;
        return this;
    }
    public String getFirstRowKey() {
        return this.firstRowKey;
    }

    public ListSourceEventsResponseBody setLastRowKey(String lastRowKey) {
        this.lastRowKey = lastRowKey;
        return this;
    }
    public String getLastRowKey() {
        return this.lastRowKey;
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

    public static class ListSourceEventsResponseBodyData extends TeaModel {
        @NameInMap("eventJson")
        public String eventJson;

        @NameInMap("eventTime")
        public String eventTime;

        @NameInMap("instanceId")
        public Long instanceId;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("tenantRamId")
        public Long tenantRamId;

        public static ListSourceEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSourceEventsResponseBodyData self = new ListSourceEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSourceEventsResponseBodyData setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

        public ListSourceEventsResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListSourceEventsResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListSourceEventsResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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

        public ListSourceEventsResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListSourceEventsResponseBodyData setTenantRamId(Long tenantRamId) {
            this.tenantRamId = tenantRamId;
            return this;
        }
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

    }

}
