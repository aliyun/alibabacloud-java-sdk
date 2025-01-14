// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataAssetTagShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("Managers")
    public String managersShrink;

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
