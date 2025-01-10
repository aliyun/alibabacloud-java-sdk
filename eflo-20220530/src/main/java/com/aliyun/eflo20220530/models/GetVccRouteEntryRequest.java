// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRouteEntryRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Lingjun Connection ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>The ID of the route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-rte-31ocvdhq</p>
     */
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
