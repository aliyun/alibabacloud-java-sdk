// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvShrinkRequest extends TeaModel {
    /**
     * <p>List of keys to delete in bulk. You can delete up to 10,000 keys.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public String keysShrink;

    /**
     * <p>Name specified when you call <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a>.</p>
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
