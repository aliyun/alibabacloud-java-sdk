// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyShrinkRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures request idempotency, preventing duplicate operations if you retry the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the strategy. This value is constrained by the <code>SecurityStrategySchema</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p><strong>The control scope. Valid values: Workspace and Tenant.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tenant</p>
     */
    @NameInMap("ControlDwScope")
    public String controlDwScope;

    /**
     * <p><strong>Control module</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p><strong>Control submodule</strong></p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p><strong>Strategy description</strong></p>
     * 
     * <strong>example:</strong>
     * <p>控制数据分析模块的查询结果安全行为</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><strong>Strategy name</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认数据分析策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p><strong>Schema template name</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuerySecurityStrategySchema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>A list of associated workspace IDs.</p>
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
