// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePreloadTasksResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribePreloadTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePreloadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadTasksResponseBody self = new DescribePreloadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreloadTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePreloadTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePreloadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreloadTasksResponseBody setTasks(java.util.List<DescribePreloadTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribePreloadTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribePreloadTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePreloadTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The prefetched content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://a.com/1.jpg?b=2">http://a.com/1.jpg?b=2</a></p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-28 14:28:57</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned upon a prefetch task failure. Valid values:</p>
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
         * <p>The progress of the task, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The task status.</p>
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
         * <p>The ID of the queried task.</p>
         * 
         * <strong>example:</strong>
         * <p>1597854579687428</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribePreloadTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribePreloadTasksResponseBodyTasks self = new DescribePreloadTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribePreloadTasksResponseBodyTasks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribePreloadTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePreloadTasksResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePreloadTasksResponseBodyTasks setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribePreloadTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePreloadTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
