// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReleaseCapacityReservationRequest extends TeaModel {
    @NameInMap("CapacityReservationId")
    public String capacityReservationId;

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

    @NameInMap("Token")
    public String token;

    public static ReleaseCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityReservationRequest self = new ReleaseCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityReservationRequest setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }
    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    public ReleaseCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseCapacityReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseCapacityReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReleaseCapacityReservationRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
