// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance. Only a Prometheus instance for Container Service or a Prometheus instance for ECS is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b\<em>\</em>\<em>\</em> or vpc-\<em>\</em>\*</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the remote write configuration item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rw1</p>
     */
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
