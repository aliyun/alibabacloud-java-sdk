// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRamPolicyExportTaskAttributeRequest extends TeaModel {
    @NameInMap("authorizationAccountIds")
    public java.util.List<Long> authorizationAccountIds;

    @NameInMap("authorizationActions")
    public java.util.List<String> authorizationActions;

    @NameInMap("authorizationRegionIds")
    public java.util.List<String> authorizationRegionIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-143574fff6b316f4eb737e</p>
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

    /**
     * <strong>example:</strong>
     * <p>ramName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    public static UpdateRamPolicyExportTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRamPolicyExportTaskAttributeRequest self = new UpdateRamPolicyExportTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRamPolicyExportTaskAttributeRequest setAuthorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
        this.authorizationAccountIds = authorizationAccountIds;
        return this;
    }
    public java.util.List<Long> getAuthorizationAccountIds() {
        return this.authorizationAccountIds;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setAuthorizationActions(java.util.List<String> authorizationActions) {
        this.authorizationActions = authorizationActions;
        return this;
    }
    public java.util.List<String> getAuthorizationActions() {
        return this.authorizationActions;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setAuthorizationRegionIds(java.util.List<String> authorizationRegionIds) {
        this.authorizationRegionIds = authorizationRegionIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRegionIds() {
        return this.authorizationRegionIds;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateRamPolicyExportTaskAttributeRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

}
