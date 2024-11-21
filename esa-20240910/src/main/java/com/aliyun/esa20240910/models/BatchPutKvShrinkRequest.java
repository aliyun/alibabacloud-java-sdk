// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvShrinkRequest extends TeaModel {
    /**
     * <p>The key-value pairs that you want to configure at a time. The total size can be up to 2 MB (2 × 1000 × 1000).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvList")
    public String kvListShrink;

    /**
     * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
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
