// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdRouteEntryRequest extends TeaModel {
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
     * <p>Lingjun CIDR block instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-iv2zm1qf</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The ID of the route entry instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-rte-toekyqel</p>
     */
    @NameInMap("VpdRouteEntryId")
    public String vpdRouteEntryId;

    public static GetVpdRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpdRouteEntryRequest self = new GetVpdRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public GetVpdRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpdRouteEntryRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public GetVpdRouteEntryRequest setVpdRouteEntryId(String vpdRouteEntryId) {
        this.vpdRouteEntryId = vpdRouteEntryId;
        return this;
    }
    public String getVpdRouteEntryId() {
        return this.vpdRouteEntryId;
    }

}
