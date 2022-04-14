// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ManagedClusterIds")
    public java.util.List<String> managedClusterIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachClusterFromHubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachClusterFromHubResponseBody self = new DetachClusterFromHubResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachClusterFromHubResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DetachClusterFromHubResponseBody setManagedClusterIds(java.util.List<String> managedClusterIds) {
        this.managedClusterIds = managedClusterIds;
        return this;
    }
    public java.util.List<String> getManagedClusterIds() {
        return this.managedClusterIds;
    }

    public DetachClusterFromHubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
