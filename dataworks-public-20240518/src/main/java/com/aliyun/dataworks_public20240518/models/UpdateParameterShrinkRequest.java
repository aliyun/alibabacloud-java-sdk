// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateParameterShrinkRequest extends TeaModel {
    /**
     * <p>The parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameter ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The owner\&quot;s account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The parameter value configuration. This parameter is required for the production environment. If you specify the same environment multiple times, only the first configuration is used.</p>
     */
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
