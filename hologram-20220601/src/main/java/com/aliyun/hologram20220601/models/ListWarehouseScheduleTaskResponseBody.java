// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehouseScheduleTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0A16C46-5B56-1F9B-AA37-4C3EAD95AAA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of time-based elastic plans.</p>
     */
    @NameInMap("ScheduleTaskList")
    public java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskList> scheduleTaskList;

    public static ListWarehouseScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseScheduleTaskResponseBody self = new ListWarehouseScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarehouseScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarehouseScheduleTaskResponseBody setScheduleTaskList(java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskList> scheduleTaskList) {
        this.scheduleTaskList = scheduleTaskList;
        return this;
    }
    public java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskList> getScheduleTaskList() {
        return this.scheduleTaskList;
    }

    public static class ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans extends TeaModel {
        /**
         * <p>The description of the elastic plan.</p>
         * 
         * <strong>example:</strong>
         * <p>bill stat</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The elastic resources. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the compute group specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ElasticCu")
        public Long elasticCu;

        /**
         * <p>The end time. Only full hours and half hours are supported. The format is HHmm (four digits, 24-hour clock).</p>
         * 
         * <strong>example:</strong>
         * <p>0400</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The elastic plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1802985780260052993</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The start time. Only full hours and half hours are supported, such as 0100 for 1:00 AM. The format is HHmm (four digits, 24-hour clock).</p>
         * 
         * <strong>example:</strong>
         * <p>0100</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans build(java.util.Map<String, ?> map) throws Exception {
            ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans self = new ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans();
            return TeaModel.build(map, self);
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans setElasticCu(Long elasticCu) {
            this.elasticCu = elasticCu;
            return this;
        }
        public Long getElasticCu() {
            return this.elasticCu;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListWarehouseScheduleTaskResponseBodyScheduleTaskList extends TeaModel {
        /**
         * <p>The elastic type.</p>
         * 
         * <strong>example:</strong>
         * <p>timed</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The list of elastic plans for a single compute group.</p>
         */
        @NameInMap("Plans")
        public java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans> plans;

        /**
         * <p>The reserved resources of the compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ReservedCpu")
        public Long reservedCpu;

        /**
         * <p>The status of the compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>kRunning</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The compute group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WarehouseId")
        public String warehouseId;

        /**
         * <p>The compute group name.</p>
         * 
         * <strong>example:</strong>
         * <p>init_warehouse</p>
         */
        @NameInMap("WarehouseName")
        public String warehouseName;

        public static ListWarehouseScheduleTaskResponseBodyScheduleTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListWarehouseScheduleTaskResponseBodyScheduleTaskList self = new ListWarehouseScheduleTaskResponseBodyScheduleTaskList();
            return TeaModel.build(map, self);
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setPlans(java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans> plans) {
            this.plans = plans;
            return this;
        }
        public java.util.List<ListWarehouseScheduleTaskResponseBodyScheduleTaskListPlans> getPlans() {
            return this.plans;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setReservedCpu(Long reservedCpu) {
            this.reservedCpu = reservedCpu;
            return this;
        }
        public Long getReservedCpu() {
            return this.reservedCpu;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setWarehouseId(String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }
        public String getWarehouseId() {
            return this.warehouseId;
        }

        public ListWarehouseScheduleTaskResponseBodyScheduleTaskList setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }
        public String getWarehouseName() {
            return this.warehouseName;
        }

    }

}
