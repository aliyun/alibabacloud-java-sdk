// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubRequest extends TeaModel {
    /**
     * <p>Specifies whether to associate the clusters with Service Mesh (ASM) instances. Valid values:</p>
     */
    @NameInMap("AttachToMesh")
    public Boolean attachToMesh;

    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>A JSON string that can be parsed into a string array. The string specifies the clusters that you want to associate with the master instance.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    public static AttachClusterToHubRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachClusterToHubRequest self = new AttachClusterToHubRequest();
        return TeaModel.build(map, self);
    }

    public AttachClusterToHubRequest setAttachToMesh(Boolean attachToMesh) {
        this.attachToMesh = attachToMesh;
        return this;
    }
    public Boolean getAttachToMesh() {
        return this.attachToMesh;
    }

    public AttachClusterToHubRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachClusterToHubRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

}
