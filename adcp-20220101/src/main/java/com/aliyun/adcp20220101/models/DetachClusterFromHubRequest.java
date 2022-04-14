// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DetachClusterFromHubRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterIds")
    public String clusterIds;

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

}
