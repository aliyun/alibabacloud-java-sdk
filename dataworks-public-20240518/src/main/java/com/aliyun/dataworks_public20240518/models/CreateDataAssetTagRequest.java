// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataAssetTagRequest extends TeaModel {
    /**
     * <p>The description of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description</p>
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
    public java.util.List<String> managers;

    /**
     * <p>The type of the tag value. Valid values:</p>
     * <ul>
     * <li>Boolean</li>
     * <li>Int</li>
     * <li>String</li>
     * <li>Double</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("ValueType")
    public String valueType;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static CreateDataAssetTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAssetTagRequest self = new CreateDataAssetTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAssetTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataAssetTagRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateDataAssetTagRequest setManagers(java.util.List<String> managers) {
        this.managers = managers;
        return this;
    }
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    public CreateDataAssetTagRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public CreateDataAssetTagRequest setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
