// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvRequest extends TeaModel {
    @NameInMap("Keys")
    public java.util.List<String> keys;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchDeleteDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvRequest self = new BatchDeleteDcdnKvRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public BatchDeleteDcdnKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
