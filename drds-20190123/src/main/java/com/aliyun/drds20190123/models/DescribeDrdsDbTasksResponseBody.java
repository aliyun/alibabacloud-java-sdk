// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbTasksResponseBody extends TeaModel {
    @NameInMap("Tasks")
    public DescribeDrdsDbTasksResponseBodyTasks tasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDbTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbTasksResponseBody self = new DescribeDrdsDbTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbTasksResponseBody setTasks(DescribeDrdsDbTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsDbTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeDrdsDbTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDbTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("TaskPhase")
        public String taskPhase;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("TbComputeLength")
        public Integer tbComputeLength;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("ParentJobId")
        public String parentJobId;

        @NameInMap("Label")
        public String label;

        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("DbComputeLength")
        public Integer dbComputeLength;

        @NameInMap("AllowCancel")
        public Boolean allowCancel;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("ShowProgress")
        public Boolean showProgress;

        @NameInMap("TaskDetail")
        public String taskDetail;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("DetailTaskId")
        public String detailTaskId;

        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("ExpandType")
        public String expandType;

        public static DescribeDrdsDbTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbTasksResponseBodyTasksTask self = new DescribeDrdsDbTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTaskPhase(String taskPhase) {
            this.taskPhase = taskPhase;
            return this;
        }
        public String getTaskPhase() {
            return this.taskPhase;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTbComputeLength(Integer tbComputeLength) {
            this.tbComputeLength = tbComputeLength;
            return this;
        }
        public Integer getTbComputeLength() {
            return this.tbComputeLength;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setDbComputeLength(Integer dbComputeLength) {
            this.dbComputeLength = dbComputeLength;
            return this;
        }
        public Integer getDbComputeLength() {
            return this.dbComputeLength;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setShowProgress(Boolean showProgress) {
            this.showProgress = showProgress;
            return this;
        }
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setDetailTaskId(String detailTaskId) {
            this.detailTaskId = detailTaskId;
            return this;
        }
        public String getDetailTaskId() {
            return this.detailTaskId;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public DescribeDrdsDbTasksResponseBodyTasksTask setExpandType(String expandType) {
            this.expandType = expandType;
            return this;
        }
        public String getExpandType() {
            return this.expandType;
        }

    }

    public static class DescribeDrdsDbTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeDrdsDbTasksResponseBodyTasksTask> task;

        public static DescribeDrdsDbTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbTasksResponseBodyTasks self = new DescribeDrdsDbTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbTasksResponseBodyTasks setTask(java.util.List<DescribeDrdsDbTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsDbTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
