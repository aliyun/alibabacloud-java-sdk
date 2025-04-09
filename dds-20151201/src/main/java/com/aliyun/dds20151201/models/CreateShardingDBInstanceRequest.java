// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateShardingDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <ul>
     * <li>The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The following special characters are supported: ! @ # $ % ^ &amp; \* ( ) _ + - =.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p> For more information about how to resolve failed database connections due to special characters, see <a href="https://help.aliyun.com/document_detail/471568.html">What do I do if my instance is not connected due to special characters in the password in the connection string of the instance?</a></p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and optional if you set the value of <strong>ChargeType</strong> to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The ID of the backup set. </p>
     * <blockquote>
     * <p>When you call this operation to clone an instance based on the backup set, this parameter is required. The <strong>SrcDBInstanceId</strong> parameter is also required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cb-xxx</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
     * <li><strong>PrePaid</strong>: subscription</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>PrePaid</strong>, you must also configure the <strong>Period</strong> parameter.</p>
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

    /**
     * <p>The ConfigServer nodes of the instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigServer")
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer;

    /**
     * <p>The name of the instance. The name of the instance must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a letter.</li>
     * <li>It can contain digits, letters, underscores (_), and hyphens (-).</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The region of the backup set used for the cross-region backup and restoration.</p>
     * <blockquote>
     * <p> This parameter is required when you set the RestoreType parameter to 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <ul>
     * <li><strong>7.0</strong></li>
     * <li><strong>6.0</strong></li>
     * <li><strong>5.0</strong></li>
     * <li><strong>4.4</strong></li>
     * <li><strong>4.2</strong></li>
     * <li><strong>4.0</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>For more information about the limits on database versions and storage engines, see <a href="https://help.aliyun.com/document_detail/61906.html">MongoDB versions and storage engines</a>.</p>
     * </li>
     * <li><p>If you call this operation to clone an instance, set the value of this parameter to the database engine version of the source instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The global IP address whitelist template of the instance. Separate multiple templates with commas (,). The template name must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>g-qxieqf40xjst1ngp****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The ID of secondary zone 2 for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
     * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
     * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
     * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
     * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
     * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
     * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
     * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
     * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
     * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
     * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
     * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
     * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
     * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
     * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
     * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required if you set the value of <strong>EngineVersion</strong> to <strong>4.4</strong> or <strong>5.0</strong>.</li>
     * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong>.</li>
     * <li>For more information about the multi-zone deployment policy of a sharded cluster instance, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The mongos nodes of the instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mongos")
    public java.util.List<CreateShardingDBInstanceRequestMongos> mongos;

    /**
     * <p>The network type of the instance. Set the value to VPC.</p>
     * <hr>
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
     * <p>The access protocol type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>mongodb</strong></li>
     * <li><strong>dynamodb</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mongodb</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The provisioned IOPS of the instance:</p>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

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
     * <p>The information of the shard component.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReplicaSet")
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet;

    /**
     * <p>The resource group ID. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
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
     * <p>The point in time to restore the instance, which must be within seven days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in Coordinated Universal Time (UTC).</p>
     * <blockquote>
     * <p>This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify <strong>SrcDBInstanceId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-08T02:30:25Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration type of the instance. Valid values:</p>
     * <ul>
     * <li>1: restores the instance data to the specified point in time.</li>
     * <li>2: restores the data of the released instance to the specified backup set.</li>
     * <li>3: restores the instance data to the specified cross-region backup set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The ID of secondary zone 1 for multi-zone deployment. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
     * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
     * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
     * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
     * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
     * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
     * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
     * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
     * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
     * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
     * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
     * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
     * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
     * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
     * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
     * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
     * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
     * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required if you set the value of <strong>EngineVersion</strong> to <strong>4.4</strong> or <strong>5.0</strong>.</li>
     * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>HiddenZoneId</strong>.</li>
     * <li>For more information about the multi-zone deployment policy of a sharded cluster instance, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP addresses in an IP address whitelist of the instance. Multiple IP addresses are separated by commas (,), and each IP address in the IP address whitelist must be unique. The following types of values are supported:</p>
     * <ul>
     * <li>0.0.0.0/0</li>
     * <li>IP addresses, such as 10.23.12.24.</li>
     * <li>CIDR blocks, such as 10.23.12.0/24. In this case, 24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.</li>
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
     * <p>The source instance ID.</p>
     * <blockquote>
     * <p>This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp11483712c1****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p>This parameter is required when restore type is set to 2 or 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    /**
     * <p>The storage engine of the instance. Set the value to <strong>WiredTiger</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you call this operation to clone an instance, set the value of this parameter to the storage engine of the source instance.</p>
     * </li>
     * <li><p>For more information about the limits on database versions and storage engines, see <a href="https://help.aliyun.com/document_detail/61906.html">MongoDB versions and storage engines</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WiredTiger</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd1</strong>: ESSD PL1</li>
     * <li><strong>cloud_essd2</strong>: ESSD PL2</li>
     * <li><strong>cloud_essd3</strong>: ESSD PL3</li>
     * <li><strong>local_ssd</strong>: local SSD</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Instances of MongoDB 4.4 and later support only cloud disks. <strong>cloud_essd1</strong> is selected if you leave this parameter empty.</li>
     * <li>Instances of MongoDB 4.2 and earlier support only local disks. <strong>local_ssd</strong> is selected if you leave this parameter empty.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The custom tags that you want to add to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateShardingDBInstanceRequestTag> tag;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1vj604nj5a9zz74****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1n3i15v90el48nx****</p>
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

    public static CreateShardingDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShardingDBInstanceRequest self = new CreateShardingDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateShardingDBInstanceRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateShardingDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateShardingDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateShardingDBInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateShardingDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateShardingDBInstanceRequest setConfigServer(java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer) {
        this.configServer = configServer;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> getConfigServer() {
        return this.configServer;
    }

    public CreateShardingDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateShardingDBInstanceRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public CreateShardingDBInstanceRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateShardingDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateShardingDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateShardingDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateShardingDBInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateShardingDBInstanceRequest setHiddenZoneId(String hiddenZoneId) {
        this.hiddenZoneId = hiddenZoneId;
        return this;
    }
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    public CreateShardingDBInstanceRequest setMongos(java.util.List<CreateShardingDBInstanceRequestMongos> mongos) {
        this.mongos = mongos;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestMongos> getMongos() {
        return this.mongos;
    }

    public CreateShardingDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateShardingDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateShardingDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateShardingDBInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateShardingDBInstanceRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateShardingDBInstanceRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CreateShardingDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateShardingDBInstanceRequest setReplicaSet(java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet) {
        this.replicaSet = replicaSet;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> getReplicaSet() {
        return this.replicaSet;
    }

    public CreateShardingDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateShardingDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateShardingDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateShardingDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateShardingDBInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateShardingDBInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateShardingDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateShardingDBInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateShardingDBInstanceRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public CreateShardingDBInstanceRequest setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }
    public String getStorageEngine() {
        return this.storageEngine;
    }

    public CreateShardingDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateShardingDBInstanceRequest setTag(java.util.List<CreateShardingDBInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateShardingDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateShardingDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateShardingDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateShardingDBInstanceRequestConfigServer extends TeaModel {
        /**
         * <p>The instance type of the ConfigServer node. Valid values:</p>
         * <ul>
         * <li><strong>mdb.shard.2x.xlarge.d</strong>: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and later support this instance type.</li>
         * <li><strong>dds.cs.mid</strong> :1 core, 2 GB (general-purpose). Only instances that run MongoDB 4.2 and earlier support this instance type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.2x.xlarge.d</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The storage space of the ConfigServer node. Unit: GB.</p>
         * <blockquote>
         * <p>The values that can be specified for this parameter vary based on the instance types. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        public static CreateShardingDBInstanceRequestConfigServer build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestConfigServer self = new CreateShardingDBInstanceRequestConfigServer();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestConfigServer set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public CreateShardingDBInstanceRequestConfigServer setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

    public static class CreateShardingDBInstanceRequestMongos extends TeaModel {
        /**
         * <p>The instance type of the mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * <blockquote>
         * <ul>
         * <li><strong>N</strong> specifies the serial number of the mongos node for which the instance type is specified. For example, <strong>Mongos.2.Class</strong> specifies the instance type of the second mongos node.</li>
         * <li>Valid values for <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.2x.xlarge.d</p>
         */
        @NameInMap("Class")
        public String _class;

        public static CreateShardingDBInstanceRequestMongos build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestMongos self = new CreateShardingDBInstanceRequestMongos();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestMongos set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class CreateShardingDBInstanceRequestReplicaSet extends TeaModel {
        /**
         * <p>The instance type of the shard component. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><strong>N</strong> specifies the serial number of the shard component for which the instance type is specified. For example, <strong>ReplicaSet.2.Class</strong> specifies the instance type of the second shard component.</p>
         * </li>
         * <li><p>Valid values of <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds.shard.standard</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The number of read-only nodes in the shard component.</p>
         * <p>Valid values: <strong>0</strong>, <strong>1, 2, 3, 4, and 5</strong>. Default value: <strong>0</strong>.</p>
         * <blockquote>
         * <p> <strong>N</strong> specifies the serial number of the shard component for which you want to set the number of read-only nodes. <strong>ReplicaSet.2.ReadonlyReplicas</strong> specifies the number of read-only nodes in the second shard component.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        /**
         * <p>The storage capacity of the shard component. Unit: GB.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The values that can be specified for this parameter vary based on the instance types. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * </li>
         * <li><p><strong>N</strong> specifies the serial number of the shard component for which the storage capacity is specified. For example, <strong>ReplicaSet.2.Storage</strong> specifies the storage capacity of the second shard component.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        public static CreateShardingDBInstanceRequestReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestReplicaSet self = new CreateShardingDBInstanceRequestReplicaSet();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestReplicaSet set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public CreateShardingDBInstanceRequestReplicaSet setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public CreateShardingDBInstanceRequestReplicaSet setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

    public static class CreateShardingDBInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <p> <strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag and <strong>Tag.2.Key</strong> specifies the key of the second tag.</p>
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
         * <p> <strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag and Tag.2.Value specifies the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateShardingDBInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestTag self = new CreateShardingDBInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateShardingDBInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
