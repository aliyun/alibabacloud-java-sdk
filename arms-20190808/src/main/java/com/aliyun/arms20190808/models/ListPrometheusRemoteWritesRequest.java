// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b\<em>\</em>\<em>\</em> or vpc-\<em>\</em>\<em>\</em></p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
