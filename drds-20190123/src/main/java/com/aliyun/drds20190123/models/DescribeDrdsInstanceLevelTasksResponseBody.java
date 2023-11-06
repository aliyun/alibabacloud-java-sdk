// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceLevelTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of returned unfinished tasks.</p>
     */
    @NameInMap("Tasks")
    public DescribeDrdsInstanceLevelTasksResponseBodyTasks tasks;

    public static DescribeDrdsInstanceLevelTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceLevelTasksResponseBody self = new DescribeDrdsInstanceLevelTasksResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDrdsInstanceLevelTasksResponseBody setTasks(DescribeDrdsInstanceLevelTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsInstanceLevelTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class DescribeDrdsInstanceLevelTasksResponseBodyTasksTask extends TeaModel {
        /**
         * <p>Indicates whether the task can be canceled.</p>
         */
        @NameInMap("AllowCancel")
        public Boolean allowCancel;

        /**
         * <p>The error message returned for the task.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The timestamp when the task is created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The progress of the task. Valid values: 0 to 100.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The description of the task progress.</p>
         */
        @NameInMap("ProgressDescription")
        public String progressDescription;

        /**
         * <p>Indicates whether the progress of the task is displayed.</p>
         */
        @NameInMap("ShowProgress")
        public Boolean showProgress;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TargetId")
        public Long targetId;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The phase of the task.</p>
         */
        @NameInMap("TaskPhase")
        public String taskPhase;

        /**
         * <p>The state of the task. Valid values:</p>
         * <br>
         * <p>*   0: The task is being executed.</p>
         * <p>*   1: The task is executed.</p>
         * <p>*   2: The task failed to be executed.</p>
         * <p>*   3: The task is canceled.</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The type of the task.</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static DescribeDrdsInstanceLevelTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceLevelTasksResponseBodyTasksTask self = new DescribeDrdsInstanceLevelTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setProgressDescription(String progressDescription) {
            this.progressDescription = progressDescription;
            return this;
        }
        public String getProgressDescription() {
            return this.progressDescription;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setShowProgress(Boolean showProgress) {
            this.showProgress = showProgress;
            return this;
        }
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskPhase(String taskPhase) {
            this.taskPhase = taskPhase;
            return this;
        }
        public String getTaskPhase() {
            return this.taskPhase;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeDrdsInstanceLevelTasksResponseBodyTasksTask setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
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
