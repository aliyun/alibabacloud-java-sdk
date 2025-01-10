// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRouteEntryRequest extends TeaModel {
    /**
     * <p>Destination CIDR block</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.98.112/28</p>
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

    public static CreateVccRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRouteEntryRequest self = new CreateVccRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateVccRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateVccRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVccRouteEntryRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

}
