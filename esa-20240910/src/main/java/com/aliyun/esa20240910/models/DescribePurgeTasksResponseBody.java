// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePurgeTasksResponseBody extends TeaModel {
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
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task list.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribePurgeTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePurgeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurgeTasksResponseBody self = new DescribePurgeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurgeTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurgeTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePurgeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurgeTasksResponseBody setTasks(java.util.List<DescribePurgeTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribePurgeTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribePurgeTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePurgeTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The refresh object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://a.com/1.jpg?b=1">http://a.com/1.jpg?b=1</a></p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The creation time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-26T01:56:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error description returned when the refresh task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The task completion progress in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p><strong>Complete</strong>: Completed.</p>
         * </li>
         * <li><p><strong>Refreshing</strong>: Refreshing.</p>
         * </li>
         * <li><p><strong>Failed</strong>: Refresh failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16346513304</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The refresh task type. Valid values:</p>
         * <ul>
         * <li><strong>file</strong> (default): file refresh.</li>
         * <li><strong>cachetag</strong>: cache tag refresh.</li>
         * <li><strong>directory</strong>: directory refresh.</li>
         * <li><strong>ignoreParams</strong>: ignore parameters refresh.</li>
         * <li><strong>hostname</strong>: hostname refresh.</li>
         * <li><strong>purgeall</strong>: purge all cache under the site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePurgeTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribePurgeTasksResponseBodyTasks self = new DescribePurgeTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribePurgeTasksResponseBodyTasks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribePurgeTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePurgeTasksResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurgeTasksResponseBodyTasks setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribePurgeTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePurgeTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePurgeTasksResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
