// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlansResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDevicePurifyPlansResponseData data;

    public static QueryDevicePurifyPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlansResponse self = new QueryDevicePurifyPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlansResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyPlansResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePurifyPlansResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyPlansResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyPlansResponse setData(QueryDevicePurifyPlansResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyPlansResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePurifyPlansResponseDataList extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Integer startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Integer endTime;

        public static QueryDevicePurifyPlansResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlansResponseDataList self = new QueryDevicePurifyPlansResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlansResponseDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyPlansResponseDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryDevicePurifyPlansResponseDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyPlansResponseDataList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyPlansResponseDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyPlansResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePurifyPlansResponseDataList setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyPlansResponseDataList setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

    }

    public static class QueryDevicePurifyPlansResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryDevicePurifyPlansResponseDataList> list;

        public static QueryDevicePurifyPlansResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlansResponseData self = new QueryDevicePurifyPlansResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlansResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDevicePurifyPlansResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryDevicePurifyPlansResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDevicePurifyPlansResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDevicePurifyPlansResponseData setList(java.util.List<QueryDevicePurifyPlansResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDevicePurifyPlansResponseDataList> getList() {
            return this.list;
        }

    }

}
