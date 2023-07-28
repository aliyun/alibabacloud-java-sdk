// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnKvNamespaceRequest extends TeaModel {
    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteDcdnKvNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnKvNamespaceRequest self = new DeleteDcdnKvNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnKvNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
