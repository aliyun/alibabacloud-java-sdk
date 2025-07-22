// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryRequest extends TeaModel {
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static DeleteRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryRequest self = new DeleteRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public DeleteRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteEntryRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public DeleteRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
