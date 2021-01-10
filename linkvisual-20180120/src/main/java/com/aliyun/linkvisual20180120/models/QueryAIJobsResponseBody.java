// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAIJobsResponseBodyData data;

    public static QueryAIJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAIJobsResponseBody self = new QueryAIJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAIJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIJobsResponseBody setData(QueryAIJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAIJobsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAIJobsResponseBodyDataList extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ActionId")
        public String actionId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("IotId")
        public String iotId;

        public static QueryAIJobsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIJobsResponseBodyDataList self = new QueryAIJobsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIJobsResponseBodyDataList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryAIJobsResponseBodyDataList setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public QueryAIJobsResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAIJobsResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryAIJobsResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<QueryAIJobsResponseBodyDataList> list;

        public static QueryAIJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIJobsResponseBodyData self = new QueryAIJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAIJobsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIJobsResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIJobsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIJobsResponseBodyData setList(java.util.List<QueryAIJobsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIJobsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
