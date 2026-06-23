// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterShrinkRequest extends TeaModel {
    /**
     * <p>The description of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameter name. It must be unique within the workspace, be prefixed with <code>workspace.</code>, and not exceed 255 characters. The part of the name after the prefix must start with a letter and can contain only letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace.para</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The workspace ID. This parameter is required when <code>Scope</code> is set to <code>Project</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The value configurations for the parameter. A configuration for the production environment is required. If you provide duplicate configurations for an environment, only the first one is used.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <p>The scope of the parameter. The default value is <code>Project</code>. No other values are currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The type of the parameter.</p>
     * <ul>
     * <li><p><code>PlainConstant</code>: plaintext constant.</p>
     * </li>
     * <li><p><code>SecretConstant</code>: secret constant.</p>
     * </li>
     * <li><p><code>Variable</code>: variable.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainConstant</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateParameterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterShrinkRequest self = new CreateParameterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParameterShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParameterShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateParameterShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateParameterShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public CreateParameterShrinkRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateParameterShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
