// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb09fda0dc2f94a8397c76638c7ec****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>DetachClusterFromHub</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c1c731554c1ec4a1ca9bb690ff9ed****&quot;]</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>Example 1</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
