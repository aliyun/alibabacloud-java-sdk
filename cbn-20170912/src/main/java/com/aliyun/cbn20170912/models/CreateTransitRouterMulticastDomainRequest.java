// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterMulticastDomainRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterMulticastDomainDescription")
    public String transitRouterMulticastDomainDescription;

    @NameInMap("TransitRouterMulticastDomainName")
    public String transitRouterMulticastDomainName;

    public static CreateTransitRouterMulticastDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterMulticastDomainRequest self = new CreateTransitRouterMulticastDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterMulticastDomainRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterMulticastDomainRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterMulticastDomainRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterMulticastDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterMulticastDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterMulticastDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterMulticastDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterMulticastDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
        this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
        return this;
    }
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
        this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
        return this;
    }
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

}
