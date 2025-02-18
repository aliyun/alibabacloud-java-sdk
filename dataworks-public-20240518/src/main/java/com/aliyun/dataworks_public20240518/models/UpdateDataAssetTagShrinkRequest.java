// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataAssetTagShrinkRequest extends TeaModel {
    /**
     * <p>The description of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The tag key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The tag administrators.</p>
     */
    @NameInMap("Managers")
    public String managersShrink;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("Values")
    public String valuesShrink;

    public static UpdateDataAssetTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAssetTagShrinkRequest self = new UpdateDataAssetTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAssetTagShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataAssetTagShrinkRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateDataAssetTagShrinkRequest setManagersShrink(String managersShrink) {
        this.managersShrink = managersShrink;
        return this;
    }
    public String getManagersShrink() {
        return this.managersShrink;
    }

    public UpdateDataAssetTagShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

}
