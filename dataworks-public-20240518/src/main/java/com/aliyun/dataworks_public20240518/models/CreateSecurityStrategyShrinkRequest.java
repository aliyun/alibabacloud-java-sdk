// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency parameter. This parameter is used to prevent duplicate operations caused by multiple calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The policy content. The content is constrained by SecurityStrategySchema.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The control scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tenant</p>
     */
    @NameInMap("ControlDwScope")
    public String controlDwScope;

    /**
     * <p>The control module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p>The control submodule.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Controls the security behavior of query results in the data analysis module</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Default data analysis policy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the schema template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuerySecurityStrategySchema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The list of associated workspace IDs.</p>
     */
    @NameInMap("Workspaces")
    public String workspacesShrink;

    public static CreateSecurityStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityStrategyShrinkRequest self = new CreateSecurityStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityStrategyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecurityStrategyShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public CreateSecurityStrategyShrinkRequest setControlDwScope(String controlDwScope) {
        this.controlDwScope = controlDwScope;
        return this;
    }
    public String getControlDwScope() {
        return this.controlDwScope;
    }

    public CreateSecurityStrategyShrinkRequest setControlModule(String controlModule) {
        this.controlModule = controlModule;
        return this;
    }
    public String getControlModule() {
        return this.controlModule;
    }

    public CreateSecurityStrategyShrinkRequest setControlSubModule(String controlSubModule) {
        this.controlSubModule = controlSubModule;
        return this;
    }
    public String getControlSubModule() {
        return this.controlSubModule;
    }

    public CreateSecurityStrategyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecurityStrategyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecurityStrategyShrinkRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public CreateSecurityStrategyShrinkRequest setWorkspacesShrink(String workspacesShrink) {
        this.workspacesShrink = workspacesShrink;
        return this;
    }
    public String getWorkspacesShrink() {
        return this.workspacesShrink;
    }

}
