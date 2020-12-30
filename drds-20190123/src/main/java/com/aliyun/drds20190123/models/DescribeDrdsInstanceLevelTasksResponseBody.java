// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceLevelTasksResponseBody extends TeaModel {
    @NameInMap("Tasks")
    public DescribeDrdsInstanceLevelTasksResponseBodyTasks tasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceLevelTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceLevelTasksResponseBody self = new DescribeDrdsInstanceLevelTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceLevelTasksResponseBody setTasks(DescribeDrdsInstanceLevelTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsInstanceLevelTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeDrdsInstanceLevelTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceLevelTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceLevelTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("TaskPhase")
        public String taskPhase;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("AllowCancel")
        public Boolean allowCancel;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("ShowProgress")
        public Boolean showProgress;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("ProgressDescription")
        public String progressDescription;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static DescribeDrdsInstanceLevelTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceLevelTasksResponseBodyTasksTask self = new DescribeDrdsInstanceLevelTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskPhase(String taskPhase) {
            this.taskPhase = taskPhase;
            return this;
        }
        public String getTaskPhase() {
            return this.taskPhase;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setShowProgress(Boolean showProgress) {
            this.showProgress = showProgress;
            return this;
        }
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setProgressDescription(String progressDescription) {
            this.progressDescription = progressDescription;
            return this;
        }
        public String getProgressDescription() {
            return this.progressDescription;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DescribeDrdsInstanceLevelTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeDrdsInstanceLevelTasksResponseBodyTasksTask> task;

        public static DescribeDrdsInstanceLevelTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceLevelTasksResponseBodyTasks self = new DescribeDrdsInstanceLevelTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasks setTask(java.util.List<DescribeDrdsInstanceLevelTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceLevelTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
