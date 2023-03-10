// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAsyncTasksResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the asynchronous export tasks.</p>
     */
    @NameInMap("AsyncTasks")
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of asynchronous export tasks that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTasksResponseBody self = new DescribeAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTasksResponseBody setAsyncTasks(java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public DescribeAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAsyncTasksResponseBodyAsyncTasks extends TeaModel {
        /**
         * <p>The end time of the task. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the task. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task parameter. The value is a JSON string. The returned field in the value varies based on the value of **TaskType**.</p>
         * <br>
         * <p>If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following filed is returned:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the instance. Data type: string.</p>
         * <br>
         * <p>If **TaskType** is set to **2**, the following field is returned:</p>
         * <br>
         * <p>*   **domain**: the domain name of the website. Data type: string.</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>The execution result of the task. The value is a JSON string. The returned fields in the value vary based on the value of **TaskType**.</p>
         * <br>
         * <p>If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following fields are returned:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the instance. Data type: string.</p>
         * <p>*   **url**: the URL to download the exported file from Object Storage Service (OSS). Data type: string.</p>
         * <br>
         * <p>If **TaskType** is set to **2**, the following fields are returned:</p>
         * <br>
         * <p>*   **domain**: the domain name of the website. Data type: string.</p>
         * <p>*   **url**: the URL to download the exported file from OSS. Data type: string.</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **0**: indicates that the task is being initialized.</p>
         * <p>*   **1**: indicates that the task is in progress.</p>
         * <p>*   **2**: indicates that the task is successful.</p>
         * <p>*   **3**: indicates that the task failed.</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **1**: the task to export the port forwarding rules of an instance</p>
         * <p>*   **2**: the task to export the forwarding rules of a website protected by an instance</p>
         * <p>*   **3**: the task to export the sessions and health check settings of an instance</p>
         * <p>*   **4**: the task to export the mitigation policies of an instance</p>
         * <p>*   **5**: the task to download the blacklist for destination IP addresses of an instance</p>
         * <p>*   **6**: the task to download the whitelist for destination IP addresses of an instance</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static DescribeAsyncTasksResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncTasksResponseBodyAsyncTasks self = new DescribeAsyncTasksResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
