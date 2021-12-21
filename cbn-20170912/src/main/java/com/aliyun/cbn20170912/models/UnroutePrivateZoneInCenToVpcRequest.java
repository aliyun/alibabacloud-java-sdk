// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnroutePrivateZoneInCenToVpcRequest extends TeaModel {
    @NameInMap("AccessRegionId")
    public String accessRegionId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UnroutePrivateZoneInCenToVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UnroutePrivateZoneInCenToVpcRequest self = new UnroutePrivateZoneInCenToVpcRequest();
        return TeaModel.build(map, self);
    }

    public UnroutePrivateZoneInCenToVpcRequest setAccessRegionId(String accessRegionId) {
        this.accessRegionId = accessRegionId;
        return this;
    }
    public String getAccessRegionId() {
        return this.accessRegionId;
    }

    public UnroutePrivateZoneInCenToVpcRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public UnroutePrivateZoneInCenToVpcRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnroutePrivateZoneInCenToVpcRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnroutePrivateZoneInCenToVpcRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnroutePrivateZoneInCenToVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
