// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusIntegrationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IntegrationType")
    public String integrationType;

    @NameInMap("Param")
    public String param;

    @NameInMap("RegionId")
    public String regionId;

    public static AddPrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusIntegrationRequest self = new AddPrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddPrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public AddPrometheusIntegrationRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public AddPrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
