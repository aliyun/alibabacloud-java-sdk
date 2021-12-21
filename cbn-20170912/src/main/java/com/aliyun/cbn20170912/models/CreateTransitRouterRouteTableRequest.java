// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableRequest extends TeaModel {
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

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    @NameInMap("TransitRouterRouteTableName")
    public String transitRouterRouteTableName;

    public static CreateTransitRouterRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteTableRequest self = new CreateTransitRouterRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
        this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
        return this;
    }
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableName(String transitRouterRouteTableName) {
        this.transitRouterRouteTableName = transitRouterRouteTableName;
        return this;
    }
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

}
