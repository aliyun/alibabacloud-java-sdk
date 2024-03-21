// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvShrinkRequest extends TeaModel {
    /**
     * <p>The key-value pairs. The key-value pairs can be up to 2 MB in size.</p>
     */
    @NameInMap("KvList")
    public String kvListShrink;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchPutDcdnKvShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvShrinkRequest self = new BatchPutDcdnKvShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvShrinkRequest setKvListShrink(String kvListShrink) {
        this.kvListShrink = kvListShrink;
        return this;
    }
    public String getKvListShrink() {
        return this.kvListShrink;
    }

    public BatchPutDcdnKvShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
