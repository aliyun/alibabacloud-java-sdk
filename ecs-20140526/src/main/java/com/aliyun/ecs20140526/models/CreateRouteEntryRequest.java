// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouteEntryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("NextHopList")
    public java.util.List<CreateRouteEntryRequestNextHopList> nextHopList;

    public static CreateRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryRequest self = new CreateRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
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

    public CreateRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateRouteEntryRequest setNextHopList(java.util.List<CreateRouteEntryRequestNextHopList> nextHopList) {
        this.nextHopList = nextHopList;
        return this;
    }
    public java.util.List<CreateRouteEntryRequestNextHopList> getNextHopList() {
        return this.nextHopList;
    }

    public static class CreateRouteEntryRequestNextHopList extends TeaModel {
        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("NextHopId")
        public String nextHopId;

        public static CreateRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntryRequestNextHopList self = new CreateRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

        public CreateRouteEntryRequestNextHopList setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public CreateRouteEntryRequestNextHopList setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

    }

}
