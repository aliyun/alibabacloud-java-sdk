// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDevicePurifyJobsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePurifyJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyJobsResponseBody self = new QueryDevicePurifyJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyJobsResponseBody setData(QueryDevicePurifyJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyJobsResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePurifyJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePurifyJobsResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("PurifyRecordIndexUrl")
        public String purifyRecordIndexUrl;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("PurifyRecordNameUrl")
        public String purifyRecordNameUrl;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryDevicePurifyJobsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyJobsResponseBodyDataList self = new QueryDevicePurifyJobsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyJobsResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setPurifyRecordIndexUrl(String purifyRecordIndexUrl) {
            this.purifyRecordIndexUrl = purifyRecordIndexUrl;
            return this;
        }
        public String getPurifyRecordIndexUrl() {
            return this.purifyRecordIndexUrl;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setPurifyRecordNameUrl(String purifyRecordNameUrl) {
            this.purifyRecordNameUrl = purifyRecordNameUrl;
            return this;
        }
        public String getPurifyRecordNameUrl() {
            return this.purifyRecordNameUrl;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePurifyJobsResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryDevicePurifyJobsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public java.util.List<QueryDevicePurifyJobsResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static QueryDevicePurifyJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyJobsResponseBodyData self = new QueryDevicePurifyJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyJobsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDevicePurifyJobsResponseBodyData setList(java.util.List<QueryDevicePurifyJobsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDevicePurifyJobsResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryDevicePurifyJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDevicePurifyJobsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDevicePurifyJobsResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
