// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponse extends TeaModel {
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
    public QuerySavingsPlansInstanceResponseData data;

    public static QuerySavingsPlansInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceResponse self = new QuerySavingsPlansInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySavingsPlansInstanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansInstanceResponse setData(QuerySavingsPlansInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansInstanceResponseData getData() {
        return this.data;
    }

    public static class QuerySavingsPlansInstanceResponseDataItems extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("SavingsType")
        @Validation(required = true)
        public String savingsType;

        @NameInMap("InstanceFamily")
        @Validation(required = true)
        public String instanceFamily;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("PoolValue")
        @Validation(required = true)
        public String poolValue;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("PayMode")
        @Validation(required = true)
        public String payMode;

        @NameInMap("PrepayFee")
        @Validation(required = true)
        public String prepayFee;

        @NameInMap("TotalSave")
        @Validation(required = true)
        public String totalSave;

        @NameInMap("Utilization")
        @Validation(required = true)
        public String utilization;

        @NameInMap("Share")
        @Validation(required = true)
        public Boolean share;

        public static QuerySavingsPlansInstanceResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseDataItems self = new QuerySavingsPlansInstanceResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansInstanceResponseDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansInstanceResponseDataItems setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public QuerySavingsPlansInstanceResponseDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingsPlansInstanceResponseDataItems setPoolValue(String poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public String getPoolValue() {
            return this.poolValue;
        }

        public QuerySavingsPlansInstanceResponseDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySavingsPlansInstanceResponseDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySavingsPlansInstanceResponseDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansInstanceResponseDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansInstanceResponseDataItems setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingsPlansInstanceResponseDataItems setPrepayFee(String prepayFee) {
            this.prepayFee = prepayFee;
            return this;
        }
        public String getPrepayFee() {
            return this.prepayFee;
        }

        public QuerySavingsPlansInstanceResponseDataItems setTotalSave(String totalSave) {
            this.totalSave = totalSave;
            return this;
        }
        public String getTotalSave() {
            return this.totalSave;
        }

        public QuerySavingsPlansInstanceResponseDataItems setUtilization(String utilization) {
            this.utilization = utilization;
            return this;
        }
        public String getUtilization() {
            return this.utilization;
        }

        public QuerySavingsPlansInstanceResponseDataItems setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

    }

    public static class QuerySavingsPlansInstanceResponseData extends TeaModel {
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
        public java.util.List<QuerySavingsPlansInstanceResponseDataItems> items;

        public static QuerySavingsPlansInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseData self = new QuerySavingsPlansInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySavingsPlansInstanceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingsPlansInstanceResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySavingsPlansInstanceResponseData setItems(java.util.List<QuerySavingsPlansInstanceResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansInstanceResponseDataItems> getItems() {
            return this.items;
        }

    }

}
