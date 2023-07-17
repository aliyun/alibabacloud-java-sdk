// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class AddIntegrationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Integration")
    public String integration;

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
