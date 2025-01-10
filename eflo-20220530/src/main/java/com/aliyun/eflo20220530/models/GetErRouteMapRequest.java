// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteMapRequest extends TeaModel {
    /**
     * <p>Lingjun HUB ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>routing policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-rmap-uwglhzom</p>
     */
    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
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
