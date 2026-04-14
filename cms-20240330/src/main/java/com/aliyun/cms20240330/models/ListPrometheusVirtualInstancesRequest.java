// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusVirtualInstancesRequest extends TeaModel {
    /**
     * <p>Optional cloud product</p>
     * 
     * <strong>example:</strong>
     * <p>ack-csi-fuse</p>
     */
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("tenantId")
    public String tenantId;

    public static ListPrometheusVirtualInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusVirtualInstancesRequest self = new ListPrometheusVirtualInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusVirtualInstancesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListPrometheusVirtualInstancesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
