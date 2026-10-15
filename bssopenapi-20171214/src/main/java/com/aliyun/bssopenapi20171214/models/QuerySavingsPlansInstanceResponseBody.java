// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansInstanceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>61293E7A-3406-4447-8620-EC88B0AA66AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySavingsPlansInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceResponseBody self = new QuerySavingsPlansInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansInstanceResponseBody setData(QuerySavingsPlansInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansInstanceResponseBodyData getData() {
        return this.data;
    }

    public QuerySavingsPlansInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingsPlansInstanceResponseBodyDataItemsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("Value")
        public String value;

        public static QuerySavingsPlansInstanceResponseBodyDataItemsTags build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseBodyDataItemsTags self = new QuerySavingsPlansInstanceResponseBodyDataItemsTags();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseBodyDataItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QuerySavingsPlansInstanceResponseBodyDataItems extends TeaModel {
        /**
         * <p>The allocation status.</p>
         * <ul>
         * <li><p>unallocated: Not allocated.</p>
         * </li>
         * <li><p>allocated: Allocating.</p>
         * </li>
         * <li><p>beAllocated: Allocated to this account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unallocated</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>savingplan_common_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The currency. Valid values: CNY: Chinese Yuan. USD: US Dollar.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>For a savings plan with a monthly cycle, this is the commitment for the current cycle. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CurrentPoolValue")
        public String currentPoolValue;

        /**
         * <p>The purchased duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1:Year</p>
         */
        @NameInMap("Cycle")
        public String cycle;

        /**
         * <p>The deduction cycle.
         * HOUR: hourly
         * DAY: daily
         * ONCE: one-time (the total amount decreases over time)</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("DeductCycleType")
        public String deductCycleType;

        /**
         * <p>The expiration time of the instance. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The end timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1663135741039</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>For a compute-optimized savings plan, this parameter indicates the corresponding instance family or instance family package.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        @NameInMap("InstanceFamily")
        public String instanceFamily;

        /**
         * <p>The ID of the savings plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>spn-xxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The total deduction amount in the previous cycle. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("LastBillTotalUsage")
        public String lastBillTotalUsage;

        /**
         * <p>The utilization in the previous cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("LastBillUtilization")
        public String lastBillUtilization;

        /**
         * <p>The payment type.</p>
         * <ul>
         * <li><p>total: All Upfront</p>
         * </li>
         * <li><p>half: Partial Upfront</p>
         * </li>
         * <li><p>zero: No Upfront</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        @NameInMap("PayMode")
        public String payMode;

        /**
         * <p>The commitment. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("PoolValue")
        public String poolValue;

        /**
         * <p>The upfront payment. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>8760.00</p>
         */
        @NameInMap("PrepayFee")
        public String prepayFee;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-na62-a01</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>For a flexible savings plan with a monthly or daily commitment, this is the remaining amount in the current cycle. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("RestPoolValue")
        public String restPoolValue;

        /**
         * <p>The type of the savings plan.</p>
         * <ul>
         * <li><p>unversal: general-purpose</p>
         * </li>
         * <li><p>ecs: compute-optimized</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("SavingsType")
        public String savingsType;

        /**
         * <p>The effective time of the instance. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The start timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1663135741039</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The current status.</p>
         * <ul>
         * <li><p>NORMAL: The instance is active.</p>
         * </li>
         * <li><p>LIMIT: The instance is suspended due to an overdue payment.</p>
         * </li>
         * <li><p>RELEASE: The instance is released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItemsTags> tags;

        /**
         * <p>The total savings. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("TotalSave")
        public String totalSave;

        /**
         * <p>The total utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Utilization")
        public String utilization;

        public static QuerySavingsPlansInstanceResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseBodyDataItems self = new QuerySavingsPlansInstanceResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setCurrentPoolValue(String currentPoolValue) {
            this.currentPoolValue = currentPoolValue;
            return this;
        }
        public String getCurrentPoolValue() {
            return this.currentPoolValue;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setDeductCycleType(String deductCycleType) {
            this.deductCycleType = deductCycleType;
            return this;
        }
        public String getDeductCycleType() {
            return this.deductCycleType;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setLastBillTotalUsage(String lastBillTotalUsage) {
            this.lastBillTotalUsage = lastBillTotalUsage;
            return this;
        }
        public String getLastBillTotalUsage() {
            return this.lastBillTotalUsage;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setLastBillUtilization(String lastBillUtilization) {
            this.lastBillUtilization = lastBillUtilization;
            return this;
        }
        public String getLastBillUtilization() {
            return this.lastBillUtilization;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPoolValue(String poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public String getPoolValue() {
            return this.poolValue;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPrepayFee(String prepayFee) {
            this.prepayFee = prepayFee;
            return this;
        }
        public String getPrepayFee() {
            return this.prepayFee;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setRestPoolValue(String restPoolValue) {
            this.restPoolValue = restPoolValue;
            return this;
        }
        public String getRestPoolValue() {
            return this.restPoolValue;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setTags(java.util.List<QuerySavingsPlansInstanceResponseBodyDataItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItemsTags> getTags() {
            return this.tags;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setTotalSave(String totalSave) {
            this.totalSave = totalSave;
            return this;
        }
        public String getTotalSave() {
            return this.totalSave;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setUtilization(String utilization) {
            this.utilization = utilization;
            return this;
        }
        public String getUtilization() {
            return this.utilization;
        }

    }

    public static class QuerySavingsPlansInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The list of instance information.</p>
         */
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> items;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySavingsPlansInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseBodyData self = new QuerySavingsPlansInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseBodyData setItems(java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QuerySavingsPlansInstanceResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySavingsPlansInstanceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingsPlansInstanceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
