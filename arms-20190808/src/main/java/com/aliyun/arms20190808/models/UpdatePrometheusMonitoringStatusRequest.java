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
     * <p>The name of the monitoring configuration.</p>
     */
    @NameInMap("MonitoringName")
    public String monitoringName;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the monitoring configuration. Valid values: run and stop.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the monitoring configuration. Valid values for a Prometheus instance for Container Service: ServiceMonitor, PodMonitor, and CustomJob. Valid value for a Prometheus instance for ECS: CustomJob. The status of Probe cannot be modified.</p>
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
