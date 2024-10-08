// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateKvNamespaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a test namespace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static CreateKvNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKvNamespaceRequest self = new CreateKvNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateKvNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKvNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
