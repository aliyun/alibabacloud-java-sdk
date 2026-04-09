// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>这是一个测试参数</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace.para</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
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
