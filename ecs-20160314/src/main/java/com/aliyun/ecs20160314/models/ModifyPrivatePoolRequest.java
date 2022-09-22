// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyPrivatePoolRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimeType")
    public String endTimeType;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    public static ModifyPrivatePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivatePoolRequest self = new ModifyPrivatePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrivatePoolRequest setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyPrivatePoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPrivatePoolRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyPrivatePoolRequest setEndTimeType(String endTimeType) {
        this.endTimeType = endTimeType;
        return this;
    }
    public String getEndTimeType() {
        return this.endTimeType;
    }

    public ModifyPrivatePoolRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public ModifyPrivatePoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPrivatePoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPrivatePoolRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ModifyPrivatePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPrivatePoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPrivatePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyPrivatePoolRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolOptions self = new PrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public PrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
