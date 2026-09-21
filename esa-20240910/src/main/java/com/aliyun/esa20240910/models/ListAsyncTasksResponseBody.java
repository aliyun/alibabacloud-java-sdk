// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListAsyncTasksResponseBody extends TeaModel {
    /**
     * <p>The task list.</p>
     */
    @NameInMap("AsyncTasks")
    public java.util.List<ListAsyncTasksResponseBodyAsyncTasks> asyncTasks;

    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksResponseBody self = new ListAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksResponseBody setAsyncTasks(java.util.List<ListAsyncTasksResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<ListAsyncTasksResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public ListAsyncTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAsyncTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAsyncTasksResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListAsyncTasksResponseBodyAsyncTasks extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-19 09:36:46</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-19 09:37:04</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4081****752512</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4081****752512</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>site</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The task description.</p>
         */
        @NameInMap("TaskDescription")
        public java.util.Map<String, String> taskDescription;

        /**
         * <p>The custom identifier that is set to associate with this task.</p>
         * 
         * <strong>example:</strong>
         * <p>linke-quality-sign</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        /**
         * <p>The current status of the task. Valid values:</p>
         * <ul>
         * <li>in_progress: in progress.</li>
         * <li>success: completed.</li>
         * <li>fail: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>free_cert</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1077***12880</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListAsyncTasksResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTasksResponseBodyAsyncTasks self = new ListAsyncTasksResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public ListAsyncTasksResponseBodyAsyncTasks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setTaskDescription(java.util.Map<String, String> taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public java.util.Map<String, String> getTaskDescription() {
            return this.taskDescription;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListAsyncTasksResponseBodyAsyncTasks setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
