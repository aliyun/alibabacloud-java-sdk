// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateKvNamespaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new_ns</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateKvNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKvNamespaceRequest self = new UpdateKvNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKvNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateKvNamespaceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
