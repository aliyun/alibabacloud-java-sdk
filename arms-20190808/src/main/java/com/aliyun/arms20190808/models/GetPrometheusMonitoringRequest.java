// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusMonitoringRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The Monitoring Name.</p>
     */
    @NameInMap("MonitoringName")
    public String monitoringName;

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

    public static GetPrometheusMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusMonitoringRequest self = new GetPrometheusMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusMonitoringRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPrometheusMonitoringRequest setMonitoringName(String monitoringName) {
        this.monitoringName = monitoringName;
        return this;
    }
    public String getMonitoringName() {
        return this.monitoringName;
    }

    public GetPrometheusMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPrometheusMonitoringRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
