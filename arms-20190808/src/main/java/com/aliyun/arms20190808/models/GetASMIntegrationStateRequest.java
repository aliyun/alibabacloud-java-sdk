// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetASMIntegrationStateRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetASMIntegrationStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetASMIntegrationStateRequest self = new GetASMIntegrationStateRequest();
        return TeaModel.build(map, self);
    }

    public GetASMIntegrationStateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetASMIntegrationStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
