// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of prefetch or refresh tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeDcdnRefreshTaskByIdResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnRefreshTaskByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTaskByIdResponseBody self = new DescribeDcdnRefreshTaskByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTaskByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnRefreshTaskByIdResponseBody setTasks(java.util.List<DescribeDcdnRefreshTaskByIdResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeDcdnRefreshTaskByIdResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeDcdnRefreshTaskByIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnRefreshTaskByIdResponseBodyTasks extends TeaModel {
        /**
         * <p>The time when the task was created. The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
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
         * <p>The path of the refresh or prefetch object.</p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the refresh or prefetch task. Valid values:</p>
         * <br>
         * <p>*   **file**: refreshes an individual file.</p>
         * <p>*   **directory**: refreshes files under the specified directory.</p>
         * <p>*   **preload**: prefetches an individual file.</p>
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

        public static DescribeDcdnRefreshTaskByIdResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRefreshTaskByIdResponseBodyTasks self = new DescribeDcdnRefreshTaskByIdResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnRefreshTaskByIdResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
