// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTenantFlowRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetBimTenantFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimTenantFlowRequest self = new GetBimTenantFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetBimTenantFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
