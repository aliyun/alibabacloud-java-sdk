// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterIds")
    public String clusterIds;

    public static AttachClusterToHubRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachClusterToHubRequest self = new AttachClusterToHubRequest();
        return TeaModel.build(map, self);
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
