// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusIntegrationRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance. Only aliyun-cs and ecs instances are supported.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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

    public static ListPrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusIntegrationRequest self = new ListPrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public ListPrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
