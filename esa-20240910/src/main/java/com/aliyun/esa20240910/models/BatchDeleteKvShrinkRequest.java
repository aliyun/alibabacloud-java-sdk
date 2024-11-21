// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvShrinkRequest extends TeaModel {
    /**
     * <p>The keys that you want to delete. You can delete a maximum of 10,000 key-value pairs at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public String keysShrink;

    /**
     * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchDeleteKvShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteKvShrinkRequest self = new BatchDeleteKvShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteKvShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public BatchDeleteKvShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
