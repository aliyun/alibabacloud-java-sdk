// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccRouteEntryRequest extends TeaModel {
    /**
     * <p>Destination CIDR block</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.199.128/25</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Lingjun connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>The ID of the route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-rte-5cey1sap</p>
     */
    @NameInMap("VccRouteEntryId")
    public String vccRouteEntryId;

    public static DeleteVccRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVccRouteEntryRequest self = new DeleteVccRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVccRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteVccRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVccRouteEntryRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public DeleteVccRouteEntryRequest setVccRouteEntryId(String vccRouteEntryId) {
        this.vccRouteEntryId = vccRouteEntryId;
        return this;
    }
    public String getVccRouteEntryId() {
        return this.vccRouteEntryId;
    }

}
