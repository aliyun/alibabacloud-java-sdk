// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusRemoteWriteRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteWriteYaml")
    public String remoteWriteYaml;

    public static AddPrometheusRemoteWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusRemoteWriteRequest self = new AddPrometheusRemoteWriteRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusRemoteWriteRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddPrometheusRemoteWriteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPrometheusRemoteWriteRequest setRemoteWriteYaml(String remoteWriteYaml) {
        this.remoteWriteYaml = remoteWriteYaml;
        return this;
    }
    public String getRemoteWriteYaml() {
        return this.remoteWriteYaml;
    }

}
