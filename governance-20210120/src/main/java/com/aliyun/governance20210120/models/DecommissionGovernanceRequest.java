// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DecommissionGovernanceRequest extends TeaModel {
    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DecommissionGovernanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DecommissionGovernanceRequest self = new DecommissionGovernanceRequest();
        return TeaModel.build(map, self);
    }

    public DecommissionGovernanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
