// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("autoApply")
    public Boolean autoApply;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("groupInfo")
    public CreateTaskRequestGroupInfo groupInfo;

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

    @NameInMap("terraformVersion")
    public String terraformVersion;

    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public CreateTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTaskRequest setGroupInfo(CreateTaskRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public CreateTaskRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public CreateTaskRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateTaskRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTaskRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public CreateTaskRequest setProtectionStrategy(java.util.List<String> protectionStrategy) {
        this.protectionStrategy = protectionStrategy;
        return this;
    }
    public java.util.List<String> getProtectionStrategy() {
        return this.protectionStrategy;
    }

    public CreateTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateTaskRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public CreateTaskRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static class CreateTaskRequestGroupInfo extends TeaModel {
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("projectId")
        public String projectId;

        public static CreateTaskRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestGroupInfo self = new CreateTaskRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateTaskRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
