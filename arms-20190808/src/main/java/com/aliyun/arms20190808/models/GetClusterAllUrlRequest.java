// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterAllUrlRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The ID of the region. Default value: cn-hangzhou.
    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterAllUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAllUrlRequest self = new GetClusterAllUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterAllUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterAllUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
