// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvList")
    public String kvListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchPutKvShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvShrinkRequest self = new BatchPutKvShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutKvShrinkRequest setKvListShrink(String kvListShrink) {
        this.kvListShrink = kvListShrink;
        return this;
    }
    public String getKvListShrink() {
        return this.kvListShrink;
    }

    public BatchPutKvShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
