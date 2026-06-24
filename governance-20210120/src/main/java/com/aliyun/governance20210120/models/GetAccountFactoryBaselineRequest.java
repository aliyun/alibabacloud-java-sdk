// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetAccountFactoryBaselineRequest extends TeaModel {
    /**
     * <p>The ID of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1nf0enuzb89az*****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAccountFactoryBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountFactoryBaselineRequest self = new GetAccountFactoryBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountFactoryBaselineRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public GetAccountFactoryBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
