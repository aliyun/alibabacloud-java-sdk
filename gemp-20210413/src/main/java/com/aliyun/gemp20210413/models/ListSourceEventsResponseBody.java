// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListSourceEventsResponseBodyData> data;

    /**
     * <p>firstRowKey</p>
     * 
     * <strong>example:</strong>
     * <p>9223370412331485032-1344383-9967-1-08be8b08ef30441390072f3bfba71c94</p>
     */
    @NameInMap("firstRowKey")
    public String firstRowKey;

    /**
     * <p>lastRowKey</p>
     * 
     * <strong>example:</strong>
     * <p>9223370412331485036-1344383-9967-1-8d729a1b176f493ca3be643b391d5ced</p>
     */
    @NameInMap("lastRowKey")
    public String lastRowKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("eventJson")
        public String eventJson;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:53:34</p>
         */
        @NameInMap("eventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
