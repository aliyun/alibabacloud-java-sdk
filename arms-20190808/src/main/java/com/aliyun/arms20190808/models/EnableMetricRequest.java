// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class EnableMetricRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccfa5e34a5c1f4ce6b916a40a12151d88</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Enable metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>kube_pod_container_status_ready</p>
     */
    @NameInMap("DropMetric")
    public String dropMetric;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRequest self = new EnableMetricRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public EnableMetricRequest setDropMetric(String dropMetric) {
        this.dropMetric = dropMetric;
        return this;
    }
    public String getDropMetric() {
        return this.dropMetric;
    }

    public EnableMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
