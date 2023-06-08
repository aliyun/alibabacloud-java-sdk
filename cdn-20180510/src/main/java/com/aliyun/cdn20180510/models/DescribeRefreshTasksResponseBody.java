// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Tasks")
    public DescribeRefreshTasksResponseBodyTasks tasks;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of the error returned when the refresh or prefetch task failed. Valid values:</p>
         * <br>
         * <p>*   **InternalError**: An internal error occurred.</p>
         * <p>*   **OriginTimeout**: The response from the origin server timed out.</p>
         * <p>*   **OriginReturnStatusCode 5XX**: The origin server returned a 5XX error.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the object refreshed.</p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task.</p>
         * <br>
         * <p>*   **file**: refreshes one or more files.</p>
         * <p>*   **directory**: refreshes files in the specified directories.</p>
         * <p>*   **regex**: refreshes content based on a regular expression.</p>
         * <p>*   **preload**: prefetches one or more files.</p>
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
         * <p>*   **Complete**: The task has completed.</p>
         * <p>*   **Refreshing**: The task is in progress.</p>
         * <p>*   **Failed**: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
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
