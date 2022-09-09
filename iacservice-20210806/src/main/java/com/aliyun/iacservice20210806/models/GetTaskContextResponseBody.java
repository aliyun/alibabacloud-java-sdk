// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskContextResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("task")
    public GetTaskContextResponseBodyTask task;

    public static GetTaskContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskContextResponseBody self = new GetTaskContextResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskContextResponseBody setTask(GetTaskContextResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskContextResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskContextResponseBodyTaskJobConfig extends TeaModel {
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        @NameInMap("jobModuleVersion")
        public String jobModuleVersion;

        @NameInMap("resourcesChanged")
        public String resourcesChanged;

        public static GetTaskContextResponseBodyTaskJobConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTaskContextResponseBodyTaskJobConfig self = new GetTaskContextResponseBodyTaskJobConfig();
            return TeaModel.build(map, self);
        }

        public GetTaskContextResponseBodyTaskJobConfig setIsDestroy(Boolean isDestroy) {
            this.isDestroy = isDestroy;
            return this;
        }
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        public GetTaskContextResponseBodyTaskJobConfig setJobModuleVersion(String jobModuleVersion) {
            this.jobModuleVersion = jobModuleVersion;
            return this;
        }
        public String getJobModuleVersion() {
            return this.jobModuleVersion;
        }

        public GetTaskContextResponseBodyTaskJobConfig setResourcesChanged(String resourcesChanged) {
            this.resourcesChanged = resourcesChanged;
            return this;
        }
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

    }

    public static class GetTaskContextResponseBodyTask extends TeaModel {
        @NameInMap("autoApply")
        public Boolean autoApply;

        @NameInMap("jobConfig")
        public GetTaskContextResponseBodyTaskJobConfig jobConfig;

        @NameInMap("jobDescription")
        public String jobDescription;

        @NameInMap("jobGmtCreate")
        public String jobGmtCreate;

        @NameInMap("jobId")
        public String jobId;

        @NameInMap("jobStatus")
        public String jobStatus;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("modulePath")
        public String modulePath;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        @NameInMap("ramRole")
        public String ramRole;

        @NameInMap("resourceCount")
        public Integer resourceCount;

        @NameInMap("taskGmtCreate")
        public String taskGmtCreate;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskName")
        public String taskName;

        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        @NameInMap("taskStatus")
        public String taskStatus;

        @NameInMap("terraformVersion")
        public String terraformVersion;

        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static GetTaskContextResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskContextResponseBodyTask self = new GetTaskContextResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskContextResponseBodyTask setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetTaskContextResponseBodyTask setJobConfig(GetTaskContextResponseBodyTaskJobConfig jobConfig) {
            this.jobConfig = jobConfig;
            return this;
        }
        public GetTaskContextResponseBodyTaskJobConfig getJobConfig() {
            return this.jobConfig;
        }

        public GetTaskContextResponseBodyTask setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public GetTaskContextResponseBodyTask setJobGmtCreate(String jobGmtCreate) {
            this.jobGmtCreate = jobGmtCreate;
            return this;
        }
        public String getJobGmtCreate() {
            return this.jobGmtCreate;
        }

        public GetTaskContextResponseBodyTask setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskContextResponseBodyTask setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetTaskContextResponseBodyTask setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetTaskContextResponseBodyTask setModulePath(String modulePath) {
            this.modulePath = modulePath;
            return this;
        }
        public String getModulePath() {
            return this.modulePath;
        }

        public GetTaskContextResponseBodyTask setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetTaskContextResponseBodyTask setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTaskContextResponseBodyTask setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetTaskContextResponseBodyTask setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public GetTaskContextResponseBodyTask setTaskGmtCreate(String taskGmtCreate) {
            this.taskGmtCreate = taskGmtCreate;
            return this;
        }
        public String getTaskGmtCreate() {
            return this.taskGmtCreate;
        }

        public GetTaskContextResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskContextResponseBodyTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskContextResponseBodyTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetTaskContextResponseBodyTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetTaskContextResponseBodyTask setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetTaskContextResponseBodyTask setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
