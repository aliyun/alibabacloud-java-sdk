// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The tasks.
    @NameInMap("Tasks")
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks;

    // The total number of tasks.
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
        // The time when the task was created. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The error returned when the refresh or prefetch task failed. Valid values:
        // 
        // *   **Internal Error**: An internal error occurred.
        // *   **Origin Timeout**: The response from the origin server timed out.
        // *   **Origin Return StatusCode 5XX**: The origin server returned a 5XX error.
        @NameInMap("Description")
        public String description;

        // The path of the object refreshed by the refresh task.
        @NameInMap("ObjectPath")
        public String objectPath;

        // The type of the task. Valid values:
        // 
        // *   **file**: refreshes an individual file.
        // *   **directory**: refreshes files under the specified directory.
        // *   **preload**: prefetches an individual file.
        // *   **regex**: refreshes content based on a regular expression.
        @NameInMap("ObjectType")
        public String objectType;

        // The progress of the task, in percentage.
        @NameInMap("Process")
        public String process;

        // The status of the task. Valid values:
        // 
        // *   **Complete**: The task is complete.
        // *   **Pending**: The task is pending.
        // *   **Refreshing**: The task is running.
        // *   **Failed**: The task failed.
        @NameInMap("Status")
        public String status;

        // The ID of the task.
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
