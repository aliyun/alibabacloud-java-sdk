// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterTasksResponseBody extends TeaModel {
    @NameInMap("page_info")
    public DescribeClusterTasksResponseBodyPageInfo pageInfo;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<DescribeClusterTasksResponseBodyTasks> tasks;

    public static DescribeClusterTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterTasksResponseBody self = new DescribeClusterTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterTasksResponseBody setPageInfo(DescribeClusterTasksResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeClusterTasksResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeClusterTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterTasksResponseBody setTasks(java.util.List<DescribeClusterTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeClusterTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class DescribeClusterTasksResponseBodyPageInfo extends TeaModel {
        @NameInMap("page_number")
        public Long pageNumber;

        @NameInMap("page_size")
        public Long pageSize;

        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeClusterTasksResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTasksResponseBodyPageInfo self = new DescribeClusterTasksResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTasksResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterTasksResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterTasksResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeClusterTasksResponseBodyTasksError extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static DescribeClusterTasksResponseBodyTasksError build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTasksResponseBodyTasksError self = new DescribeClusterTasksResponseBodyTasksError();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTasksResponseBodyTasksError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeClusterTasksResponseBodyTasksError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeClusterTasksResponseBodyTasks extends TeaModel {
        @NameInMap("created")
        public String created;

        @NameInMap("error")
        public DescribeClusterTasksResponseBodyTasksError error;

        @NameInMap("state")
        public String state;

        @NameInMap("task_id")
        public String taskId;

        @NameInMap("task_type")
        public String taskType;

        @NameInMap("updated")
        public String updated;

        public static DescribeClusterTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterTasksResponseBodyTasks self = new DescribeClusterTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterTasksResponseBodyTasks setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterTasksResponseBodyTasks setError(DescribeClusterTasksResponseBodyTasksError error) {
            this.error = error;
            return this;
        }
        public DescribeClusterTasksResponseBodyTasksError getError() {
            return this.error;
        }

        public DescribeClusterTasksResponseBodyTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeClusterTasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeClusterTasksResponseBodyTasks setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
