// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tasks.</p>
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
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error returned when the refresh or prefetch task failed. Valid values:</p>
         * <br>
         * <p>*   **Internal Error**: An internal error occurred.</p>
         * <p>*   **Origin Timeout**: The response from the origin server timed out.</p>
         * <p>*   **Origin Return StatusCode 5XX**: The origin server returned a 5XX error.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The path of the object refreshed by the refresh task.</p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **file**: refreshes an individual file.</p>
         * <p>*   **directory**: refreshes files under the specified directory.</p>
         * <p>*   **preload**: prefetches an individual file.</p>
         * <p>*   **regex**: refreshes content based on a regular expression.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task, in percentage.</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **Complete**: The task is complete.</p>
         * <p>*   **Pending**: The task is pending.</p>
         * <p>*   **Refreshing**: The task is running.</p>
         * <p>*   **Failed**: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
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
