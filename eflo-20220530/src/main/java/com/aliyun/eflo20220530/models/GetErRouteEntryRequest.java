// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteEntryRequest extends TeaModel {
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
     * <p>The ID of the route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-rte-4q0jbylz</p>
     */
    @NameInMap("ErRouteEntryId")
    public String erRouteEntryId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
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
