// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusMonitoringRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The monitoring configuration. Specify a YAML string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Please refer to the supplementary explanation of the request parameters.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

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
     * <p>The status of the monitoring configuration. Valid values: run and stop. Default value: run. This parameter is not available if the Type parameter is set to Probe.</p>
     * 
     * <strong>example:</strong>
     * <p>run</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the monitoring configuration. 
     * Valid values for a Prometheus instance for Container Service: serviceMonitor, podMonitor, customJob, and probe. 
     * Valid values for a Prometheus instance for ECS: customJob and probe.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>serviceMonitor</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePrometheusMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusMonitoringRequest self = new CreatePrometheusMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusMonitoringRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreatePrometheusMonitoringRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public CreatePrometheusMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrometheusMonitoringRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrometheusMonitoringRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
