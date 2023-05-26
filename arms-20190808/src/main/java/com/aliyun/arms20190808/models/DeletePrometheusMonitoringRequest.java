// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusMonitoringRequest extends TeaModel {
    /**
     * <p>probe1</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("MonitoringName")
    public String monitoringName;

    /**
     * <p>The Monitoring Name.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeletePrometheusMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusMonitoringRequest self = new DeletePrometheusMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusMonitoringRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeletePrometheusMonitoringRequest setMonitoringName(String monitoringName) {
        this.monitoringName = monitoringName;
        return this;
    }
    public String getMonitoringName() {
        return this.monitoringName;
    }

    public DeletePrometheusMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeletePrometheusMonitoringRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
