// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterMonitorRuleRequest extends TeaModel {
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDedicatedClusterMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterMonitorRuleRequest self = new DescribeDedicatedClusterMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterMonitorRuleRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDedicatedClusterMonitorRuleRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedClusterMonitorRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
