// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0C2EF95-B1EC-4C93-855E-2059A7DA2B7B</p>
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
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T08:54:23Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error returned when the refresh or prefetch task failed. Valid values:</p>
         * <ul>
         * <li><strong>Internal Error</strong>: An internal error occurred.</li>
         * <li><strong>Origin Timeout</strong>: The response from the origin server timed out.</li>
         * <li><strong>Origin Return StatusCode 5XX</strong>: The origin server returned a 5XX error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The path of the refresh or prefetch object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/image_01.png">http://example.com/image_01.png</a></p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the refresh or prefetch task. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: refreshes an individual file.</li>
         * <li><strong>directory</strong>: refreshes files under the specified directory.</li>
         * <li><strong>preload</strong>: prefetches an individual file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>Complete</strong>: The task is complete.</li>
         * <li><strong>Pending</strong>: The task is pending.</li>
         * <li><strong>Refreshing</strong>: The task is running.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>113681**</p>
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
