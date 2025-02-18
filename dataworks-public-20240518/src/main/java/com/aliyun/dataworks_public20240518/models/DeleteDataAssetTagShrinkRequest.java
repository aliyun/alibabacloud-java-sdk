// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataAssetTagShrinkRequest extends TeaModel {
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
    public String valuesShrink;

    public static DeleteDataAssetTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAssetTagShrinkRequest self = new DeleteDataAssetTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAssetTagShrinkRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteDataAssetTagShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

}
