// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTaskListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTaskListResponseBodyData data;

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

    public static QueryTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListResponseBody self = new QueryTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTaskListResponseBody setData(QueryTaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskListResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTaskListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTaskListResponseBodyDataTaskInfo extends TeaModel {
        @NameInMap("Clientip")
        public String clientip;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TaskCancelStatus")
        public String taskCancelStatus;

        @NameInMap("TaskCancelStatusCode")
        public Integer taskCancelStatusCode;

        @NameInMap("TaskNo")
        public String taskNo;

        @NameInMap("TaskNum")
        public Integer taskNum;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskListResponseBodyDataTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyDataTaskInfo self = new QueryTaskListResponseBodyDataTaskInfo();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyDataTaskInfo setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskListResponseBodyDataTaskInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskCancelStatus(String taskCancelStatus) {
            this.taskCancelStatus = taskCancelStatus;
            return this;
        }
        public String getTaskCancelStatus() {
            return this.taskCancelStatus;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskCancelStatusCode(Integer taskCancelStatusCode) {
            this.taskCancelStatusCode = taskCancelStatusCode;
            return this;
        }
        public Integer getTaskCancelStatusCode() {
            return this.taskCancelStatusCode;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskListResponseBodyDataTaskInfo setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskListResponseBodyData extends TeaModel {
        @NameInMap("TaskInfo")
        public java.util.List<QueryTaskListResponseBodyDataTaskInfo> taskInfo;

        public static QueryTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyData self = new QueryTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyData setTaskInfo(java.util.List<QueryTaskListResponseBodyDataTaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public java.util.List<QueryTaskListResponseBodyDataTaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

    }

}
