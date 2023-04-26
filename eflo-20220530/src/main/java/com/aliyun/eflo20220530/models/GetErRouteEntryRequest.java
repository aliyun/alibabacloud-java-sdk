// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteEntryRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErRouteEntryId")
    public String erRouteEntryId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetErRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteEntryRequest self = new GetErRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public GetErRouteEntryRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public GetErRouteEntryRequest setErRouteEntryId(String erRouteEntryId) {
        this.erRouteEntryId = erRouteEntryId;
        return this;
    }
    public String getErRouteEntryId() {
        return this.erRouteEntryId;
    }

    public GetErRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
