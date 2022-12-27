// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details about the task.
    @NameInMap("Tasks")
    public DescribeRefreshTasksResponseBodyTasks tasks;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTasksResponseBody self = new DescribeRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRefreshTasksResponseBody setTasks(DescribeRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRefreshTasksResponseBodyTasksCDNTask extends TeaModel {
        // The time when the task was created. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The type of the error returned when the refresh or prefetch task failed. Valid values:
        // 
        // *   **InternalError**: An internal error occurred.
        // *   **OriginTimeout**: The response from the origin server timed out.
        // *   **OriginReturn StatusCode 5XX**: The origin server returned a 5XX error.
        @NameInMap("Description")
        public String description;

        // The URL of the object to be refreshed.
        @NameInMap("ObjectPath")
        public String objectPath;

        // The type of the task.
        // 
        // *   **file**: refreshes one or more files.
        // *   **directory**: refreshes files under the specified directories.
        // *   **regex**: refreshes content based on a regular expression.
        // *   **preload**: prefetches one or more files.
        @NameInMap("ObjectType")
        public String objectType;

        // The progress of the task, in percentage.
        @NameInMap("Process")
        public String process;

        // The status. Valid values:
        // 
        // *   **Complete**: The task has completed.
        // *   **Refreshing**: The task is running.
        // *   **Failed**: The task failed.
        // *   **Pending**: The task is pending.
        @NameInMap("Status")
        public String status;

        // The ID of the task.
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRefreshTasksResponseBodyTasksCDNTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTasksResponseBodyTasksCDNTask self = new DescribeRefreshTasksResponseBodyTasksCDNTask();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRefreshTasksResponseBodyTasksCDNTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeRefreshTasksResponseBodyTasks extends TeaModel {
        @NameInMap("CDNTask")
        public java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> CDNTask;

        public static DescribeRefreshTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTasksResponseBodyTasks self = new DescribeRefreshTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTasksResponseBodyTasks setCDNTask(java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> CDNTask) {
            this.CDNTask = CDNTask;
            return this;
        }
        public java.util.List<DescribeRefreshTasksResponseBodyTasksCDNTask> getCDNTask() {
            return this.CDNTask;
        }

    }

}
