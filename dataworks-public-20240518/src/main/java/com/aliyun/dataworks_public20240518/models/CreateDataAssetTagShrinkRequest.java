// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataAssetTagShrinkRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("ValueType")
    public String valueType;

    @NameInMap("Values")
    public String valuesShrink;

    public static CreateDataAssetTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAssetTagShrinkRequest self = new CreateDataAssetTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAssetTagShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataAssetTagShrinkRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateDataAssetTagShrinkRequest setManagersShrink(String managersShrink) {
        this.managersShrink = managersShrink;
        return this;
    }
    public String getManagersShrink() {
        return this.managersShrink;
    }

    public CreateDataAssetTagShrinkRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public CreateDataAssetTagShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

}
