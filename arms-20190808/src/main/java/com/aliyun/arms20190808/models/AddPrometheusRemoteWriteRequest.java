// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance. Only a Prometheus instance for Container Service or a Prometheus instance for ECS is supported.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The details of the remote write configuration item. Specify the value in the YAML format.</p>
     */
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
