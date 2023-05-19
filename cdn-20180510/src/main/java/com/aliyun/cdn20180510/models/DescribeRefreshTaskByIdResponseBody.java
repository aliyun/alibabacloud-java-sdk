// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the task that you want to query.</p>
     * <br>
     * <p>You can call the [RefreshObjectCaches](~~91164~~) operation to query task IDs. Then, you can use the task IDs to query task status.</p>
     * <br>
     * <p>You can specify up to 10 task IDs. Separate task IDs with commas (,).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error returned when the refresh or prefetch task failed. Valid values:</p>
     * <br>
     * <p>*   **Internal Error**: An internal error occurred.</p>
     * <p>*   **Origin Timeout**: The response from the origin server timed out.</p>
     * <p>*   **Origin Return StatusCode 5XX**: The origin server returned a 5XX error.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRefreshTaskByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTaskByIdResponseBody self = new DescribeRefreshTaskByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTaskByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRefreshTaskByIdResponseBody setTasks(java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeRefreshTaskByIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRefreshTaskByIdResponseBodyTasks extends TeaModel {
        /**
         * <p>The progress of the task, in percentage.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Queries the status of refresh or prefetch tasks by ID for an accelerated domain name.</p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeRefreshTaskById**.</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRefreshTaskByIdResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTaskByIdResponseBodyTasks self = new DescribeRefreshTaskByIdResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
