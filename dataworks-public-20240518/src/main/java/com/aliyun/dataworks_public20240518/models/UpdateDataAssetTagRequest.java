// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataAssetTagRequest extends TeaModel {
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
    public java.util.List<String> managers;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static UpdateDataAssetTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAssetTagRequest self = new UpdateDataAssetTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAssetTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataAssetTagRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateDataAssetTagRequest setManagers(java.util.List<String> managers) {
        this.managers = managers;
        return this;
    }
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    public UpdateDataAssetTagRequest setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
