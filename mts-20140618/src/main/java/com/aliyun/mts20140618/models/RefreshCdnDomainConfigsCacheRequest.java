// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RefreshCdnDomainConfigsCacheRequest extends TeaModel {
    @NameInMap("Domains")
    public String domains;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static RefreshCdnDomainConfigsCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshCdnDomainConfigsCacheRequest self = new RefreshCdnDomainConfigsCacheRequest();
        return TeaModel.build(map, self);
    }

    public RefreshCdnDomainConfigsCacheRequest setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public RefreshCdnDomainConfigsCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RefreshCdnDomainConfigsCacheRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public RefreshCdnDomainConfigsCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RefreshCdnDomainConfigsCacheRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
