// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterRequest extends TeaModel {
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterRequest self = new DescribeDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
