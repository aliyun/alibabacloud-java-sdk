// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteEntryRequest extends TeaModel {
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

    @NameInMap("TransitRouterRouteEntryId")
    public String transitRouterRouteEntryId;

    @NameInMap("TransitRouterRouteEntryName")
    public String transitRouterRouteEntryName;

    public static UpdateTransitRouterRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteEntryRequest self = new UpdateTransitRouterRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
        this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
        return this;
    }
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
        this.transitRouterRouteEntryId = transitRouterRouteEntryId;
        return this;
    }
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
        this.transitRouterRouteEntryName = transitRouterRouteEntryName;
        return this;
    }
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

}
