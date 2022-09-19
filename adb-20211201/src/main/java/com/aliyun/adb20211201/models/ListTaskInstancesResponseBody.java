// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskInstances")
    public java.util.List<ListTaskInstancesResponseBodyTaskInstances> taskInstances;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesResponseBody self = new ListTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTaskInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskInstancesResponseBody setTaskInstances(java.util.List<ListTaskInstancesResponseBodyTaskInstances> taskInstances) {
        this.taskInstances = taskInstances;
        return this;
    }
    public java.util.List<ListTaskInstancesResponseBodyTaskInstances> getTaskInstances() {
        return this.taskInstances;
    }

    public ListTaskInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTaskInstancesResponseBodyTaskInstances extends TeaModel {
        @NameInMap("AlertFlag")
        public String alertFlag;

        @NameInMap("AppLink")
        public String appLink;

        @NameInMap("DryRun")
        public Integer dryRun;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecutorName")
        public String executorName;

        @NameInMap("FirstSubmitTime")
        public String firstSubmitTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MaxRetryTimes")
        public Integer maxRetryTimes;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("ProcessInstanceId")
        public Integer processInstanceId;

        @NameInMap("ProcessInstanceName")
        public String processInstanceName;

        @NameInMap("RetryInterval")
        public Integer retryInterval;

        @NameInMap("RetryTimes")
        public Integer retryTimes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TaskCode")
        public Long taskCode;

        @NameInMap("TaskDefinitionVersion")
        public Integer taskDefinitionVersion;

        @NameInMap("TaskType")
        public String taskType;

        public static ListTaskInstancesResponseBodyTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyTaskInstances self = new ListTaskInstancesResponseBodyTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyTaskInstances setAlertFlag(String alertFlag) {
            this.alertFlag = alertFlag;
            return this;
        }
        public String getAlertFlag() {
            return this.alertFlag;
        }

        public ListTaskInstancesResponseBodyTaskInstances setAppLink(String appLink) {
            this.appLink = appLink;
            return this;
        }
        public String getAppLink() {
            return this.appLink;
        }

        public ListTaskInstancesResponseBodyTaskInstances setDryRun(Integer dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Integer getDryRun() {
            return this.dryRun;
        }

        public ListTaskInstancesResponseBodyTaskInstances setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListTaskInstancesResponseBodyTaskInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTaskInstancesResponseBodyTaskInstances setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public ListTaskInstancesResponseBodyTaskInstances setFirstSubmitTime(String firstSubmitTime) {
            this.firstSubmitTime = firstSubmitTime;
            return this;
        }
        public String getFirstSubmitTime() {
            return this.firstSubmitTime;
        }

        public ListTaskInstancesResponseBodyTaskInstances setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListTaskInstancesResponseBodyTaskInstances setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public ListTaskInstancesResponseBodyTaskInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskInstancesResponseBodyTaskInstances setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public ListTaskInstancesResponseBodyTaskInstances setProcessInstanceId(Integer processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public Integer getProcessInstanceId() {
            return this.processInstanceId;
        }

        public ListTaskInstancesResponseBodyTaskInstances setProcessInstanceName(String processInstanceName) {
            this.processInstanceName = processInstanceName;
            return this;
        }
        public String getProcessInstanceName() {
            return this.processInstanceName;
        }

        public ListTaskInstancesResponseBodyTaskInstances setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public ListTaskInstancesResponseBodyTaskInstances setRetryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public Integer getRetryTimes() {
            return this.retryTimes;
        }

        public ListTaskInstancesResponseBodyTaskInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTaskInstancesResponseBodyTaskInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskInstancesResponseBodyTaskInstances setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListTaskInstancesResponseBodyTaskInstances setTaskCode(Long taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public Long getTaskCode() {
            return this.taskCode;
        }

        public ListTaskInstancesResponseBodyTaskInstances setTaskDefinitionVersion(Integer taskDefinitionVersion) {
            this.taskDefinitionVersion = taskDefinitionVersion;
            return this;
        }
        public Integer getTaskDefinitionVersion() {
            return this.taskDefinitionVersion;
        }

        public ListTaskInstancesResponseBodyTaskInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
