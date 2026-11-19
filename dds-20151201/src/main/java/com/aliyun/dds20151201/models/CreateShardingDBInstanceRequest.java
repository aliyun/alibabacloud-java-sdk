// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateShardingDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <ul>
     * <li>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
     * <li>It must be 8 to 32 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about how to troubleshoot connection failures caused by special characters in database connection string, see <a href="https://help.aliyun.com/document_detail/471568.html">What do I do if a connection failure occurs because the username or password in database connection string contains special characters?</a>.</p>
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
     * <li><strong>false</strong>: disables auto-renewal. In this case, you must manually renew the instance. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and optional only when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The cluster backup ID.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only when RestoreType is set to 2 or 3.</li>
     * </ul>
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
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the Configserver node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigServer")
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer;

    /**
     * <p>The instance name. The name must meet the following requirements:</p>
     * <ul>
     * <li>It must start with a letter.</li>
     * <li>It can contain digits, letters, underscores (_), periods (.), and hyphens (-).</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The region of the geo-redundant backup.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without executing the actual request. The system checks the request parameters, request format, service limits, and available resources. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the DryRunOperation error code.</li>
     * <li>false: sends a normal request and executes the operation after the request passes the dry run. This is the default value.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

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
     * <p>The database engine. Set the value to <strong>MongoDB</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database version. Valid values:</p>
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
     * <ul>
     * <li>For more information about the constraints on storage engines and versions, see <a href="https://help.aliyun.com/document_detail/61906.html">Versions and storage engines</a>.</li>
     * <li>When you call this operation to clone an instance, the value of this parameter must be the same as that of the source instance.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The global IP address whitelist templates of the instance. Separate multiple templates with commas (,). Each template must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>g-qxieqf40xjst1ngpr3jz</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The secondary zone 2 for multi-zone deployment. Valid values:</p>
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
     * <li>This parameter is valid only when the instance uses cloud disks.</li>
     * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong>.</li>
     * <li>For more information about the multi-zone deployment policy for sharded cluster instances, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The maintenance end time.</p>
     * 
     * <strong>example:</strong>
     * <p>22:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The maintenance start time.</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The information about the mongos nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mongos")
    public java.util.List<CreateShardingDBInstanceRequestMongos> mongos;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <p><strong>VPC</strong>: VPC.</p>
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
     * <p>Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <p>This parameter is required and valid only when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The access protocol type. Valid values:</p>
     * <ul>
     * <li><strong>mongodb</strong>: MongoDB protocol.</li>
     * <li><strong>dynamodb</strong>: DynamoDB protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mongodb</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The provisioned IOPS.</p>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

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
     * <p>The information about the shard nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReplicaSet")
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore the instance. You can specify any point in time within the last seven days. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify this parameter only when you call this operation to clone an instance. You must also specify the <strong>SrcDBInstanceId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-08T02:30:25Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The backup restoration type. Valid values:</p>
     * <ul>
     * <li>1: restore the instance to a specified point in time.</li>
     * <li>2: restore a released instance to a specified backup set.</li>
     * <li>3: restore the instance to a specified geo-redundant backup set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The secondary zone 1 for multi-zone deployment. Valid values:</p>
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
     * <li><strong>eu-central-1c</strong>: Frankfurt Zone C.<blockquote>
     * <ul>
     * <li>This parameter is valid only when the instance uses cloud disks.</li>
     * <li>The value of this parameter cannot be the same as the value of <strong>ZoneId</strong> or <strong>HiddenZoneId</strong>.</li>
     * <li>For more information about the multi-zone deployment policy for sharded cluster instances, see <a href="https://help.aliyun.com/document_detail/117865.html">Create a multi-zone sharded cluster instance</a>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP address whitelist of the instance. Separate multiple IP addresses with commas (,). Each IP address must be unique. The following formats are supported:</p>
     * <ul>
     * <li>0.0.0.0/0</li>
     * <li>IP addresses, such as 10.23.12.24.</li>
     * <li>CIDR blocks, such as 10.23.12.0/24. 24 indicates the length of the prefix in the CIDR block, and the prefix length ranges from 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can add up to 1,000 IP addresses or CIDR blocks to the whitelist of an instance. The total number of IP addresses and CIDR blocks in all whitelist groups cannot exceed 1,000.</li>
     * <li>0.0.0.0/0 indicates that all IP addresses can access the databases of the instance. This is a high-risk setting. Configure this setting with caution.</li>
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
     * <p>You must specify this parameter only when you call this operation to clone an instance. You must also specify the <strong>RestoreTime</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp11483712c1****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The region of the source instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when the backup restoration type is rebuilding a deleted instance.</li>
     * <li>This parameter is required when the backup restoration type is cloning from a geo-redundant backup.</li>
     * </ul>
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
     * <ul>
     * <li>When you call this operation to clone an instance, the value of this parameter must be the same as that of the source instance.</li>
     * <li>For more information about the constraints on storage engines and versions, see <a href="https://help.aliyun.com/document_detail/61906.html">Versions and storage engines</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WiredTiger</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type. Valid values: </p>
     * <ul>
     * <li><strong>cloud_essd1</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>local_ssd</strong>: Local SSD.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Instances of version 4.4 or later support only cloud disks. If you do not specify this parameter, <strong>cloud_essd1</strong> is selected by default.</li>
     * <li>Instances of version 4.2 or earlier support only local disks. If you do not specify this parameter, <strong>local_ssd</strong> is selected by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>Specifies whether to enable TTL index cleanup for the restored instance. A value of true or an empty value indicates that cleanup is enabled.</p>
     */
    @NameInMap("TTLEnabled")
    public Boolean TTLEnabled;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateShardingDBInstanceRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1vj604nj5a9zz74****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1n3i15v90el48nx****</p>
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

    public CreateShardingDBInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public CreateShardingDBInstanceRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public CreateShardingDBInstanceRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
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

    public CreateShardingDBInstanceRequest setTTLEnabled(Boolean TTLEnabled) {
        this.TTLEnabled = TTLEnabled;
        return this;
    }
    public Boolean getTTLEnabled() {
        return this.TTLEnabled;
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
         * <p>The specifications of the Configserver node. Valid values:</p>
         * <ul>
         * <li><strong>mdb.shard.2x.xlarge.d</strong>: 4 cores, 8 GB (dedicated). This specification is supported only by instances of version 4.4 or later.</li>
         * <li><strong>dds.cs.mid</strong>: 1 core, 2 GB (general-purpose). This specification is supported only by instances of version 4.2 or earlier.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.2x.xlarge.d</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The storage capacity of the Configserver node. Unit: GB.</p>
         * <blockquote>
         * <p>The valid values are subject to the instance specifications. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
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
         * <p>The specifications of the mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * <blockquote>
         * <ul>
         * <li><strong>N</strong> in the parameter name specifies the Nth mongos node. For example, <strong>Mongos.2.Class</strong> specifies the specifications of the second mongos node.</li>
         * <li>Valid values of <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</li>
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
         * <p>The specifications of the shard node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</p>
         * <blockquote>
         * <ul>
         * <li><strong>N</strong> in the parameter name specifies the Nth shard node. For example, <strong>ReplicaSet.2.Class</strong> specifies the specifications of the second shard node.</li>
         * <li>Valid values of <strong>N</strong>: <strong>2</strong> to <strong>32</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds.shard.standard</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The number of read-only nodes in the shard node.</p>
         * <p>Valid values: <strong>0</strong> to <strong>5</strong>. Default value: <strong>0</strong>.</p>
         * <blockquote>
         * <p><strong>N</strong> in the parameter name specifies the Nth shard node. For example, <strong>ReplicaSet.2.ReadonlyReplicas</strong> specifies the number of read-only nodes in the second shard node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        /**
         * <p>The storage capacity of the shard node. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>The valid values are subject to the instance specifications. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
         * <li><strong>N</strong> in the parameter name specifies the Nth shard node. For example, <strong>ReplicaSet.2.Storage</strong> specifies the storage capacity of the second shard node.</li>
         * </ul>
         * </blockquote>
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
         * <p><strong>N</strong> in the parameter name specifies the Nth tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag, and <strong>Tag.2.Key</strong> specifies the key of the second tag.</p>
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
         * <p><strong>N</strong> in the parameter name specifies the Nth tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
