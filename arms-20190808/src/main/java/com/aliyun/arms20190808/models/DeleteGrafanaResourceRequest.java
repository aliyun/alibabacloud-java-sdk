// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the cluster.
    @NameInMap("ClusterName")
    public String clusterName;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGrafanaResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaResourceRequest self = new DeleteGrafanaResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteGrafanaResourceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DeleteGrafanaResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
