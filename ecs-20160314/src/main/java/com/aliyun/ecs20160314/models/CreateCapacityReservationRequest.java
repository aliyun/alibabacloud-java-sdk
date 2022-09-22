// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    @NameInMap("CapacityReservationName")
    public String capacityReservationName;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndDateType")
    public String endDateType;

    @NameInMap("InstanceCount")
    public String instanceCount;

    @NameInMap("InstanceMatchCriteria")
    public String instanceMatchCriteria;

    @NameInMap("InstancePlatform")
    public String instancePlatform;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("TimeSlot")
    public String timeSlot;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationRequest self = new CreateCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationRequest setCapacityReservationName(String capacityReservationName) {
        this.capacityReservationName = capacityReservationName;
        return this;
    }
    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    public CreateCapacityReservationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCapacityReservationRequest setEndDateType(String endDateType) {
        this.endDateType = endDateType;
        return this;
    }
    public String getEndDateType() {
        return this.endDateType;
    }

    public CreateCapacityReservationRequest setInstanceCount(String instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public String getInstanceCount() {
        return this.instanceCount;
    }

    public CreateCapacityReservationRequest setInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
        return this;
    }
    public String getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }

    public CreateCapacityReservationRequest setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
        return this;
    }
    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    public CreateCapacityReservationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCapacityReservationRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCapacityReservationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCapacityReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCapacityReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCapacityReservationRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateCapacityReservationRequest setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
        return this;
    }
    public String getTimeSlot() {
        return this.timeSlot;
    }

    public CreateCapacityReservationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
