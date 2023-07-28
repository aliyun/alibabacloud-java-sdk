// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvNamespaceRequest extends TeaModel {
    /**
     * <p>The description of the namespace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the namespace. The name can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static PutDcdnKvNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvNamespaceRequest self = new PutDcdnKvNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutDcdnKvNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
