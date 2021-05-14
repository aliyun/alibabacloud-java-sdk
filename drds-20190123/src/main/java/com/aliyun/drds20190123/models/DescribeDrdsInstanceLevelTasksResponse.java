// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceLevelTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Tasks")
    @Validation(required = true)
    public DescribeDrdsInstanceLevelTasksResponseTasks tasks;

    public static DescribeDrdsInstanceLevelTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceLevelTasksResponse self = new DescribeDrdsInstanceLevelTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceLevelTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceLevelTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceLevelTasksResponse setTasks(DescribeDrdsInstanceLevelTasksResponseTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsInstanceLevelTasksResponseTasks getTasks() {
        return this.tasks;
    }

    public static class DescribeDrdsInstanceLevelTasksResponseTasksTask extends TeaModel {
        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("TaskType")
        @Validation(required = true)
        public Integer taskType;

        @NameInMap("TargetId")
        @Validation(required = true)
        public Long targetId;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public Integer taskStatus;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("ProgressDescription")
        @Validation(required = true)
        public String progressDescription;

        @NameInMap("TaskPhase")
        @Validation(required = true)
        public String taskPhase;

        @NameInMap("ErrMsg")
        @Validation(required = true)
        public String errMsg;

        @NameInMap("ShowProgress")
        @Validation(required = true)
        public Boolean showProgress;

        @NameInMap("AllowCancel")
        @Validation(required = true)
        public Boolean allowCancel;

        public static DescribeDrdsInstanceLevelTasksResponseTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceLevelTasksResponseTasksTask self = new DescribeDrdsInstanceLevelTasksResponseTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setProgressDescription(String progressDescription) {
            this.progressDescription = progressDescription;
            return this;
        }
        public String getProgressDescription() {
            return this.progressDescription;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setTaskPhase(String taskPhase) {
            this.taskPhase = taskPhase;
            return this;
        }
        public String getTaskPhase() {
            return this.taskPhase;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setShowProgress(Boolean showProgress) {
            this.showProgress = showProgress;
            return this;
        }
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        public DescribeDrdsInstanceLevelTasksResponseTasksTask setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

    }

    public static class DescribeDrdsInstanceLevelTasksResponseTasks extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstanceLevelTasksResponseTasksTask> task;

        public static DescribeDrdsInstanceLevelTasksResponseTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceLevelTasksResponseTasks self = new DescribeDrdsInstanceLevelTasksResponseTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceLevelTasksResponseTasks setTask(java.util.List<DescribeDrdsInstanceLevelTasksResponseTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceLevelTasksResponseTasksTask> getTask() {
            return this.task;
        }

    }

}
