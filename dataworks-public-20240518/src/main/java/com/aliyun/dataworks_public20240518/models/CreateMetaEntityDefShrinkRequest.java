// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaEntityDefShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeDefs")
    public String attributeDefsShrink;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>biz_api</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateMetaEntityDefShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaEntityDefShrinkRequest self = new CreateMetaEntityDefShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaEntityDefShrinkRequest setAttributeDefsShrink(String attributeDefsShrink) {
        this.attributeDefsShrink = attributeDefsShrink;
        return this;
    }
    public String getAttributeDefsShrink() {
        return this.attributeDefsShrink;
    }

    public CreateMetaEntityDefShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetaEntityDefShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateMetaEntityDefShrinkRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateMetaEntityDefShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
