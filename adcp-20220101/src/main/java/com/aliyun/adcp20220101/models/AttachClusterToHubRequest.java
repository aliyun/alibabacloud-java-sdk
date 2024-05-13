// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **AttachClusterToHub**.</p>
     */
    @NameInMap("AttachToMesh")
    public Boolean attachToMesh;

    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
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
