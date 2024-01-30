// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class PollTaskResultResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public PollTaskResultResponseBodyData data;

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

    public static PollTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PollTaskResultResponseBody self = new PollTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public PollTaskResultResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public PollTaskResultResponseBody setData(PollTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PollTaskResultResponseBodyData getData() {
        return this.data;
    }

    public PollTaskResultResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public PollTaskResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PollTaskResultResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public PollTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PollTaskResultResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public PollTaskResultResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class PollTaskResultResponseBodyDataTaskDetail extends TeaModel {
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

        public static PollTaskResultResponseBodyDataTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            PollTaskResultResponseBodyDataTaskDetail self = new PollTaskResultResponseBodyDataTaskDetail();
            return TeaModel.build(map, self);
        }

        public PollTaskResultResponseBodyDataTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PollTaskResultResponseBodyDataTaskDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public PollTaskResultResponseBodyDataTaskDetail setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public PollTaskResultResponseBodyDataTaskDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public PollTaskResultResponseBodyDataTaskDetail setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public PollTaskResultResponseBodyDataTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class PollTaskResultResponseBodyData extends TeaModel {
        @NameInMap("TaskDetail")
        public java.util.List<PollTaskResultResponseBodyDataTaskDetail> taskDetail;

        public static PollTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PollTaskResultResponseBodyData self = new PollTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PollTaskResultResponseBodyData setTaskDetail(java.util.List<PollTaskResultResponseBodyDataTaskDetail> taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public java.util.List<PollTaskResultResponseBodyDataTaskDetail> getTaskDetail() {
            return this.taskDetail;
        }

    }

}
