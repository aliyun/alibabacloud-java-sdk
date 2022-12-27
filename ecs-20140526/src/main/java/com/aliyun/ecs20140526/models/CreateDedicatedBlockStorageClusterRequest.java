// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterRequest extends TeaModel {
    // The capacity of the dedicated block storage cluster. Valid values: 60 to 2304. Unit: TiB.
    @NameInMap("Capacity")
    public Integer capacity;

    // The category of disks that can be created in the dedicated block storage cluster.
    // 
    // Valid value: cloud_essd. Only enhanced SSDs (ESSDs) can be created in dedicated block storage clusters.
    @NameInMap("Category")
    public String category;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate a client token. Make sure that a unique client token is used for different requests.
    // 
    // The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The name of the dedicated block storage cluster.
    @NameInMap("DedicatedBlockStorageClusterName")
    public String dedicatedBlockStorageClusterName;

    // The description of the dedicated block storage cluster.
    @NameInMap("Description")
    public String description;

    // > This parameter will be offline soon, please use other parameters.
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The subscription period of the dedicated block storage cluster. The unit is specified by the `PeriodUnit` parameter. Valid values:
    // 
    // *   When the `PeriodUnit` parameter is set to Year, valid values are 1, 2, 3, and 4.
    // *   When the `PeriodUnit` parameter is set to Month, valid values are 6, 7, 8, 9, 10, and 11.
    // 
    // >  Dedicated Block Storage Cluster supports only the subscription billing method. Therefore, you must specify the `Period` and `PeriodUnit` parameters.
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription period. Valid values:
    // 
    // *   Year
    // *   Month
    // 
    // >  Dedicated Block Storage Cluster supports only the subscription billing method. Therefore, you must specify the `Period` and `PeriodUnit` parameters.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the region in which to create the dedicated block storage cluster. You can call the [DescribeRegions](~~25609~~) operation to query thecurrent list of regions.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The type of the dedicated block storage cluster. Valid values:
    // 
    // *   Standard: When you set Type to Standard, ESSDs at performance level 0 (PL0 ESSDs) can be created in the dedicated block storage cluster.
    // *   Premium: When you set Type to Premium, ESSDs at performance level 1 (PL1 ESSDs) can be created in the dedicated block storage cluster.
    // 
    // Default value: Premium.
    @NameInMap("Type")
    public String type;

    // The ID of the zone where the cluster is deployed. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
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
