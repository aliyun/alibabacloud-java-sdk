// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public DescribeRefreshTasksResponseBodyTasks tasks;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ObjectPath")
        public String objectPath;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Process")
        public String process;

        @NameInMap("Status")
        public String status;

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
