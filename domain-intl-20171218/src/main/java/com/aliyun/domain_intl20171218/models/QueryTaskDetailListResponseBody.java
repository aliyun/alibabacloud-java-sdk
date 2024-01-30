// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTaskDetailListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTaskDetailListResponseBodyData data;

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

    public static QueryTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailListResponseBody self = new QueryTaskDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTaskDetailListResponseBody setData(QueryTaskDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskDetailListResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskDetailListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTaskDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTaskDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTaskDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTaskDetailListResponseBodyDataTaskDetail extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        @NameInMap("TaskNo")
        public String taskNo;

        @NameInMap("TaskResult")
        public String taskResult;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        @NameInMap("TryCount")
        public Integer tryCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailListResponseBodyDataTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailListResponseBodyDataTaskDetail self = new QueryTaskDetailListResponseBodyDataTaskDetail();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
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

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
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

        public QueryTaskDetailListResponseBodyDataTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
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
