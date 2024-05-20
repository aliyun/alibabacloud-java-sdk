// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListTaskInstancesResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesResponseBody self = new ListTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesResponseBody setData(java.util.List<ListTaskInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTaskInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListTaskInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskInstancesResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListTaskInstancesResponseBodyData extends TeaModel {
        @NameInMap("DryRun")
        public String dryRun;

        @NameInMap("EmrClusterId")
        public String emrClusterId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExternalAppId")
        public String externalAppId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetryTimes")
        public Integer retryTimes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        @NameInMap("TaskInstanceName")
        public String taskInstanceName;

        @NameInMap("TaskParams")
        public String taskParams;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskVersion")
        public String taskVersion;

        @NameInMap("WorkflowInstanceId")
        public String workflowInstanceId;

        public static ListTaskInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstancesResponseBodyData self = new ListTaskInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskInstancesResponseBodyData setDryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public String getDryRun() {
            return this.dryRun;
        }

        public ListTaskInstancesResponseBodyData setEmrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        public ListTaskInstancesResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTaskInstancesResponseBodyData setExternalAppId(String externalAppId) {
            this.externalAppId = externalAppId;
            return this;
        }
        public String getExternalAppId() {
            return this.externalAppId;
        }

        public ListTaskInstancesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTaskInstancesResponseBodyData setRetryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public Integer getRetryTimes() {
            return this.retryTimes;
        }

        public ListTaskInstancesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTaskInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskInstancesResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListTaskInstancesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTaskInstancesResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public ListTaskInstancesResponseBodyData setTaskInstanceName(String taskInstanceName) {
            this.taskInstanceName = taskInstanceName;
            return this;
        }
        public String getTaskInstanceName() {
            return this.taskInstanceName;
        }

        public ListTaskInstancesResponseBodyData setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListTaskInstancesResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTaskInstancesResponseBodyData setTaskVersion(String taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public String getTaskVersion() {
            return this.taskVersion;
        }

        public ListTaskInstancesResponseBodyData setWorkflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public String getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

    }

}
