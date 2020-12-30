// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailListResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public QueryTaskDetailListResponseBodyData data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailListResponseBody self = new QueryTaskDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTaskDetailListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTaskDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryTaskDetailListResponseBody setData(QueryTaskDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskDetailListResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTaskDetailListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryTaskDetailListResponseBodyDataTaskDetail extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskNo")
        public String taskNo;

        @NameInMap("TaskResult")
        public String taskResult;

        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        @NameInMap("TryCount")
        public Integer tryCount;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static QueryTaskDetailListResponseBodyDataTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailListResponseBodyDataTaskDetail self = new QueryTaskDetailListResponseBodyDataTaskDetail();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class QueryTaskDetailListResponseBodyData extends TeaModel {
        @NameInMap("TaskDetail")
        public java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> taskDetail;

        public static QueryTaskDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailListResponseBodyData self = new QueryTaskDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailListResponseBodyData setTaskDetail(java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> getTaskDetail() {
            return this.taskDetail;
        }

    }

}
