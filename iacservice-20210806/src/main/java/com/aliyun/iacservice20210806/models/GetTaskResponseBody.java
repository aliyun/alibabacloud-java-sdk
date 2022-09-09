// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTaskGroupInfo extends TeaModel {
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("projectName")
        public String projectName;

        public static GetTaskResponseBodyTaskGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskGroupInfo self = new GetTaskResponseBodyTaskGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetTaskResponseBodyTaskGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetTaskResponseBodyTaskGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTaskGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        @NameInMap("autoApply")
        public Boolean autoApply;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("currentJobId")
        public String currentJobId;

        @NameInMap("groupInfo")
        public GetTaskResponseBodyTaskGroupInfo groupInfo;

        @NameInMap("meta")
        public java.util.Map<String, String> meta;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        @NameInMap("protectionStrategy")
        public java.util.List<String> protectionStrategy;

        @NameInMap("ramRole")
        public String ramRole;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        @NameInMap("terraformVersion")
        public String terraformVersion;

        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public GetTaskResponseBodyTask setGroupInfo(GetTaskResponseBodyTaskGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public GetTaskResponseBodyTaskGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public GetTaskResponseBodyTask setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

        public GetTaskResponseBodyTask setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetTaskResponseBodyTask setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTask setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTaskResponseBodyTask setProtectionStrategy(java.util.List<String> protectionStrategy) {
            this.protectionStrategy = protectionStrategy;
            return this;
        }
        public java.util.List<String> getProtectionStrategy() {
            return this.protectionStrategy;
        }

        public GetTaskResponseBodyTask setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResponseBodyTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetTaskResponseBodyTask setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetTaskResponseBodyTask setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
