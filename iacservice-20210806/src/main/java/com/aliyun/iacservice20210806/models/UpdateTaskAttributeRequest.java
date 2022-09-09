// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskAttributeRequest extends TeaModel {
    @NameInMap("autoApply")
    public Boolean autoApply;

    @NameInMap("groupInfo")
    public UpdateTaskAttributeRequestGroupInfo groupInfo;

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

    public static UpdateTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAttributeRequest self = new UpdateTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAttributeRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public UpdateTaskAttributeRequest setGroupInfo(UpdateTaskAttributeRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public UpdateTaskAttributeRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public UpdateTaskAttributeRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateTaskAttributeRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public UpdateTaskAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskAttributeRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public UpdateTaskAttributeRequest setProtectionStrategy(java.util.List<String> protectionStrategy) {
        this.protectionStrategy = protectionStrategy;
        return this;
    }
    public java.util.List<String> getProtectionStrategy() {
        return this.protectionStrategy;
    }

    public UpdateTaskAttributeRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateTaskAttributeRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public UpdateTaskAttributeRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static class UpdateTaskAttributeRequestGroupInfo extends TeaModel {
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("projectId")
        public String projectId;

        public static UpdateTaskAttributeRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAttributeRequestGroupInfo self = new UpdateTaskAttributeRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAttributeRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateTaskAttributeRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
