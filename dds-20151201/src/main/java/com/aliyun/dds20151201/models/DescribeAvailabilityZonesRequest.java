// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesRequest extends TeaModel {
    /**
     * <p>The language of the <strong>RegionName</strong> and <strong>ZoneName</strong> response parameters. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese. Default value.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.standard</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The database type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: replica set instance.</li>
     * <li><strong>sharding</strong>: sharded cluster instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The secondary zone ID to be excluded from the query results in the current region. This parameter is used together with ExcludeZoneId to filter multiple zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
    @NameInMap("ExcludeSecondaryZoneId")
    public String excludeSecondaryZoneId;

    /**
     * <p>The zone ID to be excluded from the query results in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ExcludeZoneId")
    public String excludeZoneId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription. Default value.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. Valid values: </p>
     * <ul>
     * <li><strong>sharding</strong>: sharded cluster instance.</li>
     * <li><strong>replicate</strong>: replica set instance or standalone instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>replicate</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The MongoDB edition, such as the high-availability edition or the test edition (dbfs).</p>
     * 
     * <strong>example:</strong>
     * <p>dbfs</p>
     */
    @NameInMap("MongoType")
    public String mongoType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of nodes.</p>
     * <blockquote>
     * <p>This parameter is supported only for replica set instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx2m4rqu7pry</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li><strong>cloud</strong>: displays only the zones that support cloud disk instances.</li>
     * <li><strong>local</strong>: displays only the zones that support local disk instances.</li>
     * <li><strong>default</strong> or empty: displays the zones that support both local disk and cloud disk instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("StorageSupport")
    public String storageSupport;

    /**
     * <p>The storage type. Valid values: </p>
     * <ul>
     * <li><strong>cloud_essd1</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>local_ssd</strong>: local SSD.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Instances of version 4.4 and later support only cloud disks. If you do not specify this parameter, <strong>cloud_essd1</strong> is selected by default.</li>
     * <li>Instances of version 4.2 and earlier support only local disks. If you do not specify this parameter, <strong>local_ssd</strong> is selected by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
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

    public DescribeAvailabilityZonesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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
