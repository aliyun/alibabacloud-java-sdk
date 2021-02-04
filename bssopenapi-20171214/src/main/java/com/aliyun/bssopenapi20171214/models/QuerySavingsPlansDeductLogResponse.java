// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySavingsPlansDeductLogResponseData data;

    public static QuerySavingsPlansDeductLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogResponse self = new QuerySavingsPlansDeductLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansDeductLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansDeductLogResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySavingsPlansDeductLogResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansDeductLogResponse setData(QuerySavingsPlansDeductLogResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansDeductLogResponseData getData() {
        return this.data;
    }

    public static class QuerySavingsPlansDeductLogResponseDataItems extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SavingsType")
        @Validation(required = true)
        public String savingsType;

        @NameInMap("BillModule")
        @Validation(required = true)
        public String billModule;

        @NameInMap("DeductFee")
        @Validation(required = true)
        public String deductFee;

        @NameInMap("DeductRate")
        @Validation(required = true)
        public String deductRate;

        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("DeductCommodity")
        @Validation(required = true)
        public String deductCommodity;

        @NameInMap("DeductInstanceId")
        @Validation(required = true)
        public String deductInstanceId;

        @NameInMap("DiscountRate")
        @Validation(required = true)
        public String discountRate;

        public static QuerySavingsPlansDeductLogResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseDataItems self = new QuerySavingsPlansDeductLogResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setBillModule(String billModule) {
            this.billModule = billModule;
            return this;
        }
        public String getBillModule() {
            return this.billModule;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setDeductFee(String deductFee) {
            this.deductFee = deductFee;
            return this;
        }
        public String getDeductFee() {
            return this.deductFee;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setDeductRate(String deductRate) {
            this.deductRate = deductRate;
            return this;
        }
        public String getDeductRate() {
            return this.deductRate;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setDeductCommodity(String deductCommodity) {
            this.deductCommodity = deductCommodity;
            return this;
        }
        public String getDeductCommodity() {
            return this.deductCommodity;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setDeductInstanceId(String deductInstanceId) {
            this.deductInstanceId = deductInstanceId;
            return this;
        }
        public String getDeductInstanceId() {
            return this.deductInstanceId;
        }

        public QuerySavingsPlansDeductLogResponseDataItems setDiscountRate(String discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public String getDiscountRate() {
            return this.discountRate;
        }

    }

    public static class QuerySavingsPlansDeductLogResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySavingsPlansDeductLogResponseDataItems> items;

        public static QuerySavingsPlansDeductLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDeductLogResponseData self = new QuerySavingsPlansDeductLogResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDeductLogResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySavingsPlansDeductLogResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingsPlansDeductLogResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySavingsPlansDeductLogResponseData setItems(java.util.List<QuerySavingsPlansDeductLogResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansDeductLogResponseDataItems> getItems() {
            return this.items;
        }

    }

}
