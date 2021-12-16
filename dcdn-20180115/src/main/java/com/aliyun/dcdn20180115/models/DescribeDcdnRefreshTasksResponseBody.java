// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public DescribeDcdnRefreshTasksResponseBodyTasks tasks;

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
