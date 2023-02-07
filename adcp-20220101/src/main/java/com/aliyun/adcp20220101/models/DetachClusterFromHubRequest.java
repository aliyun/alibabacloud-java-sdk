// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>A JSON string that can be parsed into a string array. The string specifies the clusters that you want to disassociate from the master instance.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>Specifies whether to only disassociate the clusters from Service Mesh (ASM) instances. Valid values: - true: only disassociates the clusters from ASM instances. - false: disassociates the clusters from the master instance and ASM instances.</p>
     */
    @NameInMap("DetachFromMesh")
    public Boolean detachFromMesh;

    public static DetachClusterFromHubRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachClusterFromHubRequest self = new DetachClusterFromHubRequest();
        return TeaModel.build(map, self);
    }

    public DetachClusterFromHubRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DetachClusterFromHubRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public DetachClusterFromHubRequest setDetachFromMesh(Boolean detachFromMesh) {
        this.detachFromMesh = detachFromMesh;
        return this;
    }
    public Boolean getDetachFromMesh() {
        return this.detachFromMesh;
    }

}
