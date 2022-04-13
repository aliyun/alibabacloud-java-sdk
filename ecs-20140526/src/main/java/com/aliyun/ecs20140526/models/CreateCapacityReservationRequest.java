// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimeType")
    public String endTimeType;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tag")
    public java.util.List<CreateCapacityReservationRequestTag> tag;

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

    public CreateCapacityReservationRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
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

    public CreateCapacityReservationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCapacityReservationRequest setTag(java.util.List<CreateCapacityReservationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCapacityReservationRequestTag> getTag() {
        return this.tag;
    }

    public CreateCapacityReservationRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class CreateCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("Name")
        public String name;

        public static CreateCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateCapacityReservationRequestPrivatePoolOptions self = new CreateCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CreateCapacityReservationRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateCapacityReservationRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateCapacityReservationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCapacityReservationRequestTag self = new CreateCapacityReservationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCapacityReservationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCapacityReservationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
