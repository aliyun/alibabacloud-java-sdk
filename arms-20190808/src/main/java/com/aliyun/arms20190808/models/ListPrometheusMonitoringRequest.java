// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusMonitoringRequest extends TeaModel {
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

    /**
     * <p>The instance support for container service types includes: serviceMonitor, podMonitor, customJob, and probe.</p>
     * <p>ECS type instances support: customJob, probe.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListPrometheusMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusMonitoringRequest self = new ListPrometheusMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusMonitoringRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPrometheusMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusMonitoringRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
