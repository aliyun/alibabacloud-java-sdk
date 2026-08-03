// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The AI node specifications information.</p>
     */
    @NameInMap("AINodeSpecInfos")
    public java.util.List<CreateDBInstanceRequestAINodeSpecInfos> AINodeSpecInfos;

    /**
     * <p>The backup set ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the backup set IDs of all backup sets for the target instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The Serverless cache storage size. Valid values: 800 to 102400. The step size is 32 GB. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CacheStorageSize")
    public String cacheStorageSize;

    /**
     * <p>The client token used for idempotence checks. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to load a sample dataset after the instance is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Load a sample dataset.</li>
     * <li><strong>false</strong>: Do not load a sample dataset.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value is false.</p>
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
     * <li><strong>HighAvailability</strong>: high-availability edition.</li>
     * <li><strong>Basic</strong>: basic edition.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a storage elastic mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>The instance specifications. For more information, see the supplementary description of the DBInstanceClass parameter.</p>
     * <blockquote>
     * <p>This parameter is required when you create a storage reservation mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gpdb.group.segsdx1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The number of compute groups. Valid values: 2, 4, 8, 12, 16, 24, 32, 64, 96, and 128.</p>
     * <blockquote>
     * <p>This parameter is required when you create a storage reservation mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The resource type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>StorageElastic</strong>: storage elastic mode.</li>
     * <li><strong>Serverless</strong>: Serverless mode.</li>
     * <li><strong>ServerlessPro</strong>: Serverless Pro mode.</li>
     * <li><strong>Classic</strong>: storage reservation mode.</li>
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
     * <li>multiple: multi-zone deployment.</li>
     * <li>single: single-zone deployment.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the default value is single-zone deployment.</li>
     * <li>Currently, only single-zone deployment is supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>Indicates whether to enable Secure Sockets Layer (SSL) encryption. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable SSL encryption.</li>
     * <li><strong>false</strong> (default): Do not enable SSL encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>The encryption key ID.</p>
     * <blockquote>
     * <p>If the <strong>EncryptionType</strong> parameter is set to <strong>CloudDisk</strong>, specify the encryption key ID in the same region. Otherwise, leave this parameter empty.</p>
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
     * <li><strong>NULL</strong>: Encryption is not enabled. This is the default value.</li>
     * <li><strong>CloudDisk</strong>: Cloud disk encryption is enabled. Use the <strong>EncryptionKey</strong> parameter to specify the encryption key.</li>
     * </ul>
     * <blockquote>
     * <p>Cloud disk encryption cannot be disabled after it is enabled.</p>
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
     * <li><strong>6.0</strong>: version 6.0.</li>
     * <li><strong>7.0</strong>: version 7.0.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The idle release wait time. The instance transitions to an idle state after no service traffic is detected for the specified duration. Unit: seconds. Minimum value: 60. Default value: 600.</p>
     * <blockquote>
     * <p>This parameter is required only for Serverless instances in automatic scheduling mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("IdleTime")
    public Integer idleTime;

    /**
     * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>Only VPC is supported on the public cloud.</li>
     * <li>If you do not specify this parameter, the default value is VPC.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The node specifications of compute nodes.</p>
     * <p>Valid values for storage elastic mode (high-availability edition):</p>
     * <ul>
     * <li><strong>2C16G</strong></li>
     * <li><strong>4C32G</strong></li>
     * <li><strong>16C128G</strong></li>
     * </ul>
     * <p>Valid values for storage elastic mode (basic edition):</p>
     * <ul>
     * <li><strong>2C8G</strong></li>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * <li><strong>16C64G</strong></li>
     * </ul>
     * <p>Valid values for Serverless mode:</p>
     * <ul>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a storage elastic mode instance or a Serverless mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>Specify this parameter if you want to change the master node to a MasterAI node.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter and MasterCU cannot be specified at the same time.</li>
     * <li>Only specific regions and zones support changing the master node to a MasterAI node.</li>
     * <li>Only basic edition instances of AnalyticDB for PostgreSQL 7.0 support MasterAI nodes.</li>
     * <li>You can view all valid values of this parameter on the specification change page for the master node.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ADB.AIMedium.2</p>
     */
    @NameInMap("MasterAISpec")
    public String masterAISpec;

    /**
     * <p>The master resources. Valid values: </p>
     * <ul>
     * <li>2 CU </li>
     * <li>4 CU </li>
     * <li>8 CU </li>
     * <li>16 CU </li>
     * <li>32 CU <blockquote>
     * <p>Master resources above 8 CU incur additional fees.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8 CU</p>
     */
    @NameInMap("MasterCU")
    public Integer masterCU;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the default value is pay-as-you-go.</li>
     * <li>Discounts are available for subscription instances when you purchase them for one year or longer. Select a billing method based on your business requirements.</li>
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
     * <li><strong>Month</strong>: month.</li>
     * <li><strong>Year</strong>: year.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: Standard Edition.</li>
     * <li><strong>cost-effective</strong>: Economy Edition.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value is Standard Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ProdType")
    public String prodType;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist.</p>
     * <p>A value of 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. After the instance is created, you can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>pl0</strong>: PL0.</li>
     * <li><strong>pl1</strong>: PL1.</li>
     * <li><strong>pl2</strong>: PL2.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when the cloud disk storage type is ESSD cloud disk.</li>
     * <li>If you do not specify this parameter, the default value is PL1.</li>
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
     * <li>Storage elastic mode (high-availability edition): 4 to 512. The value must be a multiple of 4.</li>
     * <li>Storage elastic mode (basic edition): 2 to 512. The value must be a multiple of 2.</li>
     * <li>Serverless mode: 2 to 512. The value must be a multiple of 2.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a storage elastic mode instance or a Serverless mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The cloud disk storage type. Currently, only ESSD cloud disks are supported. Set the value to <strong>cloud_essd</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when you create a storage elastic mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The mode of the Serverless instance. Valid values:</p>
     * <ul>
     * <li><strong>Manual</strong>: manual scheduling. This is the default value.</li>
     * <li><strong>Auto</strong>: automatic scheduling.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only for Serverless mode instances.</li>
     * <li>The automatic scheduling mode for AnalyticDB for PostgreSQL Serverless is in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?product=rds">submit a ticket</a> to apply for access.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("ServerlessMode")
    public String serverlessMode;

    /**
     * <p>The compute resource threshold. Valid values: 16 to 1024. The step size is 8. Unit: ACU.</p>
     * <blockquote>
     * <p>This parameter is required only for Serverless instances in automatic scheduling mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("ServerlessResource")
    public Integer serverlessResource;

    /**
     * <p>The ID of the source instance to clone.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the target region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    /**
     * <p>The vSwitch ID in the secondary zone.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only for multi-zone deployment.</li>
     * <li>The vSwitch must be in the same zone as the value specified by StandbyZoneId.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The secondary zone ID.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only for multi-zone deployment.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</li>
     * <li>The secondary zone ID must be different from the primary zone ID.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The storage capacity. Unit: GB. Valid values: &lt;props=&quot;china&quot;&gt;50 to 8000&lt;props=&quot;intl&quot;&gt;50 to 6000.</p>
     * <blockquote>
     * <p>This parameter is required when you create a storage elastic mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The Nth tag. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, valid values are 1 to 9.</li>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, valid values are 1 to 3.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
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
     * <li><strong>VPCId</strong> is required.</li>
     * <li>The VPC must be in the same region as the value specified by <strong>RegionId</strong>.</li>
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
     * <li><strong>vSwitchId</strong> is required.</li>
     * <li>The vSwitch must be in the same zone as the value specified by <strong>ZoneId</strong>.</li>
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
     * <li><strong>enabled</strong>: Enable vector engine optimization.</li>
     * <li><strong>disabled</strong> (default): Do not enable vector engine optimization.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For mainstream analytics, data warehousing, and real-time data warehouse scenarios, <strong>do not enable</strong> vector engine optimization.</li>
     * <li>For scenarios that use the vector analysis engine for AIGC and AISearch, <strong>enable</strong> vector engine optimization.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</p>
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
         * <p>The AI node specifications.</p>
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
         * <li>The tag key cannot be an empty string.</li>
         * <li>The tag key can be up to 128 characters in length.</li>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
         * <li>The tag value can be an empty string.</li>
         * <li>The tag value can be up to 128 characters in length.</li>
         * <li>The tag value cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
