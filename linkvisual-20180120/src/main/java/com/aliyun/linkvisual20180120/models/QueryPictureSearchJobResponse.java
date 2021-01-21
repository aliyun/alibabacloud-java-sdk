// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPictureSearchJobResponseData data;

    public static QueryPictureSearchJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResponse self = new QueryPictureSearchJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchJobResponse setData(QueryPictureSearchJobResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchJobResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchJobResponseDataPageData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobStatus")
        @Validation(required = true)
        public Integer jobStatus;

        @NameInMap("SearchPicUrl")
        @Validation(required = true)
        public String searchPicUrl;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        public static QueryPictureSearchJobResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResponseDataPageData self = new QueryPictureSearchJobResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResponseDataPageData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryPictureSearchJobResponseDataPageData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public QueryPictureSearchJobResponseDataPageData setSearchPicUrl(String searchPicUrl) {
            this.searchPicUrl = searchPicUrl;
            return this;
        }
        public String getSearchPicUrl() {
            return this.searchPicUrl;
        }

        public QueryPictureSearchJobResponseDataPageData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryPictureSearchJobResponseDataPageData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryPictureSearchJobResponseDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public QueryPictureSearchJobResponseDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryPictureSearchJobResponseData extends TeaModel {
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

        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<QueryPictureSearchJobResponseDataPageData> pageData;

        public static QueryPictureSearchJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResponseData self = new QueryPictureSearchJobResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchJobResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchJobResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchJobResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchJobResponseData setPageData(java.util.List<QueryPictureSearchJobResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchJobResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}
