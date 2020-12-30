// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Tasks")
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRefreshTaskByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTaskByIdResponseBody self = new DescribeRefreshTaskByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTaskByIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeRefreshTaskByIdResponseBody setTasks(java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeRefreshTaskByIdResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeRefreshTaskByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRefreshTaskByIdResponseBodyTasks extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Process")
        public String process;

        @NameInMap("Description")
        public String description;

        @NameInMap("ObjectPath")
        public String objectPath;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRefreshTaskByIdResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefreshTaskByIdResponseBodyTasks self = new DescribeRefreshTaskByIdResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRefreshTaskByIdResponseBodyTasks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public DescribeRefreshTaskByIdResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
