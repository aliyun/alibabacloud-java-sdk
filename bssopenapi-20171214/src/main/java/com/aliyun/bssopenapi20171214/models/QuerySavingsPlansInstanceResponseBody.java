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
     * <p>The return data.</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansInstanceResponseBodyData data;

    /**
     * <p>The message returned.</p>
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
     * <p>Indicates whether the operation was successful.</p>
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
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The allocation status. Valid values:</p>
         * <ul>
         * <li>unallocated</li>
         * <li>allocated</li>
         * <li>beAllocated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unallocated</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <strong>example:</strong>
         * <p>savingplan_common_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The currency. Valid values: CNY and USD.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CurrentPoolValue")
        public String currentPoolValue;

        /**
         * <strong>example:</strong>
         * <p>1:Year</p>
         */
        @NameInMap("Cycle")
        public String cycle;

        /**
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("DeductCycleType")
        public String deductCycleType;

        /**
         * <p>The time when the instance expires. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1663135741039</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The instance family information. For an instance of the Elastic Compute Service (ECS) compute type, the value indicates the ECS instance family or the ECS instance family package.</p>
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("LastBillTotalUsage")
        public String lastBillTotalUsage;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("LastBillUtilization")
        public String lastBillUtilization;

        /**
         * <p>The payment type. Valid values:</p>
         * <ul>
         * <li>total: All Upfront</li>
         * <li>half: Partial Upfront</li>
         * <li>zero: No Upfront</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        @NameInMap("PayMode")
        public String payMode;

        /**
         * <p>The commitment.</p>
         * 
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("PoolValue")
        public String poolValue;

        /**
         * <p>The prepaid amount.</p>
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("RestPoolValue")
        public String restPoolValue;

        /**
         * <p>The type of the savings plan. Valid values:</p>
         * <ul>
         * <li>universal: general-purpose</li>
         * <li>ecs: ECS compute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("SavingsType")
        public String savingsType;

        /**
         * <p>The time when the instance takes effect. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1663135741039</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>NORMAL: normal</li>
         * <li>LIMIT: stopped due to overdue payment</li>
         * <li>RELEASE: released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The details about the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItemsTags> tags;

        /**
         * <p>The total amount that is saved.</p>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("TotalSave")
        public String totalSave;

        /**
         * <p>The total usage.</p>
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
         * <p>The details about the instances.</p>
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
