// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateModelTemplateRequest extends TeaModel {
    /**
     * <p>The model group configuration JSON object. You can use this field to modify the default model. The configuration format varies depending on the agent provider (AgentProvider):</p>
     * <ul>
     * <li><p><strong>OpenClaw / AgenticComputer scenarios:</strong>
     * Set the default model by using the <code>defaults.model.primary</code> field in the format of <code>provider name/model code</code>.</p>
     * </li>
     * <li><p><strong>HermesAgent scenarios:</strong>
     * Specify the provider name by using <code>model.provider</code> and the model code by using <code>model.default</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Note:</p>
     * <ul>
     * <li>When you modify the default model, the system verifies whether the specified provider and model code already exist in the model group.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw：
     * {&quot;defaults&quot;:{&quot;model&quot;:{&quot;primary&quot;:&quot;bailian/qwen3.5-plus&quot;}}}</p>
     * <p>HermesAgent：
     * {&quot;model&quot;:{&quot;provider&quot;:&quot;bailian&quot;,&quot;default&quot;:&quot;qwen3.5-plus&quot;}}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The template group description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test model group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The template group name.</p>
     * 
     * <strong>example:</strong>
     * <p>model-template-001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The authorization scope. This parameter is optional and can be modified only for Common model groups. Valid values: ALL_USER and USER_MIXED.</p>
     */
    @NameInMap("RefScope")
    public String refScope;

    public static UpdateModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTemplateRequest self = new UpdateModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateModelTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public UpdateModelTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelTemplateRequest setRefScope(String refScope) {
        this.refScope = refScope;
        return this;
    }
    public String getRefScope() {
        return this.refScope;
    }

}
