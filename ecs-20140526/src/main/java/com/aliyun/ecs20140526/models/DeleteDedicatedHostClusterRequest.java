// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostClusterId")
    @Validation(required = true)
    public String dedicatedHostClusterId;

    public static DeleteDedicatedHostClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostClusterRequest self = new DeleteDedicatedHostClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDedicatedHostClusterRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

}
