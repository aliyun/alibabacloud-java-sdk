// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccRouteEntryRequest extends TeaModel {
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VccId")
    public String vccId;

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
