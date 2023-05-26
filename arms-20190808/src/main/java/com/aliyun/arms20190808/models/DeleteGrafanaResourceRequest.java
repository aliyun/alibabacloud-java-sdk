// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The instance name.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The region ID.</p>
     */
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
