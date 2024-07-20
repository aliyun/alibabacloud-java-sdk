// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetInvalidDomainCountRequest extends TeaModel {
    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetInvalidDomainCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInvalidDomainCountRequest self = new GetInvalidDomainCountRequest();
        return TeaModel.build(map, self);
    }

    public GetInvalidDomainCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
