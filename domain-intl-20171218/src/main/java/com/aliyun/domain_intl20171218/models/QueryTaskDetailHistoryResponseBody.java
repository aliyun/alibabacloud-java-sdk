// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryResponseBody extends TeaModel {
    @NameInMap("CurrentPageCursor")
    public QueryTaskDetailHistoryResponseBodyCurrentPageCursor currentPageCursor;

    @NameInMap("NextPageCursor")
    public QueryTaskDetailHistoryResponseBodyNextPageCursor nextPageCursor;

    @NameInMap("Objects")
    public java.util.List<QueryTaskDetailHistoryResponseBodyObjects> objects;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePageCursor")
    public QueryTaskDetailHistoryResponseBodyPrePageCursor prePageCursor;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskDetailHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailHistoryResponseBody self = new QueryTaskDetailHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailHistoryResponseBody setCurrentPageCursor(QueryTaskDetailHistoryResponseBodyCurrentPageCursor currentPageCursor) {
        this.currentPageCursor = currentPageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyCurrentPageCursor getCurrentPageCursor() {
        return this.currentPageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setNextPageCursor(QueryTaskDetailHistoryResponseBodyNextPageCursor nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyNextPageCursor getNextPageCursor() {
        return this.nextPageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setObjects(java.util.List<QueryTaskDetailHistoryResponseBodyObjects> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<QueryTaskDetailHistoryResponseBodyObjects> getObjects() {
        return this.objects;
    }

    public QueryTaskDetailHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailHistoryResponseBody setPrePageCursor(QueryTaskDetailHistoryResponseBodyPrePageCursor prePageCursor) {
        this.prePageCursor = prePageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyPrePageCursor getPrePageCursor() {
        return this.prePageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTaskDetailHistoryResponseBodyCurrentPageCursor extends TeaModel {
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

        public static QueryTaskDetailHistoryResponseBodyCurrentPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyCurrentPageCursor self = new QueryTaskDetailHistoryResponseBodyCurrentPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyNextPageCursor extends TeaModel {
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

        public static QueryTaskDetailHistoryResponseBodyNextPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyNextPageCursor self = new QueryTaskDetailHistoryResponseBodyNextPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyObjects extends TeaModel {
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

        public static QueryTaskDetailHistoryResponseBodyObjects build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyObjects self = new QueryTaskDetailHistoryResponseBodyObjects();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyObjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyPrePageCursor extends TeaModel {
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

        public static QueryTaskDetailHistoryResponseBodyPrePageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyPrePageCursor self = new QueryTaskDetailHistoryResponseBodyPrePageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
