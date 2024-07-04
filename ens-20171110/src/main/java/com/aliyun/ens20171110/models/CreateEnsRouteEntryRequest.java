// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryRequest extends TeaModel {
    /**
     * <p>The description of the custom route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block of the custom route entry. Make sure that the destination CIDR block meets the following requirements:</p>
     * <ul>
     * <li>The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</li>
     * <li>The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.</li>
     * <li>0.0.0.0/0 indicates the default CIDR block.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the next hop of the custom route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5vb7leks9z4mxy1ay258</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The type of next hop of the custom route entry. Valid values:</p>
     * <ul>
     * <li>Instance (default): an ENS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    /**
     * <p>The name of the custom route entry that you want to add. The name must be 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The ID of the route table to which you want to add a custom route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1cifr72dioje82lse2j</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateEnsRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsRouteEntryRequest self = new CreateEnsRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnsRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateEnsRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public CreateEnsRouteEntryRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public CreateEnsRouteEntryRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public CreateEnsRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
