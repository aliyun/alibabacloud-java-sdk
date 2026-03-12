// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryBatchTaskListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryBatchTaskListResponseBodyData data;

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

    public static QueryBatchTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchTaskListResponseBody self = new QueryBatchTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchTaskListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryBatchTaskListResponseBody setData(QueryBatchTaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchTaskListResponseBodyData getData() {
        return this.data;
    }

    public QueryBatchTaskListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryBatchTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBatchTaskListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryBatchTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchTaskListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryBatchTaskListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryBatchTaskListResponseBodyDataTaskInfo extends TeaModel {
        @NameInMap("Clientip")
        public String clientip;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TaskNo")
        public String taskNo;

        @NameInMap("TaskNum")
        public Integer taskNum;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskType")
        public String taskType;

        public static QueryBatchTaskListResponseBodyDataTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchTaskListResponseBodyDataTaskInfo self = new QueryBatchTaskListResponseBodyDataTaskInfo();
            return TeaModel.build(map, self);
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryBatchTaskListResponseBodyDataTaskInfo setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class QueryBatchTaskListResponseBodyData extends TeaModel {
        @NameInMap("TaskInfo")
        public java.util.List<QueryBatchTaskListResponseBodyDataTaskInfo> taskInfo;

        public static QueryBatchTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchTaskListResponseBodyData self = new QueryBatchTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchTaskListResponseBodyData setTaskInfo(java.util.List<QueryBatchTaskListResponseBodyDataTaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public java.util.List<QueryBatchTaskListResponseBodyDataTaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

    }

}
