// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteMapRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetErRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteMapRequest self = new GetErRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public GetErRouteMapRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public GetErRouteMapRequest setErRouteMapId(String erRouteMapId) {
        this.erRouteMapId = erRouteMapId;
        return this;
    }
    public String getErRouteMapId() {
        return this.erRouteMapId;
    }

    public GetErRouteMapRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
