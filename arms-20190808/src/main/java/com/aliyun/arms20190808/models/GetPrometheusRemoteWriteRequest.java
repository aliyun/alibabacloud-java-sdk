// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteWriteRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteWriteName")
    public String remoteWriteName;

    public static GetPrometheusRemoteWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteWriteRequest self = new GetPrometheusRemoteWriteRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteWriteRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPrometheusRemoteWriteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPrometheusRemoteWriteRequest setRemoteWriteName(String remoteWriteName) {
        this.remoteWriteName = remoteWriteName;
        return this;
    }
    public String getRemoteWriteName() {
        return this.remoteWriteName;
    }

}
