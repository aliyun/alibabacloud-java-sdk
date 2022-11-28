// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCidrRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PublishCidrRoute")
    public Boolean publishCidrRoute;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ModifyTransitRouterCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCidrRequest self = new ModifyTransitRouterCidrRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCidrRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public ModifyTransitRouterCidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterCidrRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTransitRouterCidrRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouterCidrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyTransitRouterCidrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouterCidrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouterCidrRequest setPublishCidrRoute(Boolean publishCidrRoute) {
        this.publishCidrRoute = publishCidrRoute;
        return this;
    }
    public Boolean getPublishCidrRoute() {
        return this.publishCidrRoute;
    }

    public ModifyTransitRouterCidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTransitRouterCidrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouterCidrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouterCidrRequest setTransitRouterCidrId(String transitRouterCidrId) {
        this.transitRouterCidrId = transitRouterCidrId;
        return this;
    }
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

    public ModifyTransitRouterCidrRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
