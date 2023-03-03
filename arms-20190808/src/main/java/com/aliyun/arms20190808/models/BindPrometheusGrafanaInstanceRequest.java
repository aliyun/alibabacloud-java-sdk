// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BindPrometheusGrafanaInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the Grafana workspace.</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Prometheus实例的资源组ID。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static BindPrometheusGrafanaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPrometheusGrafanaInstanceRequest self = new BindPrometheusGrafanaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindPrometheusGrafanaInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindPrometheusGrafanaInstanceRequest setGrafanaInstanceId(String grafanaInstanceId) {
        this.grafanaInstanceId = grafanaInstanceId;
        return this;
    }
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
    }

    public BindPrometheusGrafanaInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindPrometheusGrafanaInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
