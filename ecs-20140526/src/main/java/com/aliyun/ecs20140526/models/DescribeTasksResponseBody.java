// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TaskSet")
    public DescribeTasksResponseBodyTaskSet taskSet;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setTaskSet(DescribeTasksResponseBodyTaskSet taskSet) {
        this.taskSet = taskSet;
        return this;
    }
    public DescribeTasksResponseBodyTaskSet getTaskSet() {
        return this.taskSet;
    }

    public DescribeTasksResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeTasksResponseBodyTaskSetTask extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("SupportCancel")
        public String supportCancel;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskAction")
        public String taskAction;

        public static DescribeTasksResponseBodyTaskSetTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTaskSetTask self = new DescribeTasksResponseBodyTaskSetTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTaskSetTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeTasksResponseBodyTaskSetTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeTasksResponseBodyTaskSetTask setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeTasksResponseBodyTaskSetTask setSupportCancel(String supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }
        public String getSupportCancel() {
            return this.supportCancel;
        }

        public DescribeTasksResponseBodyTaskSetTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyTaskSetTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

    }

    public static class DescribeTasksResponseBodyTaskSet extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeTasksResponseBodyTaskSetTask> task;

        public static DescribeTasksResponseBodyTaskSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTaskSet self = new DescribeTasksResponseBodyTaskSet();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTaskSet setTask(java.util.List<DescribeTasksResponseBodyTaskSetTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyTaskSetTask> getTask() {
            return this.task;
        }

    }

}
