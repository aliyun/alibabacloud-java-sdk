// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateExplorerTaskRequest extends TeaModel {
    @NameInMap("InitModuleState")
    public Boolean initModuleState;

    @NameInMap("TerraformVersion")
    public String terraformVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("autoApply")
    public Boolean autoApply;

    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("skipPropertyValidation")
    public Boolean skipPropertyValidation;

    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    @NameInMap("triggerValue")
    public String triggerValue;

    public static CreateExplorerTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExplorerTaskRequest self = new CreateExplorerTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateExplorerTaskRequest setInitModuleState(Boolean initModuleState) {
        this.initModuleState = initModuleState;
        return this;
    }
    public Boolean getInitModuleState() {
        return this.initModuleState;
    }

    public CreateExplorerTaskRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public CreateExplorerTaskRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public CreateExplorerTaskRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public CreateExplorerTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExplorerTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExplorerTaskRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateExplorerTaskRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateExplorerTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExplorerTaskRequest setSkipPropertyValidation(Boolean skipPropertyValidation) {
        this.skipPropertyValidation = skipPropertyValidation;
        return this;
    }
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    public CreateExplorerTaskRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public CreateExplorerTaskRequest setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
        return this;
    }
    public String getTriggerValue() {
        return this.triggerValue;
    }

}
