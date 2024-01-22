// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesRequest extends TeaModel {
    /**
     * <p>The language of the values of the returned **RegionName** and **ZoneName** parameters. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The instance type of the instance.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: replica set instance</p>
     * <p>*   **sharding**: sharded cluster instance</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The database engine version of the instance.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The secondary zone ID that is excluded from the query results. You can configure the ExcludeZoneId and ExcludeSecondaryZoneId parameters to specify the IDs of multiple zones that are excluded from the query results.</p>
     */
    @NameInMap("ExcludeSecondaryZoneId")
    public String excludeSecondaryZoneId;

    /**
     * <p>The zone ID that is excluded from the query results.</p>
     */
    @NameInMap("ExcludeZoneId")
    public String excludeZoneId;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **PrePaid** (default): subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The edition of the instance. High-Available Edition and Preview Edition (dbfs) are supported.</p>
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
     * <p>The number of nodes. This parameter is available only for replica set instances.</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The storage type of the instance. </p>
     * <p>- **cloud**: The system displays only zones in which cloud disk-based instances can be deployed. </p>
     * <p>- **local**: The system displays only zones in which local disk-based instances can be deployed. </p>
     * <p>- **default** or null: The system displays only zones in which cloud disk-based and local disk-based instances can be deployed.</p>
     */
    @NameInMap("StorageSupport")
    public String storageSupport;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_essd1**: PL1 enhanced SSD (ESSD)</p>
     * <p>*   **cloud_essd2**: PL2 ESSD</p>
     * <p>*   **cloud_essd3**: PL3 ESSD</p>
     * <p>*   **local_ssd**: Local SSD</p>
     * <br>
     * <p>> *   Instances that run MongoDB 4.4 or later support only cloud disks. **cloud_essd1** is selected if you leave this parameter empty.</p>
     * <p>> *   Instances that run MongoDB 4.2 and earlier support only local disks. **local_ssd** is selected if you leave this parameter empty.</p>
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

    public DescribeAvailabilityZonesRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
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
