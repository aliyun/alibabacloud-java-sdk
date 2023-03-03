// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusIntegrationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("IntegrationType")
    public String integrationType;

    @NameInMap("RegionId")
    public String regionId;

    public static GetPrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusIntegrationRequest self = new GetPrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetPrometheusIntegrationRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetPrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public GetPrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
