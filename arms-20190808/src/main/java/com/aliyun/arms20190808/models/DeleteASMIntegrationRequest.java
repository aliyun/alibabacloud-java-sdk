// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteASMIntegrationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteASMIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteASMIntegrationRequest self = new DeleteASMIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteASMIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteASMIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
