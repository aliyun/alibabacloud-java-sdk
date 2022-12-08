// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPictureSearchJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResponseBody self = new QueryPictureSearchJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchJobResponseBody setData(QueryPictureSearchJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchJobResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchJobResponseBodyDataPageData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("SearchPicUrl")
        public String searchPicUrl;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Threshold")
        public Float threshold;

        public static QueryPictureSearchJobResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResponseBodyDataPageData self = new QueryPictureSearchJobResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResponseBodyDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setSearchPicUrl(String searchPicUrl) {
            this.searchPicUrl = searchPicUrl;
            return this;
        }
        public String getSearchPicUrl() {
            return this.searchPicUrl;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryPictureSearchJobResponseBodyDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class QueryPictureSearchJobResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchJobResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryPictureSearchJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResponseBodyData self = new QueryPictureSearchJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchJobResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchJobResponseBodyData setPageData(java.util.List<QueryPictureSearchJobResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchJobResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchJobResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
