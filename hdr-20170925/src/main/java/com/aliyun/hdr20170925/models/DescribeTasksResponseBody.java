// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tasks")
    public DescribeTasksResponseBodyTasks tasks;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTasksResponseBody setTasks(DescribeTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasksTask self = new DescribeTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasksTask setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeTasksResponseBodyTasksTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyTasksTask setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public DescribeTasksResponseBodyTasksTask setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyTasksTask setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class DescribeTasksResponseBodyTasks extends TeaModel {
        @NameInMap("task")
        public java.util.List<DescribeTasksResponseBodyTasksTask> task;

        public static DescribeTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasks self = new DescribeTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasks setTask(java.util.List<DescribeTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
