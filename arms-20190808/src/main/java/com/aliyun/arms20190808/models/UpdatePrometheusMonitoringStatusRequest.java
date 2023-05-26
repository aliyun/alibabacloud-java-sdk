// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusMonitoringStatusRequest extends TeaModel {
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
     * <p>The status of the monitoring.</p>
     * <p>probe currently does not support configuration status.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The instance support for container service types includes: serviceMonitor, podMonitor, customJob, and probe.</p>
     * <p>ECS type instances support: customJob, probe.</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdatePrometheusMonitoringStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusMonitoringStatusRequest self = new UpdatePrometheusMonitoringStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusMonitoringStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusMonitoringStatusRequest setMonitoringName(String monitoringName) {
        this.monitoringName = monitoringName;
        return this;
    }
    public String getMonitoringName() {
        return this.monitoringName;
    }

    public UpdatePrometheusMonitoringStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusMonitoringStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrometheusMonitoringStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
