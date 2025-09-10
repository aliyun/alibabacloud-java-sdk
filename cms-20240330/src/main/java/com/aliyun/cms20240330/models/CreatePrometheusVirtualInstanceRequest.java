// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusVirtualInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cms_prometheus</p>
     */
    @NameInMap("namespace")
    public String namespace;

    public static CreatePrometheusVirtualInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusVirtualInstanceRequest self = new CreatePrometheusVirtualInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusVirtualInstanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
