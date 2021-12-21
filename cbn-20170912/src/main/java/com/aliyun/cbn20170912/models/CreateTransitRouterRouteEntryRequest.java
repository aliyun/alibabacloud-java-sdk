// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterRouteEntryDescription")
    public String transitRouterRouteEntryDescription;

    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    public String transitRouterRouteEntryDestinationCidrBlock;

    @NameInMap("TransitRouterRouteEntryName")
    public String transitRouterRouteEntryName;

    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static CreateTransitRouterRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteEntryRequest self = new CreateTransitRouterRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
        this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
        return this;
    }
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
        this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
        return this;
    }
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
        this.transitRouterRouteEntryName = transitRouterRouteEntryName;
        return this;
    }
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
        this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
        this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
