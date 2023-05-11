// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorNamespaceRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteHybridMonitorNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorNamespaceRequest self = new DeleteHybridMonitorNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteHybridMonitorNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
