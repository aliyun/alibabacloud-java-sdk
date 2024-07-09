// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E0C2EF95-B1EC-4C93-855E-2059A7DA2B7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-08-03T08:54:23Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error returned when the refresh or prefetch task failed. Valid values:</p>
         * <ul>
         * <li><strong>Internal Error</strong></li>
         * <li><strong>Origin Timeout</strong></li>
         * <li><strong>Origin Return StatusCode 5XX</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The path of the object refreshed by the refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/abc.jpg">http://example.com/abc.jpg</a></p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: refreshes an individual file.</li>
         * <li><strong>directory</strong>: refreshes files in the specified directory.</li>
         * <li><strong>preload</strong>: prefetches an individual file.</li>
         * <li><strong>regex</strong>: refreshes content based on a regular expression.</li>
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
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Complete</strong></li>
         * <li><strong>Pending</strong></li>
         * <li><strong>Refreshing</strong></li>
         * <li><strong>Failed</strong></li>
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
         * <p>24840</p>
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
