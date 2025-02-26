// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    /**
     * <p>The objects that are returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTasksResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setData(java.util.List<DescribeTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeTasksResponseBodyData> getData() {
        return this.data;
    }

    public DescribeTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTasksResponseBodyData extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SendFileFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>connect error.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The total number of failed subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailedChildCount")
        public Integer failedChildCount;

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-11T08:53:32Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The state of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The ID of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The level of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parameters of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>param</p>
         */
        @NameInMap("Param")
        public String param;

        /**
         * <p>The ID of the parent task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-41oan3tza16vs****</p>
         */
        @NameInMap("ParentTaskId")
        public String parentTaskId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-25nt4kk9whhok****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The execution result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Success\&quot;: True}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The total number of the subtasks that are running.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunningChildCount")
        public Integer runningChildCount;

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-11T08:53:32Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The total number of successfully executed subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("SuccessChildCount")
        public Integer successChildCount;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The state of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>StartInstance</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of subtasks of the current batch task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalChildCount")
        public Integer totalChildCount;

        public static DescribeTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyData self = new DescribeTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeTasksResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeTasksResponseBodyData setFailedChildCount(Integer failedChildCount) {
            this.failedChildCount = failedChildCount;
            return this;
        }
        public Integer getFailedChildCount() {
            return this.failedChildCount;
        }

        public DescribeTasksResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTasksResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTasksResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeTasksResponseBodyData setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeTasksResponseBodyData setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public DescribeTasksResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeTasksResponseBodyData setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public DescribeTasksResponseBodyData setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

        public DescribeTasksResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTasksResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTasksResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeTasksResponseBodyData setRunningChildCount(Integer runningChildCount) {
            this.runningChildCount = runningChildCount;
            return this;
        }
        public Integer getRunningChildCount() {
            return this.runningChildCount;
        }

        public DescribeTasksResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeTasksResponseBodyData setSuccessChildCount(Integer successChildCount) {
            this.successChildCount = successChildCount;
            return this;
        }
        public Integer getSuccessChildCount() {
            return this.successChildCount;
        }

        public DescribeTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeTasksResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeTasksResponseBodyData setTotalChildCount(Integer totalChildCount) {
            this.totalChildCount = totalChildCount;
            return this;
        }
        public Integer getTotalChildCount() {
            return this.totalChildCount;
        }

    }

}
