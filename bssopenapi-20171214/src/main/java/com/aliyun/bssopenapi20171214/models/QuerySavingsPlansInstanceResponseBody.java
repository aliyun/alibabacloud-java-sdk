// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QuerySavingsPlansInstanceResponseBodyData data;

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

    public QuerySavingsPlansInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansInstanceResponseBody setData(QuerySavingsPlansInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySavingsPlansInstanceResponseBodyDataItems extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SavingsType")
        public String savingsType;

        @NameInMap("InstanceFamily")
        public String instanceFamily;

        @NameInMap("Region")
        public String region;

        @NameInMap("PoolValue")
        public String poolValue;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("PayMode")
        public String payMode;

        @NameInMap("PrepayFee")
        public String prepayFee;

        @NameInMap("TotalSave")
        public String totalSave;

        @NameInMap("Utilization")
        public String utilization;

        @NameInMap("Share")
        public Boolean share;

        public static QuerySavingsPlansInstanceResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseBodyDataItems self = new QuerySavingsPlansInstanceResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setSavingsType(String savingsType) {
            this.savingsType = savingsType;
            return this;
        }
        public String getSavingsType() {
            return this.savingsType;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPoolValue(String poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public String getPoolValue() {
            return this.poolValue;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingsPlansInstanceResponseBodyDataItems setPrepayFee(String prepayFee) {
            this.prepayFee = prepayFee;
            return this;
        }
        public String getPrepayFee() {
            return this.prepayFee;
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

        public QuerySavingsPlansInstanceResponseBodyDataItems setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

    }

    public static class QuerySavingsPlansInstanceResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> items;

        public static QuerySavingsPlansInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansInstanceResponseBodyData self = new QuerySavingsPlansInstanceResponseBodyData();
            return TeaModel.build(map, self);
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

        public QuerySavingsPlansInstanceResponseBodyData setItems(java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansInstanceResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
