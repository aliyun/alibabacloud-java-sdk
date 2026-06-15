// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryRequest extends TeaModel {
    /**
     * <p>The destination CIDR block of the route entry.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the next hop.</p>
     * <blockquote>
     * <p><code>NextHopId</code> and <code>NextHopList</code> are mutually exclusive. You can specify one but not both.</p>
     * </blockquote>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>A list of next hops for an ECMP route.</p>
     * <blockquote>
     * <p><code>NextHopId</code> and <code>NextHopList</code> are mutually exclusive. You can specify one but not both.</p>
     * </blockquote>
     */
    @NameInMap("NextHopList")
    public java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the route table that contains the route entry.</p>
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

    public DeleteRouteEntryRequest setNextHopList(java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }
    public java.util.List<DeleteRouteEntryRequestNextHopList> getNextHopList() {
        return this.nextHopList;
    }

    public DeleteRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static class DeleteRouteEntryRequestNextHopList extends TeaModel {
        /**
         * <p>The ID of a next hop in the ECMP route.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of a next hop in the ECMP route. Set the value to <code>Instance</code>.</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        public static DeleteRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntryRequestNextHopList self = new DeleteRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

        public DeleteRouteEntryRequestNextHopList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DeleteRouteEntryRequestNextHopList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

    }

}
