// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The namespace that you specify when you call the PutDcdnKvNamespace operation.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvRequest self = new DeleteDcdnKvRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteDcdnKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
