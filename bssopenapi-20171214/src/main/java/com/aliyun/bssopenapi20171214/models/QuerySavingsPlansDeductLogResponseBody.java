// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return data.</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansDeductLogResponseBodyData data;

    /**
     * <p>The message returned.</p>
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

    public static QuerySavingsPlansDeductLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogResponseBody self = new QuerySavingsPlansDeductLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansDeductLogResponseBody setData(QuerySavingsPlansDeductLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansDeductLogResponseBodyData getData() {
        return this.data;
    }

    public QuerySavingsPlansDeductLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansDeductLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansDeductLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingsPlansDeductLogResponseBodyDataItems extends TeaModel {
        /**
         * <p>The billable item for which the fee is deducted.</p>
         */
        @NameInMap("BillModule")
        public String billModule;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("BillingOfficialPrice")
        public String billingOfficialPrice;

        /**
         * <p>The service for which the fee is deducted.</p>
         */
        @NameInMap("DeductCommodity")
        public String deductCommodity;

        /**
         * <p>The deducted amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.52</p>
         */
        @NameInMap("DeductFee")
        public String deductFee;

        /**
         * <p>The ID of the instance for which the fee is deducted.</p>
         * 
         * <strong>example:</strong>
         * <p>i-XXXXXXXXX</p>
         */
        @NameInMap("DeductInstanceId")
        public String deductInstanceId;

        /**
         * <p>The deduction rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("DeductRate")
        public String deductRate;

        @NameInMap("DeductedOfficialPrice")
        public String deductedOfficialPrice;

        /**
         * <p>The discount used for the current deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.069</p>
         */
        @NameInMap("DiscountRate")
        public String discountRate;

        /**
         * <p>The end of the billing cycle for which the fee is deducted.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01 01:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the savings plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>spn-xxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <strong>example:</strong>
         * <p>1906589291020438</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Region")
        public String region;

        /**
         * <p>The type of the savings plan. Valid values:</p>
         * <ul>
         * <li>universal: general-purpose</li>
         * <li>ecs: ECS compute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("SavingsType")
        public String savingsType;

        /**
         * <p>The beginning of the billing cycle for which the fee is deducted. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1906589291020438</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QuerySavingsPlansDeductLogResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseBodyDataItems self = new QuerySavingsPlansDeductLogResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setBillModule(String billModule) {
            this.billModule = billModule;
            return this;
        }
        public String getBillModule() {
            return this.billModule;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setBillingOfficialPrice(String billingOfficialPrice) {
            this.billingOfficialPrice = billingOfficialPrice;
            return this;
        }
        public String getBillingOfficialPrice() {
            return this.billingOfficialPrice;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductCommodity(String deductCommodity) {
            this.deductCommodity = deductCommodity;
            return this;
        }
        public String getDeductCommodity() {
            return this.deductCommodity;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductFee(String deductFee) {
            this.deductFee = deductFee;
            return this;
        }
        public String getDeductFee() {
            return this.deductFee;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductInstanceId(String deductInstanceId) {
            this.deductInstanceId = deductInstanceId;
            return this;
        }
        public String getDeductInstanceId() {
            return this.deductInstanceId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductRate(String deductRate) {
            this.deductRate = deductRate;
            return this;
        }
        public String getDeductRate() {
            return this.deductRate;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDeductedOfficialPrice(String deductedOfficialPrice) {
            this.deductedOfficialPrice = deductedOfficialPrice;
            return this;
        }
        public String getDeductedOfficialPrice() {
            return this.deductedOfficialPrice;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setDiscountRate(String discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public String getDiscountRate() {
            return this.discountRate;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansDeductLogResponseBodyDataItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class QuerySavingsPlansDeductLogResponseBodyData extends TeaModel {
        /**
         * <p>The deduction details.</p>
         */
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> items;

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
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySavingsPlansDeductLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseBodyData self = new QuerySavingsPlansDeductLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseBodyData setItems(java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingsPlansDeductLogResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
