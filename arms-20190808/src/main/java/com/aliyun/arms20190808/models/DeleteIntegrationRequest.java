// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationRequest extends TeaModel {
    // The ID of the Container Service for Kubernetes cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The abbreviation of the software that is supported by Application Real-Time Monitoring Service (ARMS). Valid values (case-insensitive): `ASM`, `IoT`, and `Flink`.
    @NameInMap("Integration")
    public String integration;

    // The region ID of the ARMS instance.
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationRequest self = new DeleteIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteIntegrationRequest setIntegration(String integration) {
        this.integration = integration;
        return this;
    }
    public String getIntegration() {
        return this.integration;
    }

    public DeleteIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
