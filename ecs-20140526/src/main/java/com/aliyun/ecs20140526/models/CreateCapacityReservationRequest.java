// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimeType")
    public String endTimeType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("EfficientStatus")
    public Integer efficientStatus;

    @NameInMap("TimeSlot")
    public String timeSlot;

    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static CreateCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationRequest self = new CreateCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationRequest setPrivatePoolOptions(CreateCapacityReservationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateCapacityReservationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateCapacityReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateCapacityReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCapacityReservationRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCapacityReservationRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCapacityReservationRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCapacityReservationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCapacityReservationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCapacityReservationRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public CreateCapacityReservationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCapacityReservationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCapacityReservationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCapacityReservationRequest setEndTimeType(String endTimeType) {
        this.endTimeType = endTimeType;
        return this;
    }
    public String getEndTimeType() {
        return this.endTimeType;
    }

    public CreateCapacityReservationRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateCapacityReservationRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateCapacityReservationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateCapacityReservationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateCapacityReservationRequest setEfficientStatus(Integer efficientStatus) {
        this.efficientStatus = efficientStatus;
        return this;
    }
    public Integer getEfficientStatus() {
        return this.efficientStatus;
    }

    public CreateCapacityReservationRequest setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
        return this;
    }
    public String getTimeSlot() {
        return this.timeSlot;
    }

    public CreateCapacityReservationRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class CreateCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static CreateCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateCapacityReservationRequestPrivatePoolOptions self = new CreateCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

}
