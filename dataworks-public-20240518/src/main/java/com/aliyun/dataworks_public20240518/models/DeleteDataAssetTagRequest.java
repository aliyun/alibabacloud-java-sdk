// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataAssetTagRequest extends TeaModel {
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
     * <p>The tag values.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static DeleteDataAssetTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAssetTagRequest self = new DeleteDataAssetTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAssetTagRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteDataAssetTagRequest setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
