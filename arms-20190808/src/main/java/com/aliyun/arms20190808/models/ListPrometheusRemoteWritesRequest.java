// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListPrometheusRemoteWritesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusRemoteWritesRequest self = new ListPrometheusRemoteWritesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusRemoteWritesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPrometheusRemoteWritesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
