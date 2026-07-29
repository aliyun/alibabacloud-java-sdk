// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehouseScheduleEventResponseBody extends TeaModel {
    /**
     * <p>The event list.</p>
     */
    @NameInMap("EventList")
    public java.util.List<ListWarehouseScheduleEventResponseBodyEventList> eventList;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 30. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E16D32D4-DF86-1180-8220-0D39770A5AF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWarehouseScheduleEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseScheduleEventResponseBody self = new ListWarehouseScheduleEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarehouseScheduleEventResponseBody setEventList(java.util.List<ListWarehouseScheduleEventResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<ListWarehouseScheduleEventResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public ListWarehouseScheduleEventResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListWarehouseScheduleEventResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWarehouseScheduleEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarehouseScheduleEventResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWarehouseScheduleEventResponseBodyEventList extends TeaModel {
        /**
         * <p>The cluster count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterCount")
        public Long clusterCount;

        /**
         * <p>The cluster specification, measured in CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ClusterCpu")
        public Long clusterCpu;

        /**
         * <p>The number of elastic CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("ElasticCpu")
        public Long elasticCpu;

        /**
         * <p>The elastic type.</p>
         * 
         * <strong>example:</strong>
         * <p>ScaleUp</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>AlterWarehouse</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The event time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-22T09:43:02.638Z</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The failure reason. This parameter is returned only if the value of <code>Result</code> is <code>failed</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>insufficient resource</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The number of reserved clusters (non-elastic).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InitClusterCount")
        public Long initClusterCount;

        /**
         * <p>This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OriginalElasticCpu")
        public Long originalElasticCpu;

        /**
         * <p>The number of reserved CPU cores (non-elastic).</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("ReservedCpu")
        public Long reservedCpu;

        /**
         * <p>The result of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The warehouse name.</p>
         * 
         * <strong>example:</strong>
         * <p>init_warehouse</p>
         */
        @NameInMap("WarehouseName")
        public String warehouseName;

        public static ListWarehouseScheduleEventResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            ListWarehouseScheduleEventResponseBodyEventList self = new ListWarehouseScheduleEventResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public ListWarehouseScheduleEventResponseBodyEventList setClusterCount(Long clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Long getClusterCount() {
            return this.clusterCount;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setClusterCpu(Long clusterCpu) {
            this.clusterCpu = clusterCpu;
            return this;
        }
        public Long getClusterCpu() {
            return this.clusterCpu;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setElasticCpu(Long elasticCpu) {
            this.elasticCpu = elasticCpu;
            return this;
        }
        public Long getElasticCpu() {
            return this.elasticCpu;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setInitClusterCount(Long initClusterCount) {
            this.initClusterCount = initClusterCount;
            return this;
        }
        public Long getInitClusterCount() {
            return this.initClusterCount;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setOriginalElasticCpu(Long originalElasticCpu) {
            this.originalElasticCpu = originalElasticCpu;
            return this;
        }
        public Long getOriginalElasticCpu() {
            return this.originalElasticCpu;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setReservedCpu(Long reservedCpu) {
            this.reservedCpu = reservedCpu;
            return this;
        }
        public Long getReservedCpu() {
            return this.reservedCpu;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListWarehouseScheduleEventResponseBodyEventList setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

    }

}
