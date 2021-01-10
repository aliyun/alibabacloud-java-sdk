// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDevicePurifyPlansResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePurifyPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlansResponseBody self = new QueryDevicePurifyPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyPlansResponseBody setData(QueryDevicePurifyPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyPlansResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePurifyPlansResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePurifyPlansResponseBodyDataList extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDevicePurifyPlansResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlansResponseBodyDataList self = new QueryDevicePurifyPlansResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlansResponseBodyDataList setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryDevicePurifyPlansResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryDevicePurifyPlansResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public java.util.List<QueryDevicePurifyPlansResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static QueryDevicePurifyPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyPlansResponseBodyData self = new QueryDevicePurifyPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyPlansResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDevicePurifyPlansResponseBodyData setList(java.util.List<QueryDevicePurifyPlansResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDevicePurifyPlansResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryDevicePurifyPlansResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDevicePurifyPlansResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDevicePurifyPlansResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
