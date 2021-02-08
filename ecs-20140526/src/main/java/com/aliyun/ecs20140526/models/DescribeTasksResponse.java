// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TaskSet")
    @Validation(required = true)
    public DescribeTasksResponseTaskSet taskSet;

    public static DescribeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponse self = new DescribeTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTasksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTasksResponse setTaskSet(DescribeTasksResponseTaskSet taskSet) {
        this.taskSet = taskSet;
        return this;
    }
    public DescribeTasksResponseTaskSet getTaskSet() {
        return this.taskSet;
    }

    public static class DescribeTasksResponseTaskSetTask extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("SupportCancel")
        @Validation(required = true)
        public String supportCancel;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("FinishedTime")
        @Validation(required = true)
        public String finishedTime;

        public static DescribeTasksResponseTaskSetTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseTaskSetTask self = new DescribeTasksResponseTaskSetTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseTaskSetTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseTaskSetTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseTaskSetTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeTasksResponseTaskSetTask setSupportCancel(String supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }
        public String getSupportCancel() {
            return this.supportCancel;
        }

        public DescribeTasksResponseTaskSetTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeTasksResponseTaskSetTask setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

    }

    public static class DescribeTasksResponseTaskSet extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeTasksResponseTaskSetTask> task;

        public static DescribeTasksResponseTaskSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseTaskSet self = new DescribeTasksResponseTaskSet();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseTaskSet setTask(java.util.List<DescribeTasksResponseTaskSetTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeTasksResponseTaskSetTask> getTask() {
            return this.task;
        }

    }

}
