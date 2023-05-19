// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponseBody extends TeaModel {
    /**
     * <p>The prepaid amount.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The commitment.</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansInstanceResponseBodyData data;

    /**
     * <p>The details about the instances.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The return data.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The allocation status. Valid values:</p>
         * <br>
         * <p>*   unallocated</p>
         * <p>*   allocated</p>
         * <p>*   beAllocated</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   NORMAL: normal</p>
         * <p>*   LIMIT: stopped due to overdue payment</p>
         * <p>*   RELEASE: released</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("DeductCycleType")
        public String deductCycleType;

        /**
         * <p>The ID of the savings plan instance.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("InstanceFamily")
        public String instanceFamily;

        /**
         * <p>The time when the instance takes effect. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LastBillTotalUsage")
        public String lastBillTotalUsage;

        @NameInMap("LastBillUtilization")
        public String lastBillUtilization;

        @NameInMap("PayMode")
        public String payMode;

        /**
         * <p>The total amount that is saved.</p>
         */
        @NameInMap("PoolValue")
        public String poolValue;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PrepayFee")
        public String prepayFee;

        /**
         * <p>The total number of entries.</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("RestPoolValue")
        public String restPoolValue;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("SavingsType")
        public String savingsType;

        /**
         * <p>The payment type. Valid values:</p>
         * <br>
         * <p>*   total: All Upfront</p>
         * <p>*   half: Partial Upfront</p>
         * <p>*   zero: No Upfront</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The value of the tag to query.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItemsTags> tags;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("TotalSave")
        public String totalSave;

        /**
         * <p>The currency. Valid values: CNY and USD.</p>
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

        public QuerySavingsPlansInstanceResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
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
         * <p>The number of the page to return.</p>
         */
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> items;

        /**
         * <p>The type of the savings plan. Valid values:</p>
         * <br>
         * <p>*   universal: general-purpose</p>
         * <p>*   ecs: ECS compute</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The key of the tag to query.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The language of the return data. Valid values:</p>
         * <br>
         * <p>*   ZH: Chinese</p>
         * <p>*   EN: English</p>
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
