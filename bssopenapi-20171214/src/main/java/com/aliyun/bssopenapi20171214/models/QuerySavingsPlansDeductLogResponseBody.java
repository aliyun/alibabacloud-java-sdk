// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The type of the savings plan. Valid values:</p>
     * <br>
     * <p>*   universal: general-purpose</p>
     * <p>*   ecs: ECS compute</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansDeductLogResponseBodyData data;

    /**
     * <p>The ID of the savings plan instance.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The deduction details.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return data.</p>
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
         * <p>The total number of entries.</p>
         */
        @NameInMap("BillModule")
        public String billModule;

        @NameInMap("DeductCommodity")
        public String deductCommodity;

        @NameInMap("DeductFee")
        public String deductFee;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("DeductInstanceId")
        public String deductInstanceId;

        @NameInMap("DeductRate")
        public String deductRate;

        /**
         * <p>The billable item for which the fee is deducted.</p>
         */
        @NameInMap("DiscountRate")
        public String discountRate;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The service for which the fee is deducted.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the instance for which the fee is deducted.</p>
         */
        @NameInMap("SavingsType")
        public String savingsType;

        /**
         * <p>The beginning of the billing cycle for which the fee is deducted. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The number of the page to return.</p>
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

        public QuerySavingsPlansDeductLogResponseBodyDataItems setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
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
         * <p>The deduction rate.</p>
         */
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansDeductLogResponseBodyDataItems> items;

        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The language of the return data. Valid values:</p>
         * <br>
         * <p>*   ZH: Chinese</p>
         * <p>*   EN: English</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The end of the time range to query. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
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
