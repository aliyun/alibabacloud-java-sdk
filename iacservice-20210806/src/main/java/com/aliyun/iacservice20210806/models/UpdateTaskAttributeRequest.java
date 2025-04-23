// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoApply")
    public Boolean autoApply;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("groupInfo")
    public UpdateTaskAttributeRequestGroupInfo groupInfo;

    @NameInMap("initModuleState")
    public Boolean initModuleState;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-148e7853433574fff6b316f4eb737e</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("protectionStrategy")
    public java.util.List<String> protectionStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("skipPropertyValidation")
    public Boolean skipPropertyValidation;

    /**
     * <strong>example:</strong>
     * <p>1.2.6</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("triggerValue")
    public String triggerValue;

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

    public UpdateTaskAttributeRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public UpdateTaskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskAttributeRequest setGroupInfo(UpdateTaskAttributeRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public UpdateTaskAttributeRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public UpdateTaskAttributeRequest setInitModuleState(Boolean initModuleState) {
        this.initModuleState = initModuleState;
        return this;
    }
    public Boolean getInitModuleState() {
        return this.initModuleState;
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

    public UpdateTaskAttributeRequest setSkipPropertyValidation(Boolean skipPropertyValidation) {
        this.skipPropertyValidation = skipPropertyValidation;
        return this;
    }
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
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

    public UpdateTaskAttributeRequest setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
        return this;
    }
    public String getTriggerValue() {
        return this.triggerValue;
    }

    public static class UpdateTaskAttributeRequestGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g-433aead7560571e66e31274ffd3</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>p-433aead75605713865c386cb9d</p>
         */
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
