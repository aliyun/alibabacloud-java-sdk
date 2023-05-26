// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusIntegrationRequest extends TeaModel {
    /**
     * <p>arms-hz-central</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("IntegrationType")
    public String integrationType;

    @NameInMap("Param")
    public String param;

    /**
     * <p>success=false</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdatePrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusIntegrationRequest self = new UpdatePrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusIntegrationRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public UpdatePrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public UpdatePrometheusIntegrationRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public UpdatePrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
