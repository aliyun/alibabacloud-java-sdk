// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIJobsResponse extends TeaModel {
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
    public QueryAIJobsResponseData data;

    public static QueryAIJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIJobsResponse self = new QueryAIJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIJobsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIJobsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIJobsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIJobsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIJobsResponse setData(QueryAIJobsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAIJobsResponseData getData() {
        return this.data;
    }

    public static class QueryAIJobsResponseDataList extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("ActionId")
        @Validation(required = true)
        public String actionId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static QueryAIJobsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIJobsResponseDataList self = new QueryAIJobsResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIJobsResponseDataList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryAIJobsResponseDataList setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public QueryAIJobsResponseDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAIJobsResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryAIJobsResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

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
        public java.util.List<QueryAIJobsResponseDataList> list;

        public static QueryAIJobsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIJobsResponseData self = new QueryAIJobsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAIJobsResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIJobsResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIJobsResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIJobsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIJobsResponseData setList(java.util.List<QueryAIJobsResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIJobsResponseDataList> getList() {
            return this.list;
        }

    }

}
