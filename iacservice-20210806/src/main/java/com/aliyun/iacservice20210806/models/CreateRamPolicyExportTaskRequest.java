// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRamPolicyExportTaskRequest extends TeaModel {
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
     * <p>2da11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-148e785fff6b316f4eb737e</p>
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

    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    public static CreateRamPolicyExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRamPolicyExportTaskRequest self = new CreateRamPolicyExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRamPolicyExportTaskRequest setAuthorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
        this.authorizationAccountIds = authorizationAccountIds;
        return this;
    }
    public java.util.List<Long> getAuthorizationAccountIds() {
        return this.authorizationAccountIds;
    }

    public CreateRamPolicyExportTaskRequest setAuthorizationActions(java.util.List<String> authorizationActions) {
        this.authorizationActions = authorizationActions;
        return this;
    }
    public java.util.List<String> getAuthorizationActions() {
        return this.authorizationActions;
    }

    public CreateRamPolicyExportTaskRequest setAuthorizationRegionIds(java.util.List<String> authorizationRegionIds) {
        this.authorizationRegionIds = authorizationRegionIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRegionIds() {
        return this.authorizationRegionIds;
    }

    public CreateRamPolicyExportTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRamPolicyExportTaskRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateRamPolicyExportTaskRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateRamPolicyExportTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRamPolicyExportTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateRamPolicyExportTaskRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public CreateRamPolicyExportTaskRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

}
