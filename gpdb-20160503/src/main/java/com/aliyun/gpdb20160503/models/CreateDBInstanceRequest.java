// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The AI node specifications.</p>
     */
    @NameInMap("AINodeSpecInfos")
    public java.util.List<CreateDBInstanceRequestAINodeSpecInfos> AINodeSpecInfos;

    /**
     * <p>The ID of the backup set.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the backup set IDs for the source instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The cache size for a serverless instance, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CacheStorageSize")
    public String cacheStorageSize;

    /**
     * <p>A client token used to ensure the idempotence of the request. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to load a sample dataset after the instance is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: A sample dataset is loaded.</p>
     * </li>
     * <li><p><strong>false</strong>: A sample dataset is not loaded.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, a sample dataset is not loaded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateSampleData")
    public Boolean createSampleData;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><p><strong>HighAvailability</strong>: High-availability Edition</p>
     * </li>
     * <li><p><strong>Basic</strong>: Basic Edition</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for instances in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>The instance type. For more information, see the description of the <code>DBInstanceClass</code> parameter.</p>
     * <blockquote>
     * <p>This parameter is required for instances in reserved storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gpdb.group.segsdx1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The number of compute groups. Valid values: 2, 4, 8, 12, 16, 24, 32, 64, 96, and 128.</p>
     * <blockquote>
     * <p>This parameter is required for instances in reserved storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The instance resource mode. Valid values:</p>
     * <ul>
     * <li><p><strong>StorageElastic</strong>: elastic storage mode</p>
     * </li>
     * <li><p><strong>Serverless</strong>: serverless mode</p>
     * </li>
     * <li><p><strong>Classic</strong>: reserved storage mode</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StorageElastic</p>
     */
    @NameInMap("DBInstanceMode")
    public String DBInstanceMode;

    /**
     * <p>The deployment mode. Valid values:</p>
     * <ul>
     * <li><p>multiple: multi-AZ deployment.</p>
     * </li>
     * <li><p>single: single-AZ deployment.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If this parameter is not specified, the default value is single.</p>
     * </li>
     * <li><p>Defaults to <code>single</code> (single-AZ deployment), which is the only mode currently supported.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>Specifies whether to enable SSL encryption. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: SSL encryption is enabled.</p>
     * </li>
     * <li><p><strong>false</strong> (default): SSL encryption is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>The ID of the encryption key.</p>
     * <blockquote>
     * <p>If <code>EncryptionType</code> is set to <code>CloudDisk</code>, you must specify the ID of an encryption key in the same region. Otherwise, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d2470df-da7b-4786-b981-88888888****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Valid values:</p>
     * <ul>
     * <li><p><strong>NULL</strong>: disables encryption. This is the default value.</p>
     * </li>
     * <li><p><strong>CloudDisk</strong>: Enables cloud disk encryption. If you select this option, you must also specify a value for <code>EncryptionKey</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After cloud disk encryption is enabled, it cannot be disabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>The database engine. Set the value to <strong>gpdb</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Valid values:</p>
     * <ul>
     * <li><p><strong>6.0</strong></p>
     * </li>
     * <li><p><strong>7.0</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The period of inactivity, in seconds, after which the instance is considered idle. Minimum value: 60. Default value: 600.</p>
     * <blockquote>
     * <p>This parameter is required only for serverless instances that use auto-scheduling.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("IdleTime")
    public Integer idleTime;

    /**
     * <p>The instance network type. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>Only VPCs are supported.</p>
     * </li>
     * <li><p>If this parameter is not specified, VPC is used by default.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type for the compute nodes.</p>
     * <p>Valid values for a High-availability Edition instance in elastic storage mode:</p>
     * <ul>
     * <li><p><strong>2C16G</strong></p>
     * </li>
     * <li><p><strong>4C32G</strong></p>
     * </li>
     * <li><p><strong>16C128G</strong></p>
     * </li>
     * </ul>
     * <p>Valid values for a Basic Edition instance in elastic storage mode:</p>
     * <ul>
     * <li><p><strong>2C8G</strong></p>
     * </li>
     * <li><p><strong>4C16G</strong></p>
     * </li>
     * <li><p><strong>8C32G</strong></p>
     * </li>
     * <li><p><strong>16C64G</strong></p>
     * </li>
     * </ul>
     * <p>Valid values for a serverless instance:</p>
     * <ul>
     * <li><p><strong>4C16G</strong></p>
     * </li>
     * <li><p><strong>8C32G</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for instances in elastic storage mode or serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>Use this parameter to configure the coordinator node as a MasterAI node.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter and <code>MasterCU</code> are mutually exclusive.</p>
     * </li>
     * <li><p>This feature is available only in some regions and zones.</p>
     * </li>
     * <li><p>MasterAI nodes are supported only for AnalyticDB for PostgreSQL V7.0 Basic Edition instances.</p>
     * </li>
     * <li><p>For a list of all possible values, see the coordinator node specification change page in the console.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ADB.AIMedium.2</p>
     */
    @NameInMap("MasterAISpec")
    public String masterAISpec;

    /**
     * <p>The resources for the coordinator node. Valid values:</p>
     * <ul>
     * <li><p>2 CU</p>
     * </li>
     * <li><p>4 CU</p>
     * </li>
     * <li><p>8 CU</p>
     * </li>
     * <li><p>16 CU</p>
     * </li>
     * <li><p>32 CU</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You are charged for coordinator node resources of 8 CUs or more.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8 CU</p>
     */
    @NameInMap("MasterCU")
    public Integer masterCU;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If this parameter is not specified, the default billing method is pay-as-you-go.</p>
     * </li>
     * <li><p>Discounts are available for subscriptions of one year or longer. Select a billing method based on your business needs.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong></p>
     * </li>
     * <li><p><strong>Year</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><p><strong>standard</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>cost-effective</strong>: Cost-effective Edition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is standard.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ProdType")
    public String prodType;

    /**
     * <p>The ID of the region for the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the IDs of available regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist for the instance.</p>
     * <p>A value of 127.0.0.1 blocks all external access. After you create the instance, you can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The performance level of the ESSDs. Valid values:</p>
     * <ul>
     * <li><p><strong>pl0</strong>: PL0</p>
     * </li>
     * <li><p><strong>pl1</strong>: PL1</p>
     * </li>
     * <li><p><strong>pl2</strong>: PL2</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter applies only if the segment node storage type is ESSD.</p>
     * </li>
     * <li><p>If this parameter is not specified, pl1 is used by default.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes. Valid values:</p>
     * <ul>
     * <li><p>For a High-availability Edition instance in elastic storage mode, the value must be a multiple of 4, from 4 to 512.</p>
     * </li>
     * <li><p>For a Basic Edition instance in elastic storage mode, the value must be a multiple of 2, from 2 to 512.</p>
     * </li>
     * <li><p>For a serverless instance, the value must be a multiple of 2, from 2 to 512.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for instances in elastic storage mode or serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The storage type for the segment nodes. Only ESSDs are supported. Set the value to <strong>cloud_essd</strong>.</p>
     * <blockquote>
     * <p>This parameter is required for instances in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The mode of the serverless instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Manual</strong>: manual scheduling. This is the default value.</p>
     * </li>
     * <li><p><strong>Auto</strong>: auto-scheduling.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required only for instances in serverless mode.</p>
     * </li>
     * <li><p>Auto-scheduling for AnalyticDB for PostgreSQL instances in serverless mode is in preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?product=rds">submit a ticket</a> to be added to the whitelist.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("ServerlessMode")
    public String serverlessMode;

    /**
     * <p>The threshold for computing resources, in AnalyticDB Compute Units (ACUs). The value must be a multiple of 8, ranging from 8 to 32. The default value is 32.</p>
     * <blockquote>
     * <p>This parameter is required only for serverless instances that use auto-scheduling.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ServerlessResource")
    public Integer serverlessResource;

    /**
     * <p>The ID of the source instance to be cloned.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the destination region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    /**
     * <p>The ID of the vSwitch in the standby zone.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required only for a multi-AZ deployment.</p>
     * </li>
     * <li><p>The vSwitch must be in the standby zone specified in <code>StandbyZoneId</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The ID of the standby zone.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required only for a multi-AZ deployment.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the IDs of available zones.</p>
     * </li>
     * <li><p>The standby zone must be different from the primary zone.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The storage capacity for the instance, in GB. Valid values: &lt;props=&quot;china&quot;&gt;50 to 8000&lt;props=&quot;intl&quot;&gt;50 to 6000.</p>
     * <blockquote>
     * <p>This parameter is required for instances in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags to add to the instance. You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li><p>If <strong>Period</strong> is <strong>Month</strong>, the value can be an integer from 1 to 9.</p>
     * </li>
     * <li><p>If <strong>Period</strong> is <strong>Year</strong>, the value can be an integer from 1 to 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required.</p>
     * </li>
     * <li><p>The VPC must be in the region specified by <code>RegionId</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp19ame5m1r3oejns****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required.</p>
     * </li>
     * <li><p>The vSwitch must be in the zone specified by <code>ZoneId</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
     * <ul>
     * <li><p><strong>enabled</strong>: enables vector engine optimization.</p>
     * </li>
     * <li><p><strong>disabled</strong> (default): disables vector engine optimization.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For mainstream analytics, data warehousing, and real-time data warehousing scenarios, we recommend that you <strong>disable</strong> vector engine optimization.</p>
     * </li>
     * <li><p>For AIGC and vector search scenarios, we recommend that you <strong>enable</strong> vector engine optimization.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    /**
     * <p>The ID of the zone for the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the IDs of available zones.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAINodeSpecInfos(java.util.List<CreateDBInstanceRequestAINodeSpecInfos> AINodeSpecInfos) {
        this.AINodeSpecInfos = AINodeSpecInfos;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestAINodeSpecInfos> getAINodeSpecInfos() {
        return this.AINodeSpecInfos;
    }

    public CreateDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateDBInstanceRequest setCacheStorageSize(String cacheStorageSize) {
        this.cacheStorageSize = cacheStorageSize;
        return this;
    }
    public String getCacheStorageSize() {
        return this.cacheStorageSize;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setCreateSampleData(Boolean createSampleData) {
        this.createSampleData = createSampleData;
        return this;
    }
    public Boolean getCreateSampleData() {
        return this.createSampleData;
    }

    public CreateDBInstanceRequest setDBInstanceCategory(String DBInstanceCategory) {
        this.DBInstanceCategory = DBInstanceCategory;
        return this;
    }
    public String getDBInstanceCategory() {
        return this.DBInstanceCategory;
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

    public CreateDBInstanceRequest setDBInstanceGroupCount(String DBInstanceGroupCount) {
        this.DBInstanceGroupCount = DBInstanceGroupCount;
        return this;
    }
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    public CreateDBInstanceRequest setDBInstanceMode(String DBInstanceMode) {
        this.DBInstanceMode = DBInstanceMode;
        return this;
    }
    public String getDBInstanceMode() {
        return this.DBInstanceMode;
    }

    public CreateDBInstanceRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateDBInstanceRequest setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public CreateDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
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

    public CreateDBInstanceRequest setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
        return this;
    }
    public Integer getIdleTime() {
        return this.idleTime;
    }

    public CreateDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateDBInstanceRequest setMasterAISpec(String masterAISpec) {
        this.masterAISpec = masterAISpec;
        return this;
    }
    public String getMasterAISpec() {
        return this.masterAISpec;
    }

    public CreateDBInstanceRequest setMasterCU(Integer masterCU) {
        this.masterCU = masterCU;
        return this;
    }
    public Integer getMasterCU() {
        return this.masterCU;
    }

    public CreateDBInstanceRequest setMasterNodeNum(String masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }
    public String getMasterNodeNum() {
        return this.masterNodeNum;
    }

    public CreateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
        this.segDiskPerformanceLevel = segDiskPerformanceLevel;
        return this;
    }
    public String getSegDiskPerformanceLevel() {
        return this.segDiskPerformanceLevel;
    }

    public CreateDBInstanceRequest setSegNodeNum(String segNodeNum) {
        this.segNodeNum = segNodeNum;
        return this;
    }
    public String getSegNodeNum() {
        return this.segNodeNum;
    }

    public CreateDBInstanceRequest setSegStorageType(String segStorageType) {
        this.segStorageType = segStorageType;
        return this;
    }
    public String getSegStorageType() {
        return this.segStorageType;
    }

    public CreateDBInstanceRequest setServerlessMode(String serverlessMode) {
        this.serverlessMode = serverlessMode;
        return this;
    }
    public String getServerlessMode() {
        return this.serverlessMode;
    }

    public CreateDBInstanceRequest setServerlessResource(Integer serverlessResource) {
        this.serverlessResource = serverlessResource;
        return this;
    }
    public Integer getServerlessResource() {
        return this.serverlessResource;
    }

    public CreateDBInstanceRequest setSrcDbInstanceName(String srcDbInstanceName) {
        this.srcDbInstanceName = srcDbInstanceName;
        return this;
    }
    public String getSrcDbInstanceName() {
        return this.srcDbInstanceName;
    }

    public CreateDBInstanceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CreateDBInstanceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CreateDBInstanceRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
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

    public CreateDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setVectorConfigurationStatus(String vectorConfigurationStatus) {
        this.vectorConfigurationStatus = vectorConfigurationStatus;
        return this;
    }
    public String getVectorConfigurationStatus() {
        return this.vectorConfigurationStatus;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBInstanceRequestAINodeSpecInfos extends TeaModel {
        /**
         * <p>The number of AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AINodeNum")
        public String AINodeNum;

        /**
         * <p>The specifications of the AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB.AIMedium.2</p>
         */
        @NameInMap("AINodeSpec")
        public String AINodeSpec;

        public static CreateDBInstanceRequestAINodeSpecInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestAINodeSpecInfos self = new CreateDBInstanceRequestAINodeSpecInfos();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestAINodeSpecInfos setAINodeNum(String AINodeNum) {
            this.AINodeNum = AINodeNum;
            return this;
        }
        public String getAINodeNum() {
            return this.AINodeNum;
        }

        public CreateDBInstanceRequestAINodeSpecInfos setAINodeSpec(String AINodeSpec) {
            this.AINodeSpec = AINodeSpec;
            return this;
        }
        public String getAINodeSpec() {
            return this.AINodeSpec;
        }

    }

    public static class CreateDBInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key. The following limits apply:</p>
         * <ul>
         * <li><p>The tag key cannot be empty.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length.</p>
         * </li>
         * <li><p>The tag key cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The following limits apply:</p>
         * <ul>
         * <li><p>The tag value can be empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length.</p>
         * </li>
         * <li><p>The tag value cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
