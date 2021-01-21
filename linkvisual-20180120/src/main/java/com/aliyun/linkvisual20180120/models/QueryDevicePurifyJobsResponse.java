// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyJobsResponse extends TeaModel {
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
    public QueryDevicePurifyJobsResponseData data;

    public static QueryDevicePurifyJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyJobsResponse self = new QueryDevicePurifyJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyJobsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePurifyJobsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePurifyJobsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePurifyJobsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePurifyJobsResponse setData(QueryDevicePurifyJobsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePurifyJobsResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePurifyJobsResponseDataList extends TeaModel {
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
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("PurifyRecordNameUrl")
        @Validation(required = true)
        public String purifyRecordNameUrl;

        @NameInMap("PurifyRecordIndexUrl")
        @Validation(required = true)
        public String purifyRecordIndexUrl;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static QueryDevicePurifyJobsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyJobsResponseDataList self = new QueryDevicePurifyJobsResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyJobsResponseDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryDevicePurifyJobsResponseDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryDevicePurifyJobsResponseDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryDevicePurifyJobsResponseDataList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePurifyJobsResponseDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePurifyJobsResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePurifyJobsResponseDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryDevicePurifyJobsResponseDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryDevicePurifyJobsResponseDataList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryDevicePurifyJobsResponseDataList setPurifyRecordNameUrl(String purifyRecordNameUrl) {
            this.purifyRecordNameUrl = purifyRecordNameUrl;
            return this;
        }
        public String getPurifyRecordNameUrl() {
            return this.purifyRecordNameUrl;
        }

        public QueryDevicePurifyJobsResponseDataList setPurifyRecordIndexUrl(String purifyRecordIndexUrl) {
            this.purifyRecordIndexUrl = purifyRecordIndexUrl;
            return this;
        }
        public String getPurifyRecordIndexUrl() {
            return this.purifyRecordIndexUrl;
        }

        public QueryDevicePurifyJobsResponseDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryDevicePurifyJobsResponseData extends TeaModel {
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
        public java.util.List<QueryDevicePurifyJobsResponseDataList> list;

        public static QueryDevicePurifyJobsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePurifyJobsResponseData self = new QueryDevicePurifyJobsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePurifyJobsResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDevicePurifyJobsResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryDevicePurifyJobsResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryDevicePurifyJobsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDevicePurifyJobsResponseData setList(java.util.List<QueryDevicePurifyJobsResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDevicePurifyJobsResponseDataList> getList() {
            return this.list;
        }

    }

}
