// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteActionTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static GetPrometheusRemoteActionTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteActionTokenRequest self = new GetPrometheusRemoteActionTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteActionTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPrometheusRemoteActionTokenRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
