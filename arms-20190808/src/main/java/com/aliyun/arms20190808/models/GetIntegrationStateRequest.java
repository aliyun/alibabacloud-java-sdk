// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Integration")
    public String integration;

    @NameInMap("RegionId")
    public String regionId;

    public static GetIntegrationStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationStateRequest self = new GetIntegrationStateRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegrationStateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetIntegrationStateRequest setIntegration(String integration) {
        this.integration = integration;
        return this;
    }
    public String getIntegration() {
        return this.integration;
    }

    public GetIntegrationStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
