// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Tasks")
    @Validation(required = true)
    public DescribeDrdsDbTasksResponseTasks tasks;

    public static DescribeDrdsDbTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbTasksResponse self = new DescribeDrdsDbTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbTasksResponse setTasks(DescribeDrdsDbTasksResponseTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsDbTasksResponseTasks getTasks() {
        return this.tasks;
    }

    public static class DescribeDrdsDbTasksResponseTasksTask extends TeaModel {
        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("TaskDetail")
        @Validation(required = true)
        public String taskDetail;

        @NameInMap("TaskType")
        @Validation(required = true)
        public Integer taskType;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public Integer taskStatus;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("TaskPhase")
        @Validation(required = true)
        public String taskPhase;

        @NameInMap("ShowProgress")
        @Validation(required = true)
        public Boolean showProgress;

        @NameInMap("AllowCancel")
        @Validation(required = true)
        public Boolean allowCancel;

        @NameInMap("ParentJobId")
        @Validation(required = true)
        public String parentJobId;

        @NameInMap("ExpandType")
        @Validation(required = true)
        public String expandType;

        @NameInMap("TargetId")
        @Validation(required = true)
        public Long targetId;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("DetailTaskId")
        @Validation(required = true)
        public String detailTaskId;

        @NameInMap("TbComputeLength")
        @Validation(required = true)
        public Integer tbComputeLength;

        @NameInMap("DbComputeLength")
        @Validation(required = true)
        public Integer dbComputeLength;

        public static DescribeDrdsDbTasksResponseTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbTasksResponseTasksTask self = new DescribeDrdsDbTasksResponseTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbTasksResponseTasksTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDrdsDbTasksResponseTasksTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeDrdsDbTasksResponseTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTaskPhase(String taskPhase) {
            this.taskPhase = taskPhase;
            return this;
        }
        public String getTaskPhase() {
            return this.taskPhase;
        }

        public DescribeDrdsDbTasksResponseTasksTask setShowProgress(Boolean showProgress) {
            this.showProgress = showProgress;
            return this;
        }
        public Boolean getShowProgress() {
            return this.showProgress;
        }

        public DescribeDrdsDbTasksResponseTasksTask setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeDrdsDbTasksResponseTasksTask setParentJobId(String parentJobId) {
            this.parentJobId = parentJobId;
            return this;
        }
        public String getParentJobId() {
            return this.parentJobId;
        }

        public DescribeDrdsDbTasksResponseTasksTask setExpandType(String expandType) {
            this.expandType = expandType;
            return this;
        }
        public String getExpandType() {
            return this.expandType;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public DescribeDrdsDbTasksResponseTasksTask setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDrdsDbTasksResponseTasksTask setDetailTaskId(String detailTaskId) {
            this.detailTaskId = detailTaskId;
            return this;
        }
        public String getDetailTaskId() {
            return this.detailTaskId;
        }

        public DescribeDrdsDbTasksResponseTasksTask setTbComputeLength(Integer tbComputeLength) {
            this.tbComputeLength = tbComputeLength;
            return this;
        }
        public Integer getTbComputeLength() {
            return this.tbComputeLength;
        }

        public DescribeDrdsDbTasksResponseTasksTask setDbComputeLength(Integer dbComputeLength) {
            this.dbComputeLength = dbComputeLength;
            return this;
        }
        public Integer getDbComputeLength() {
            return this.dbComputeLength;
        }

    }

    public static class DescribeDrdsDbTasksResponseTasks extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDbTasksResponseTasksTask> task;

        public static DescribeDrdsDbTasksResponseTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbTasksResponseTasks self = new DescribeDrdsDbTasksResponseTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbTasksResponseTasks setTask(java.util.List<DescribeDrdsDbTasksResponseTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsDbTasksResponseTasksTask> getTask() {
            return this.task;
        }

    }

}
