// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesRequest extends TeaModel {
    /**
     * <p>Specifies the language of the returned values of the **RegionName** and **ZoneName** parameters. Default value: zh. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The database engine type of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: replica set instance</p>
     * <p>*   **sharding**: sharded cluster instance</p>
     */
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ExcludeSecondaryZoneId")
    public String excludeSecondaryZoneId;

    @NameInMap("ExcludeZoneId")
    public String excludeZoneId;

    /**
     * <p>The billing method of the instance. Default value: PrePaid. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The edition of the ApsaraDB for MongoDB instance. The instance can be of a high-availability edition or beta edition.</p>
     */
    @NameInMap("MongoType")
    public String mongoType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the latest available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The zones to be displayed. The values include the zones in which you can create an instance that uses cloud disks, the zones in which you can create an instance that uses local disks, and the zones in which you can create an instance that uses cloud disks and local disks.</p>
     */
    @NameInMap("StorageSupport")
    public String storageSupport;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_essd1**: PL1.enhanced SSD (ESSD)</p>
     * <p>*   **cloud_essd2**: PL2 ESSD.</p>
     * <p>*   **cloud_essd3**: PL3 ESSD.</p>
     * <p>*   **local_ssd**: local SSD.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Instances of MongoDB 4.4 and later only support cloud disks. **cloud_essd1** is selected if you leave this parameter empty.</p>
     * <br>
     * <p>*   Instances of MongoDB 4.2 and earlier support only local disks. **local_ssd** is selected if you leave this parameter empty.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query available zones.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailabilityZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailabilityZonesRequest self = new DescribeAvailabilityZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailabilityZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAvailabilityZonesRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeAvailabilityZonesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeAvailabilityZonesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailabilityZonesRequest setExcludeSecondaryZoneId(String excludeSecondaryZoneId) {
        this.excludeSecondaryZoneId = excludeSecondaryZoneId;
        return this;
    }
    public String getExcludeSecondaryZoneId() {
        return this.excludeSecondaryZoneId;
    }

    public DescribeAvailabilityZonesRequest setExcludeZoneId(String excludeZoneId) {
        this.excludeZoneId = excludeZoneId;
        return this;
    }
    public String getExcludeZoneId() {
        return this.excludeZoneId;
    }

    public DescribeAvailabilityZonesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailabilityZonesRequest setMongoType(String mongoType) {
        this.mongoType = mongoType;
        return this;
    }
    public String getMongoType() {
        return this.mongoType;
    }

    public DescribeAvailabilityZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailabilityZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailabilityZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailabilityZonesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAvailabilityZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailabilityZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailabilityZonesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAvailabilityZonesRequest setStorageSupport(String storageSupport) {
        this.storageSupport = storageSupport;
        return this;
    }
    public String getStorageSupport() {
        return this.storageSupport;
    }

    public DescribeAvailabilityZonesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeAvailabilityZonesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
