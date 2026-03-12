// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryBatchTaskDetailListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryBatchTaskDetailListResponseBodyData data;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryBatchTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchTaskDetailListResponseBody self = new QueryBatchTaskDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchTaskDetailListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryBatchTaskDetailListResponseBody setData(QueryBatchTaskDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchTaskDetailListResponseBodyData getData() {
        return this.data;
    }

    public QueryBatchTaskDetailListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryBatchTaskDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBatchTaskDetailListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryBatchTaskDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchTaskDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryBatchTaskDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryBatchTaskDetailListResponseBodyDataTaskDetail extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("TaskNo")
        public String taskNo;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TryCount")
        public Integer tryCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryBatchTaskDetailListResponseBodyDataTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchTaskDetailListResponseBodyDataTaskDetail self = new QueryBatchTaskDetailListResponseBodyDataTaskDetail();
            return TeaModel.build(map, self);
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryBatchTaskDetailListResponseBodyDataTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryBatchTaskDetailListResponseBodyData extends TeaModel {
        @NameInMap("TaskDetail")
        public java.util.List<QueryBatchTaskDetailListResponseBodyDataTaskDetail> taskDetail;

        public static QueryBatchTaskDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchTaskDetailListResponseBodyData self = new QueryBatchTaskDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchTaskDetailListResponseBodyData setTaskDetail(java.util.List<QueryBatchTaskDetailListResponseBodyDataTaskDetail> taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public java.util.List<QueryBatchTaskDetailListResponseBodyDataTaskDetail> getTaskDetail() {
            return this.taskDetail;
        }

    }

}
