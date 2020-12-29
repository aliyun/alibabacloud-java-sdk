// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenAttributeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    @NameInMap("Ipv6Level")
    public String ipv6Level;

    public static ModifyCenAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenAttributeRequest self = new ModifyCenAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCenAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCenAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCenAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCenAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCenAttributeRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ModifyCenAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCenAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCenAttributeRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public ModifyCenAttributeRequest setIpv6Level(String ipv6Level) {
        this.ipv6Level = ipv6Level;
        return this;
    }
    public String getIpv6Level() {
        return this.ipv6Level;
    }

}
