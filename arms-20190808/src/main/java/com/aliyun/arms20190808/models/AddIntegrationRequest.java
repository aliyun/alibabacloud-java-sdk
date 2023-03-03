// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddIntegrationRequest extends TeaModel {
    /**
     * <p>The ID of an Alibaba Cloud Container Service for Kubernetes cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The software abbreviation that is supported by ARMS. Valid values (case-insensitive): `ASM`, `IoT`, and `Flink`.</p>
     */
    @NameInMap("Integration")
    public String integration;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIntegrationRequest self = new AddIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public AddIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddIntegrationRequest setIntegration(String integration) {
        this.integration = integration;
        return this;
    }
    public String getIntegration() {
        return this.integration;
    }

    public AddIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
