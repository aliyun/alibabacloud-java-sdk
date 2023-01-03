// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddGrafanaRequest extends TeaModel {
    // The ID of a Container Service for Kubernetes cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The software abbreviation that is supported by ARMS. Valid values (case-insensitive): `ASM`, `IoT`, and `Flink`.
    @NameInMap("Integration")
    public String integration;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static AddGrafanaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGrafanaRequest self = new AddGrafanaRequest();
        return TeaModel.build(map, self);
    }

    public AddGrafanaRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddGrafanaRequest setIntegration(String integration) {
        this.integration = integration;
        return this;
    }
    public String getIntegration() {
        return this.integration;
    }

    public AddGrafanaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
