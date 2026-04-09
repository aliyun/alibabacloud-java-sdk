// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateParameterShrinkRequest extends TeaModel {
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
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Properties")
    public String propertiesShrink;

    public static UpdateParameterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterShrinkRequest self = new UpdateParameterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParameterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParameterShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateParameterShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateParameterShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

}
