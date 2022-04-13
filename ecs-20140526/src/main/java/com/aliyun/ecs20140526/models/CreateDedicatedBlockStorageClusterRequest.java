// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterRequest extends TeaModel {
    @NameInMap("Capacity")
    public Integer capacity;

    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedBlockStorageClusterName")
    public String dedicatedBlockStorageClusterName;

    @NameInMap("Description")
    public String description;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Type")
    public String type;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDedicatedBlockStorageClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedBlockStorageClusterRequest self = new CreateDedicatedBlockStorageClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedBlockStorageClusterRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public CreateDedicatedBlockStorageClusterRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDedicatedBlockStorageClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDedicatedBlockStorageClusterRequest setDedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
        this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
        return this;
    }
    public String getDedicatedBlockStorageClusterName() {
        return this.dedicatedBlockStorageClusterName;
    }

    public CreateDedicatedBlockStorageClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDedicatedBlockStorageClusterRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateDedicatedBlockStorageClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDedicatedBlockStorageClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDedicatedBlockStorageClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDedicatedBlockStorageClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDedicatedBlockStorageClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedBlockStorageClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDedicatedBlockStorageClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDedicatedBlockStorageClusterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDedicatedBlockStorageClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
