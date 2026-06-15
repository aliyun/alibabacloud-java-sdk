// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouteEntryRequest extends TeaModel {
    /**
     * <p>A unique, case-sensitive identifier to ensure request idempotency. The token must be 1 to 64 ASCII characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The destination CIDR block. The value must be a valid CIDR block. Set the value to <code>0.0.0.0/0</code> to create a default route.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the next hop.</p>
     * <p><strong>Note</strong> Specify either <code>NextHopId</code> or <code>NextHopList</code>, but not both.</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The list of next hops for an ECMP route.</p>
     * <p><strong>Note</strong> Specify either <code>NextHopId</code> or <code>NextHopList</code>, but not both.</p>
     */
    @NameInMap("NextHopList")
    public java.util.List<CreateRouteEntryRequestNextHopList> nextHopList;

    /**
     * <p>The type of the next hop. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong>: an ECS instance.</p>
     * </li>
     * <li><p><strong>HaVip</strong>: a high-availability virtual IP address.</p>
     * </li>
     * <li><p><strong>RouterInterface</strong>: a router interface.</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: an elastic network interface.</p>
     * </li>
     * <li><p><strong>VpnGateway</strong>: a VPN gateway.</p>
     * </li>
     * <li><p><strong>Ipv6Gateway</strong>: an IPv6 gateway.</p>
     * </li>
     * <li><p><strong>NatGateway</strong>: a NAT gateway.</p>
     * </li>
     * </ul>
     * <p><strong>Note</strong> This parameter is required if you specify <code>NextHopId</code>.</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the <a href="~~docid:36063~~">DescribeRegions</a> operation to get the latest list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the route table.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryRequest self = new CreateRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public CreateRouteEntryRequest setNextHopList(java.util.List<CreateRouteEntryRequestNextHopList> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }
    public java.util.List<CreateRouteEntryRequestNextHopList> getNextHopList() {
        return this.nextHopList;
    }

    public CreateRouteEntryRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public CreateRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static class CreateRouteEntryRequestNextHopList extends TeaModel {
        /**
         * <p>The ID of the next hop in the ECMP route.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop in the ECMP route. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong>: an ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: a high-availability virtual IP address.</p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: a router interface.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: an elastic network interface.</p>
         * </li>
         * <li><p><strong>VpnGateway</strong>: a VPN gateway.</p>
         * </li>
         * <li><p><strong>Ipv6Gateway</strong>: an IPv6 gateway.</p>
         * </li>
         * <li><p><strong>NatGateway</strong>: a NAT gateway.</p>
         * </li>
         * </ul>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        public static CreateRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntryRequestNextHopList self = new CreateRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

        public CreateRouteEntryRequestNextHopList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public CreateRouteEntryRequestNextHopList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

    }

}
