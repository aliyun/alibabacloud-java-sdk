// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallPromClusterRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The ID of the region. default value: cn-hangzhou.
    @NameInMap("RegionId")
    public String regionId;

    public static UninstallPromClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPromClusterRequest self = new UninstallPromClusterRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPromClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UninstallPromClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
