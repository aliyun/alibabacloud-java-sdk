// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The password for the root account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>The special characters are !@#$%^&amp;\*()_+-=</p>
     * </li>
     * <li><p>It must be 8 to 32 characters long.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about connection failures caused by special characters in passwords, see <a href="">How do I fix a connection failure that is caused by special characters in a password?</a>.</p>
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
     * <li><p><strong>true</strong>: Enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong>: The default value. Disables auto-renewal. You must manually renew the instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is optional and takes effect only when you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The backup point ID. To query the backup point ID, call the <a href="">DescribeBackups</a> operation.</p>
     * <blockquote>
     * <p>You must specify this parameter and the <strong>SrcDBInstanceId</strong> parameter only when you clone an instance based on a backup point.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32994****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The business information. This is an optional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>PostPaid</strong>: The default value. Pay-as-you-go.</p>
     * </li>
     * <li><p><strong>PrePaid</strong>: Subscription.</p>
     * </li>
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
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token. Make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot be more than 64 characters long.</p>
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
     * <li><p><strong>default</strong> or <strong>null</strong> (default): Uses a coupon.</p>
     * </li>
     * <li><p><strong>youhuiquan_promotion_option_id_for_blank</strong>: Does not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. To query instance types, call the <a href="">DescribeAvailableResource</a> operation.</p>
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
     * <li><p>It must start with a letter or a Chinese character.</p>
     * </li>
     * <li><p>It can contain letters, Chinese characters, digits, underscores (_), periods (.), and hyphens (-).</p>
     * </li>
     * <li><p>It must be 2 to 256 characters long.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The storage space of the instance in GB.</p>
     * <p>The value of this parameter varies based on the instance type. For more information, see <a href="">Replica set instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <p>When you clone an instance, you can specify this parameter to clone specific databases. If you do not specify this parameter, all databases of the instance are cloned.</p>
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
     * <li><p><strong>8.0</strong></p>
     * </li>
     * <li><p><strong>7.0</strong></p>
     * </li>
     * <li><p><strong>6.0</strong></p>
     * </li>
     * <li><p><strong>5.0</strong></p>
     * </li>
     * <li><p><strong>4.4</strong></p>
     * </li>
     * <li><p><strong>4.2</strong></p>
     * </li>
     * <li><p><strong>4.0</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When you clone an instance or restore an instance from the recycle bin, this parameter must be the same as the engine version of the source instance.</p>
     * </blockquote>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Versions 3.4 and earlier are discontinued.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The global IP address whitelist templates for the instance. Separate multiple templates with commas (,). The templates cannot be repeated. This feature is in canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>g-qxieqf40xjst1ngpr3jz</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The zone where the hidden node is deployed. This parameter is used for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou-g</strong>: Zone G in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-h</strong>: Zone H in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-i</strong>: Zone I in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hongkong-b</strong>: Zone B in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-hongkong-c</strong>: Zone C in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-hongkong-d</strong>: Zone D in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-a</strong>: Zone A in Ulanqab.</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-b</strong>: Zone B in Ulanqab.</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-c</strong>: Zone C in Ulanqab.</p>
     * </li>
     * <li><p><strong>ap-southeast-1a</strong>: Zone A in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-1b</strong>: Zone B in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-1c</strong>: Zone C in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-5a</strong>: Zone A in Jakarta.</p>
     * </li>
     * <li><p><strong>ap-southeast-5b</strong>: Zone B in Jakarta.</p>
     * </li>
     * <li><p><strong>ap-southeast-5c</strong>: Zone C in Jakarta.</p>
     * </li>
     * <li><p><strong>eu-central-1a</strong>: Zone A in Frankfurt.</p>
     * </li>
     * <li><p><strong>eu-central-1b</strong>: Zone B in Frankfurt.</p>
     * </li>
     * <li><p><strong>eu-central-1c</strong>: Zone C in Frankfurt.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is available when the instance uses disks.</p>
     * </li>
     * <li><p>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong> parameter.</p>
     * </li>
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
     * <p><strong>VPC</strong>: virtual private cloud (VPC).</p>
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
     * <p>The subscription duration of the instance in months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>9</strong> (integers), <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <p>This parameter is required and takes effect only when you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The provisioned IOPS (input/output operations per second). Valid values: 0 to 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The number of <strong>read-only nodes</strong> in the replica set instance. Valid values are integers from <strong>0</strong> to <strong>5</strong>. The default value is <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID. To query the region ID, call the <a href="">DescribeRegions</a> operation.</p>
     * <blockquote>
     * <p>When you clone an instance or restore an instance from the recycle bin, this parameter must be the same as the region ID of the source instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of <strong>primary and secondary nodes</strong> in the replica set instance. Valid values:</p>
     * <ul>
     * <li><p><strong>3</strong> (default)</p>
     * </li>
     * <li><p><strong>5</strong></p>
     * </li>
     * <li><p><strong>7</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>You do not need to specify this parameter for standalone instances.</p>
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
     * <p>The point in time to which you want to restore the instance. You can specify any point in time within the last seven days. The time must be in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and in UTC.</p>
     * <blockquote>
     * <p>You must specify this parameter and the <strong>SrcDBInstanceId</strong> parameter only when you clone an instance based on a point in time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-13T12:11:14Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The method to restore an instance from a backup.</p>
     * <ul>
     * <li><p>0: Restores the instance to a specified backup set.</p>
     * </li>
     * <li><p>1: Restores the instance to a specified point in time.</p>
     * </li>
     * <li><p>2: Restores a released instance to a specified backup set.</p>
     * </li>
     * <li><p>3: Restores the instance to a specified geo-redundant backup set.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The zone where the secondary node is deployed. This parameter is used for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou-g</strong>: Zone G in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-h</strong>: Zone H in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-i</strong>: Zone I in Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-hongkong-b</strong>: Zone B in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-hongkong-c</strong>: Zone C in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-hongkong-d</strong>: Zone D in Hong Kong (China).</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-a</strong>: Zone A in Ulanqab.</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-b</strong>: Zone B in Ulanqab.</p>
     * </li>
     * <li><p><strong>cn-wulanchabu-c</strong>: Zone C in Ulanqab.</p>
     * </li>
     * <li><p><strong>ap-southeast-1a</strong>: Zone A in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-1b</strong>: Zone B in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-1c</strong>: Zone C in Singapore.</p>
     * </li>
     * <li><p><strong>ap-southeast-5a</strong>: Zone A in Jakarta.</p>
     * </li>
     * <li><p><strong>ap-southeast-5b</strong>: Zone B in Jakarta.</p>
     * </li>
     * <li><p><strong>ap-southeast-5c</strong>: Zone C in Jakarta.</p>
     * </li>
     * <li><p><strong>eu-central-1a</strong>: Zone A in Frankfurt.</p>
     * </li>
     * <li><p><strong>eu-central-1b</strong>: Zone B in Frankfurt.</p>
     * </li>
     * <li><p><strong>eu-central-1c</strong>: Zone C in Frankfurt.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is available when the instance uses disks.</p>
     * </li>
     * <li><p>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>HiddenZoneId</strong> parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP address whitelist of the instance. Separate multiple IP addresses with commas (,). Each IP address in the whitelist must be unique. The whitelist can be in one of the following formats:</p>
     * <ul>
     * <li><p>0.0.0.0/0</p>
     * </li>
     * <li><p>An IP address, for example, 10.23.12.24.</p>
     * </li>
     * <li><p>A CIDR block, for example, 10.23.12.0/24. The /24 indicates that the prefix of the CIDR block is 24 bits in length. You can set the prefix to a value from 1 to 32.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can add a maximum of 1,000 IP addresses or CIDR blocks to all IP address whitelists.</p>
     * </li>
     * <li><p>If you set the whitelist to 0.0.0.0/0, all IP addresses can access the instance. This is a high-risk setting. Use this with caution.</p>
     * </li>
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
     * <p>When you clone an instance, you must specify this parameter and the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter. When you restore an instance from the recycle bin, you only need to specify this parameter. You do not need to specify the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1ee12ad351****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The region where the source instance is located.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when RestoreType is set to 2 or 3.</li>
     * </ul>
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
     * <li><p>When you clone an instance or restore an instance from the recycle bin, this parameter must be the same as the storage engine of the source instance.</p>
     * </li>
     * <li><p>For more information about the constraints on storage engines and database versions, see <a href="">Versions and storage engines</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WiredTiger</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li><p><strong>cloud_essd1</strong>: ESSD PL1 disk.</p>
     * </li>
     * <li><p><strong>cloud_essd2</strong>: ESSD PL2 disk.</p>
     * </li>
     * <li><p><strong>cloud_essd3</strong>: ESSD PL3 disk.</p>
     * </li>
     * <li><p><strong>cloud_auto</strong>: ESSD AutoPL disk.</p>
     * </li>
     * <li><p><strong>local_ssd</strong>: Local SSD.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For standalone instances, if you pass the value cloud_essd1, an ESSD disk is used.</p>
     * </li>
     * <li><p>ESSD AutoPL disks are available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>For instances of version 4.4 or later, the default value is <strong>cloud_essd1</strong>.</p>
     * </li>
     * <li><p>For instances of version 4.2 or earlier, the default value is <strong>local_ssd</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The custom tags.</p>
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
     * <p>The zone ID. To query the zone ID, call the <a href="">DescribeRegions</a> operation.</p>
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
         * <li><strong>N</strong> specifies the Nth tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag, and <strong>Tag.2.Key</strong> specifies the key of the second tag.</li>
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
         * <p><strong>N</strong> specifies the Nth tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
