// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <ul>
     * <li>Must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
     * <li>Must be 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>For information about how to database connection failures caused by special characters in the password, see <a href="https://help.aliyun.com/document_detail/471568.html">How do I database connection failures caused by special characters in the connection string?</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: default value. Disables auto-renewal. You must manually renew the instance.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and optional when <strong>ChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The backup ID. You can invoke the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup ID.</p>
     * <blockquote>
     * <p>This parameter is required only when you invoke this operation to clone a clone instance from a backup point. You must also configure the <strong>SrcDBInstanceId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32994****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The additional information about the business.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong>: default value. Pay-as-you-go.</li>
     * <li><strong>PrePaid</strong>: Subscription.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>PrePaid</strong>, you must also configure the <strong>Period</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong> (default): uses a coupon.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the available instance types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.standard</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance name. The name must meet the following requirements:</p>
     * <ul>
     * <li>Must start with a Chinese character or a letter.</li>
     * <li>Can contain digits, Chinese characters, letters, underscores (_), periods (.), and hyphens (-).</li>
     * <li>Must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance storage capacity. Unit: GB.</p>
     * <p>The valid values depend on the instance type. For details, see <a href="https://help.aliyun.com/document_detail/311410.html">Replica set instance specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The name of the database.</p>
     * <blockquote>
     * <p>When you invoke this operation to clone a clone instance, you can specify this parameter to clone specific databases. If you do not specify this parameter, all databases are cloned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mongodbtest</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>Specifies whether to enable cloud disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The custom key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine. The value is fixed as <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Valid values:</p>
     * <ul>
     * <li><strong>8.0</strong></li>
     * <li><strong>7.0</strong></li>
     * <li><strong>6.0</strong></li>
     * <li><strong>5.0</strong></li>
     * <li><strong>4.4</strong></li>
     * <li><strong>4.2</strong></li>
     * <li><strong>4.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>If you call this operation to clone clone instance or restore clone instance from the recycle bin, set this parameter to the same value as that of the source instance.</p>
     * </blockquote>
     * <blockquote>
     * <p>Warning: Versions 3.4 and earlier are no longer available for purchase.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The global IP whitelist templates for the instance. Separate multiple templates with commas (,). Duplicate templates are not allowed. (This feature is in canary release.)</p>
     * 
     * <strong>example:</strong>
     * <p>g-qxieqf40xjst1ngpr3jz</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The zone where the hidden node is deployed to implement multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
     * <li><strong>cn-hongkong-b</strong>: Hong Kong (China) Zone B.</li>
     * <li><strong>cn-hongkong-c</strong>: Hong Kong (China) Zone C.</li>
     * <li><strong>cn-hongkong-d</strong>: Hong Kong (China) Zone D.</li>
     * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A.</li>
     * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B.</li>
     * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C.</li>
     * <li><strong>ap-southeast-1a</strong>: Singapore Zone A.</li>
     * <li><strong>ap-southeast-1b</strong>: Singapore Zone B.</li>
     * <li><strong>ap-southeast-1c</strong>: Singapore Zone C.</li>
     * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A.</li>
     * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B.</li>
     * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C.</li>
     * <li><strong>eu-central-1a</strong>: Frankfurt Zone A.</li>
     * <li><strong>eu-central-1b</strong>: Frankfurt Zone B.</li>
     * <li><strong>eu-central-1c</strong>: Frankfurt Zone C.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available when the instance uses cloud disks.</li>
     * <li>The value of this parameter cannot be the same as the values of <strong>ZoneId</strong> and <strong>SecondaryZoneId</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <p><strong>VPC</strong>: Virtual Private Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the instance. Unit: months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>9</strong> (integers), <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required when <strong>ChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The provisioned performance (IOPS). Valid values: 0 to 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The <strong>number of read-only nodes</strong> in the replica set instance. Valid values: <strong>0</strong> to <strong>5</strong> (integers). Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
     * <blockquote>
     * <p>If you call this operation to clone clone instance or restore clone instance from the recycle bin, set this parameter to the same value as that of the source instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The <strong>number of primary and secondary nodes</strong> in the replica set instance. Valid values:</p>
     * <ul>
     * <li><strong>3</strong> (default)</li>
     * <li><strong>5</strong></li>
     * <li><strong>7</strong></li>
     * </ul>
     * <blockquote>
     * <p>Notice: This parameter is not required for single-node instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to recover the instance to. You can specify any point in time within the last 7 days. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter is required only when you invoke this operation to clone a clone instance to a point in time. You must also configure the <strong>SrcDBInstanceId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-13T12:11:14Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The backup restoration type. Valid values:</p>
     * <ul>
     * <li>0: recovers the instance to a specified backup set.</li>
     * <li>1: recovers the instance to a specified point in time.</li>
     * <li>2: recovers a released instance to a specified backup set.</li>
     * <li>3: recovers the instance to a specified geo-redundancy backup set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The zone where the secondary node is deployed to implement multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
     * <li><strong>cn-hongkong-b</strong>: Hong Kong (China) Zone B.</li>
     * <li><strong>cn-hongkong-c</strong>: Hong Kong (China) Zone C.</li>
     * <li><strong>cn-hongkong-d</strong>: Hong Kong (China) Zone D.</li>
     * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A.</li>
     * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B.</li>
     * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C.</li>
     * <li><strong>ap-southeast-1a</strong>: Singapore Zone A.</li>
     * <li><strong>ap-southeast-1b</strong>: Singapore Zone B.</li>
     * <li><strong>ap-southeast-1c</strong>: Singapore Zone C.</li>
     * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A.</li>
     * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B.</li>
     * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C.</li>
     * <li><strong>eu-central-1a</strong>: Frankfurt Zone A.</li>
     * <li><strong>eu-central-1b</strong>: Frankfurt Zone B.</li>
     * <li><strong>eu-central-1c</strong>: Frankfurt Zone C.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available when the instance uses cloud disks.</li>
     * <li>The value of this parameter cannot be the same as the values of <strong>ZoneId</strong> and <strong>HiddenZoneId</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP whitelist of the instance. Separate multiple IP addresses with commas (,). Duplicate IP addresses are not allowed. The following formats are supported:</p>
     * <ul>
     * <li>0.0.0.0/0</li>
     * <li>IP address format, such as 10.23.12.24.</li>
     * <li>CIDR block format, such as 10.23.12.0/24. In this example, 24 indicates that the prefix of the CIDR block is 24 bits in length. The prefix length ranges from 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Each instance supports a maximum of 1,000 IP addresses or CIDR blocks across all IP whitelist groups.</li>
     * <li>0.0.0.0/0 allows all IP addresses to access the instance database. This is a high-risk setting. Proceed with caution.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx,192.168.xx.xx</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The source instance ID.</p>
     * <blockquote>
     * <p>If you call this operation to clone clone instance, you must configure this parameter along with the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter. If you call this operation to restore clone instance from the recycle bin, you only need to configure this parameter. The <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters are not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1ee12ad351****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The region where the source instance resides.</p>
     * <blockquote>
     * <p>This parameter is required when the restoration type is 2 or 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    /**
     * <p>The storage engine of the instance. The value is fixed as <strong>WiredTiger</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>If you call this operation to clone clone instance or restore clone instance from the recycle bin, set this parameter to the same value as that of the source instance.</li>
     * <li>For information about the constraints on storage engines and versions, see <a href="https://help.aliyun.com/document_detail/61906.html">Versions and storage engines</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WiredTiger</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd1</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>cloud_auto</strong>: ESSD AutoPL disk.</li>
     * <li><strong>local_ssd</strong>: local SSD.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For single-node instances, if you specify cloud_essd1, the instance uses a cloud_essd disk.</li>
     * <li>ESSD AutoPL disks are currently available only on the China site.</li>
     * <li>For instances running version 4.4 or later, the default value is <strong>cloud_essd1</strong>.</li>
     * <li>For instances running version 4.2 or earlier, the default value is <strong>local_ssd</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The user-defined tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateDBInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDBInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceRequest setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    public CreateDBInstanceRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateDBInstanceRequest setHiddenZoneId(String hiddenZoneId) {
        this.hiddenZoneId = hiddenZoneId;
        return this;
    }
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    public CreateDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CreateDBInstanceRequest setReadonlyReplicas(String readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDBInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDBInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateDBInstanceRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public CreateDBInstanceRequest setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }
    public String getStorageEngine() {
        return this.storageEngine;
    }

    public CreateDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceRequest setTag(java.util.List<CreateDBInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <ul>
         * <li><strong>N</strong> indicates the sequence number of the tag key. For example, <strong>Tag.1.Key</strong> indicates the key of the first tag, and <strong>Tag.2.Key</strong> indicates the key of the second tag.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testdatabase</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p><strong>N</strong> indicates the sequence number of the tag value. For example, <strong>Tag.1.Value</strong> indicates the value of the first tag, and <strong>Tag.2.Value</strong> indicates the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestTag self = new CreateDBInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
