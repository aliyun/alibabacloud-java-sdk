// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C24C498A-09CF-54D3-8972-8DC074CF8614</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>g-59d8d22e78792ffe3d3eb6154d727</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>p-433aead756057fff47ecbfd94d76</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoDestroy")
        public Boolean autoDestroy;

        /**
         * <strong>example:</strong>
         * <p>2022-06-15T02:44:37Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>job-absdf</p>
         */
        @NameInMap("currentJobId")
        public String currentJobId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("groupInfo")
        public GetTaskResponseBodyTaskGroupInfo groupInfo;

        @NameInMap("initModuleState")
        public Boolean initModuleState;

        /**
         * <strong>example:</strong>
         * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        @NameInMap("protectionStrategy")
        public java.util.List<String> protectionStrategy;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        @NameInMap("skipPropertyValidation")
        public Boolean skipPropertyValidation;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>task-433aead756057154bda7f1c2e98</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        /**
         * <strong>example:</strong>
         * <p>1.2.6</p>
         */
        @NameInMap("terraformVersion")
        public String terraformVersion;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <strong>example:</strong>
         * <p>**<em>10</em></p>
         */
        @NameInMap("triggerValue")
        public String triggerValue;

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

        public GetTaskResponseBodyTask setAutoDestroy(Boolean autoDestroy) {
            this.autoDestroy = autoDestroy;
            return this;
        }
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
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

        public GetTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTask setGroupInfo(GetTaskResponseBodyTaskGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public GetTaskResponseBodyTaskGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public GetTaskResponseBodyTask setInitModuleState(Boolean initModuleState) {
            this.initModuleState = initModuleState;
            return this;
        }
        public Boolean getInitModuleState() {
            return this.initModuleState;
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

        public GetTaskResponseBodyTask setSkipPropertyValidation(Boolean skipPropertyValidation) {
            this.skipPropertyValidation = skipPropertyValidation;
            return this;
        }
        public Boolean getSkipPropertyValidation() {
            return this.skipPropertyValidation;
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

        public GetTaskResponseBodyTask setTriggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public String getTriggerValue() {
            return this.triggerValue;
        }

    }

}
