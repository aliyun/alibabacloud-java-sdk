// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterMulticastDomainRequest extends TeaModel {
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

    @NameInMap("TransitRouterMulticastDomainDescription")
    public String transitRouterMulticastDomainDescription;

    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    @NameInMap("TransitRouterMulticastDomainName")
    public String transitRouterMulticastDomainName;

    public static ModifyTransitRouterMulticastDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterMulticastDomainRequest self = new ModifyTransitRouterMulticastDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterMulticastDomainRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterMulticastDomainRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouterMulticastDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouterMulticastDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouterMulticastDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouterMulticastDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
        this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
        return this;
    }
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
        this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
        return this;
    }
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

}
