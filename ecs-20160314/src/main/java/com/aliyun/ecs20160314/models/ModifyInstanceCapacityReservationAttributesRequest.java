// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceCapacityReservationAttributesRequest extends TeaModel {
    @NameInMap("CapacityReservationId")
    public String capacityReservationId;

    @NameInMap("CapacityReservationPreference")
    public String capacityReservationPreference;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public static ModifyInstanceCapacityReservationAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCapacityReservationAttributesRequest self = new ModifyInstanceCapacityReservationAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCapacityReservationAttributesRequest setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }
    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
        return this;
    }
    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceCapacityReservationAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
