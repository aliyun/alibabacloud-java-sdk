// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>174F6032-AA26-470D-B90E-36F0EB205BEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Tasks")
    public DescribeDcdnRefreshTasksResponseBodyTasks tasks;

    /**
     * <p>The number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTasksResponseBody self = new DescribeDcdnRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnRefreshTasksResponseBody setTasks(DescribeDcdnRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDcdnRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeDcdnRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnRefreshTasksResponseBodyTasksTask extends TeaModel {
        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-11-27T08:23:22Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of error returned when the refresh or prefetch task has failed.</p>
         * <ul>
         * <li><strong>InternalError</strong>: An internal error occurred.</li>
         * <li><strong>OriginTimeout</strong>: The response from the origin server timed out.</li>
         * <li><strong>OriginReturn StatusCode 5XX</strong>: The origin server returned a 5XX error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the object refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/examplefile.txt">http://example.com/examplefile.txt</a></p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task.</p>
         * <ul>
         * <li><strong>file</strong>: URL-based refresh</li>
         * <li><strong>path</strong>: directory-based refresh</li>
         * <li><strong>preload</strong>: URL-based prefetch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><strong>Complete</strong>: The task is complete.</li>
         * <li><strong>Refreshing</strong>: The task is in progress.</li>
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
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeDcdnRefreshTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRefreshTasksResponseBodyTasksTask self = new DescribeDcdnRefreshTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnRefreshTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeDcdnRefreshTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeDcdnRefreshTasksResponseBodyTasksTask> task;

        public static DescribeDcdnRefreshTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRefreshTasksResponseBodyTasks self = new DescribeDcdnRefreshTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRefreshTasksResponseBodyTasks setTask(java.util.List<DescribeDcdnRefreshTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDcdnRefreshTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
