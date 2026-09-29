// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class OpenGovernanceServiceRequest extends TeaModel {
    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static OpenGovernanceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenGovernanceServiceRequest self = new OpenGovernanceServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenGovernanceServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
