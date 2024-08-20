// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keys")
    public String keysShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchDeleteDcdnKvShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvShrinkRequest self = new BatchDeleteDcdnKvShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public BatchDeleteDcdnKvShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
