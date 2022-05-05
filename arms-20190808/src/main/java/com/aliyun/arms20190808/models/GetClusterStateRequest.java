// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterStateRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PuserId")
    public String puserId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterStateRequest self = new GetClusterStateRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterStateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterStateRequest setPuserId(String puserId) {
        this.puserId = puserId;
        return this;
    }
    public String getPuserId() {
        return this.puserId;
    }

    public GetClusterStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
