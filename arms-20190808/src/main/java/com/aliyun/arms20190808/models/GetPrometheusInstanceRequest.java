// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusInstanceRequest self = new GetPrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPrometheusInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
