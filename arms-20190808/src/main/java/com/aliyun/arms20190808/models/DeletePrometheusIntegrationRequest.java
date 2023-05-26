// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusIntegrationRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance. Only aliyun-cs and ecs instances are supported.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the exporter that is integrated into the Prometheus instance.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The integration type.</p>
     */
    @NameInMap("IntegrationType")
    public String integrationType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusIntegrationRequest self = new DeletePrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeletePrometheusIntegrationRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DeletePrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public DeletePrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
