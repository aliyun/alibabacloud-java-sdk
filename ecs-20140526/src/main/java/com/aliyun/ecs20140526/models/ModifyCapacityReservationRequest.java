// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    // The description of the capacity reservation. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // The expiration time of the capacity reservation. This parameter takes effect only when `EndTimeType` is set to Limited. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. For more information, see [ISO 8601](~~25696~~).
    @NameInMap("EndTime")
    public String endTime;

    // The release mode of the capacity reservation. Valid values:
    // 
    // *   Limited: The capacity reservation is released at the specified time. You must also specify the `EndTime` parameter.
    // *   Unlimited: You must manually release the capacity reservation. You can release capacity reservations at any time.
    @NameInMap("EndTimeType")
    public String endTimeType;

    // The total number of instances reserved by the capacity reservation. Valid values: the number of created instances to 1000.
    // 
    // >  When you increase the number of instances reserved, the increase may fail due to insufficient resources.
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The operating system type of the instance reserved. Valid values:
    // 
    // *   Windows: Windows Server operating systems
    // *   Linux: Linux and Unix-like operating systems
    // 
    // >  This parameter is unavailable.
    @NameInMap("Platform")
    public String platform;

    // The region ID of the capacity reservation. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The effective mode of the capacity reservation. The capacity reservation can be set only to take effect immediately. You do not need to pass in a value for the parameter.
    // 
    // >  The capacity reservation takes effect immediately when this parameter is left empty.
    @NameInMap("StartTime")
    public String startTime;

    public static ModifyCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCapacityReservationRequest self = new ModifyCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCapacityReservationRequest setPrivatePoolOptions(ModifyCapacityReservationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyCapacityReservationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyCapacityReservationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCapacityReservationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyCapacityReservationRequest setEndTimeType(String endTimeType) {
        this.endTimeType = endTimeType;
        return this;
    }
    public String getEndTimeType() {
        return this.endTimeType;
    }

    public ModifyCapacityReservationRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public ModifyCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCapacityReservationRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ModifyCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCapacityReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCapacityReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCapacityReservationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class ModifyCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        // The ID of the capacity reservation.
        @NameInMap("Id")
        public String id;

        // The name of the capacity reservation. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
        @NameInMap("Name")
        public String name;

        public static ModifyCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyCapacityReservationRequestPrivatePoolOptions self = new ModifyCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyCapacityReservationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyCapacityReservationRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
