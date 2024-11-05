// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include ! # $ % ^ &amp; \* ( ) _ + - =</li>
     * <li>The password of the account must be 8 to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance is automatically renewed.</li>
     * <li><strong>false</strong>: The instance is manually renewed.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and optional when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup set ID.</p>
     * <blockquote>
     * <p>When you call this operation to clone an instance based on the backup set, this parameter is required. The <strong>SrcDBInstanceId</strong> parameter is also required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32994****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The business information. This is an additional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong>: pay-as-you-go. This is the default value.</li>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>PrePaid</strong>, you must also specify the <strong>Period</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-2x78****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to use coupons. Default value: null. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong>: uses coupons.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.standard</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name of the instance must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a letter.</li>
     * <li>The name can contain digits, letters, underscores (_), and hyphens (-).</li>
     * <li>The name must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The storage capacity of the instance. Unit: GB.</p>
     * <p>The values that can be specified for this parameter vary based on the instance types. For more information, see <a href="https://help.aliyun.com/document_detail/311410.html">Replica set instance types</a>.</p>
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
     * <p>When you call this operation to clone an instance, you can set this parameter to specify the database to clone. Otherwise, all databases of the instance are cloned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mongodbtest</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine of the instance. Set the value to <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <ul>
     * <li><strong>6.0</strong></li>
     * <li><strong>5.0</strong></li>
     * <li><strong>4.4</strong></li>
     * <li><strong>4.2</strong></li>
     * <li><strong>4.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>When you call this operation to clone an instance or restore an instance from the recycle bin, set the value of this parameter to the engine version of the source instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The global IP address whitelist template name of the instance. Multiple IP address whitelist template names are separated by commas (,) and each template name must be unique. (The template feature is available only in canary release.)</p>
     * 
     * <strong>example:</strong>
     * <p>g-qxieqf40xjst1ngp****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The zone where the hidden node resides for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
     * <li><strong>cn-hongkong-b</strong>: Hongkong Zone B.</li>
     * <li><strong>cn-hongkong-c</strong>: Hongkong Zone C.</li>
     * <li><strong>cn-hongkong-d</strong>: Hongkong Zone D.</li>
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
     * <li>This parameter is valid and required when the <strong>EngineVersion</strong> parameter is set to <strong>4.4</strong> or <strong>5.0</strong>.</li>
     * <li>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The network type of the instance. Valid value:</p>
     * <p><strong>VPC</strong>: Virtual Private Cloud (VPC)</p>
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
     * <p>The subscription period of the instance. Unit: months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <p>When you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>, this parameter is valid and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The provisioned IOPS. Valid values: 0 to 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The number of <strong>read-only nodes</strong> in the replica set instance. Default value: <strong>0</strong>. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of <strong>nodes</strong> in the replica set instance. Default value: 3. Valid values:</p>
     * <ul>
     * <li><strong>3</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>7</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which the instance is restored, which must be within seven days. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format (UTC time).</p>
     * <blockquote>
     * <p>When you call this operation to restore an instance to the specified time, this parameter is required. The <strong>SrcDBInstanceId</strong> parameter is also required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-13T12:11:14Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The backup restore type of the instance.</p>
     * <ul>
     * <li>0: restore an instance to the specified backup set.</li>
     * <li>1:  restore an instance to the specified time.</li>
     * <li>2: restore an  released instance to the specified backup set.</li>
     * <li>3：restore an instance to the specified cross-regional backup set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The zone where the secondary node resides for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
     * <li><strong>cn-hongkong-b</strong>: Hongkong Zone B.</li>
     * <li><strong>cn-hongkong-c</strong>: Hongkong Zone C.</li>
     * <li><strong>cn-hongkong-d</strong>: Hongkong Zone D.</li>
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
     * <li>This parameter is valid and required when the <strong>EngineVersion</strong> parameter is set to <strong>4.4</strong> or <strong>5.0</strong>.</li>
     * <li>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>HiddenZoneId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP addresses in an IP address whitelist. Multiple IP addresses are separated by commas (,), and each IP address in the IP address whitelist must be unique. The following types of values are supported:</p>
     * <ul>
     * <li>0.0.0.0/0</li>
     * <li>IP addresses, such as 10.23.12.24.</li>
     * <li>Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>A maximum of 1,000 IP addresses or CIDR blocks can be configured for each instance.</li>
     * <li>If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance. Proceed with caution.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx,192.168.xx.xx</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The ID of the source instance.</p>
     * <blockquote>
     * <p>When you call this operation to clone an instance, this parameter is required. The <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter is also required. When you call this operation to restore an instance from the recycle bin, this parameter is required. The <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter is not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1ee12ad351****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when restore type is set to 2 or 3.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    /**
     * <p>The storage engine of the instance. Set the value to <strong>WiredTiger</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>If you call this operation to clone an instance or restore an instance from the recycle bin, set this parameter to the storage engine of the source instance.</li>
     * <li>For more information about the limits on database versions and storage engines of an instance, see <a href="https://help.aliyun.com/document_detail/61906.html">MongoDB versions and storage engines</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WiredTiger</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd1</strong> :ESSD PL1.</li>
     * <li><strong>cloud_essd2</strong>: ESSD PL2.</li>
     * <li><strong>cloud_essd3</strong>: ESSD PL3.</li>
     * <li><strong>local_ssd</strong>: local SSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The custom tags added to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the instance is connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent zone list.</p>
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag and <strong>Tag.2.Key</strong> specifies the key of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testdatabase</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
