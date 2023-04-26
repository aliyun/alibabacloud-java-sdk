// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRouteEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VccId")
    public String vccId;

    @NameInMap("VccRouteEntryId")
    public String vccRouteEntryId;

    public static GetVccRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVccRouteEntryRequest self = new GetVccRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public GetVccRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVccRouteEntryRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public GetVccRouteEntryRequest setVccRouteEntryId(String vccRouteEntryId) {
        this.vccRouteEntryId = vccRouteEntryId;
        return this;
    }
    public String getVccRouteEntryId() {
        return this.vccRouteEntryId;
    }

}
