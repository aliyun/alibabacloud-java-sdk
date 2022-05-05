// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("QueryUserId")
    public String queryUserId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInfoRequest self = new GetClusterInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterInfoRequest setQueryUserId(String queryUserId) {
        this.queryUserId = queryUserId;
        return this;
    }
    public String getQueryUserId() {
        return this.queryUserId;
    }

    public GetClusterInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
