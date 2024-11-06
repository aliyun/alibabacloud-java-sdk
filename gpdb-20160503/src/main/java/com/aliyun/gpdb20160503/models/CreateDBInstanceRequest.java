// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>Backup set ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> interface to view the backup set IDs of all backup sets under the target instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>Idempotence check. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to Ensure Idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Whether to load sample datasets after the instance is created. The values are as follows:</p>
     * <ul>
     * <li><strong>true</strong>: Load sample datasets.</li>
     * <li><strong>false</strong>: Do not load sample datasets.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, it defaults to not loading sample datasets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateSampleData")
    public Boolean createSampleData;

    /**
     * <p>Instance series. The value description is as follows:</p>
     * <ul>
     * <li><strong>HighAvailability</strong>: High availability version.</li>
     * <li><strong>Basic</strong>: Basic version.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when creating an instance in the storage elastic mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>Instance type. For more details, see the supplementary description of the DBInstanceClass parameter.</p>
     * <blockquote>
     * <p>This parameter is required when creating a reserved storage mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gpdb.group.segsdx1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>Instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>Number of compute groups. The values are: 2, 4, 8, 12, 16, 24, 32, 64, 96, 128.</p>
     * <blockquote>
     * <p>This parameter is required when creating a reserved storage mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>Instance resource type. The value description is as follows:</p>
     * <ul>
     * <li><strong>StorageElastic</strong>: Storage elastic mode.</li>
     * <li><strong>Serverless</strong>: Serverless mode.</li>
     * <li><strong>Classic</strong>: Storage reserved mode.</li>
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
     * <p>Deployment mode. The values are as follows:</p>
     * <ul>
     * <li>multiple: Multi-zone deployment.</li>
     * <li>single: Single-zone deployment.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is not specified, the default value is single-zone deployment.</li>
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
     * <p>Indicates whether to enable SSL encryption. The values are as follows:</p>
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
     * <p>Key ID.</p>
     * <blockquote>
     * <p>If the value of the <strong>EncryptionType</strong> parameter is <strong>CloudDisk</strong>, you need to specify the encryption key ID within the same region through this parameter; otherwise, it should be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d2470df-da7b-4786-b981-88888888****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>Encryption type. The value description is as follows:</p>
     * <ul>
     * <li><strong>NULL</strong>: No encryption (default).</li>
     * <li><strong>CloudDisk</strong>: Enable cloud disk encryption and specify the key through the <strong>EncryptionKey</strong> parameter.</li>
     * </ul>
     * <blockquote>
     * <p>Once cloud disk encryption is enabled, it cannot be disabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>Database engine, with the value <strong>gpdb</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Engine version. The values are as follows:</p>
     * <ul>
     * <li><strong>6.0</strong>: Version 6.0.</li>
     * <li><strong>7.0</strong>: Version 7.0.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The idle release wait time. When the duration without business traffic reaches the specified time, the instance will enter the idle state. The unit is seconds, with a minimum value of 60, and the default value is 600.</p>
     * <blockquote>
     * <p>This parameter is required only for Serverless auto-scheduling mode instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("IdleTime")
    public Integer idleTime;

    /**
     * <p>Instance network type, with the value <strong>VPC</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>Only VPC networks are supported in public cloud.</li>
     * <li>If not specified, it defaults to VPC type.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>Compute node specifications.</p>
     * <p>For high-availability versions of the elastic storage mode, the values are as follows:</p>
     * <ul>
     * <li><strong>2C16G</strong></li>
     * <li><strong>4C32G</strong></li>
     * <li><strong>16C128G</strong></li>
     * </ul>
     * <p>For basic versions of the elastic storage mode, the values are as follows:</p>
     * <ul>
     * <li><strong>2C8G</strong></li>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * <li><strong>16C64G</strong></li>
     * </ul>
     * <p>For Serverless mode, the values are as follows:</p>
     * <ul>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when creating an elastic storage mode instance or a Serverless mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>Master resources, with the following values: </p>
     * <ul>
     * <li>2 CU </li>
     * <li>4 CU </li>
     * <li>8 CU </li>
     * <li>16 CU </li>
     * <li>32 CU <blockquote>
     * <p>Master resources above 8 CU will incur charges.</p>
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
     * <p>This parameter is deprecated and should not be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Billing type. The values are as follows:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: Pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: Subscription</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If not specified, it will default to pay-as-you-go.</li>
     * <li>When using the subscription billing model, there may be discounts for purchasing one year or longer at once. It is recommended to choose the billing type according to your needs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Unit of the duration for which resources are purchased. The values are as follows:</p>
     * <ul>
     * <li><strong>Month</strong>: Month</li>
     * <li><strong>Year</strong>: Year</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when creating a subscription-billed instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is deprecated and should not be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Product type. The values are as follows:</p>
     * <ul>
     * <li><strong>standard</strong>: Standard Edition.</li>
     * <li><strong>cost-effective</strong>: Cost-Effective Edition.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is Standard Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ProdType")
    public String prodType;

    /**
     * <p>Region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group where the instance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>IP whitelist.</p>
     * <p>127.0.0.1 indicates that no external IP addresses are allowed to access. You can modify the IP whitelist by calling the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> interface after the instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>ESSD cloud disk performance level. The values are as follows:</p>
     * <ul>
     * <li><strong>pl0</strong>: PL0 level.</li>
     * <li><strong>pl1</strong>: PL1 level.</li>
     * <li><strong>pl2</strong>: PL2 level.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is effective only if the disk storage type is ESSD cloud disk.</li>
     * <li>If not specified, it defaults to PL1 level.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes. The value description is as follows:</p>
     * <ul>
     * <li>For the high-availability version of the storage elastic mode, the value range is 4 to 512, and the value must be a multiple of 4.</li>
     * <li>For the basic version of the storage elastic mode, the value range is 2 to 512, and the value must be a multiple of 2.</li>
     * <li>For the Serverless mode, the value range is 2 to 512, and the value must be a multiple of 2.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when creating instances in the storage elastic mode or Serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>Disk storage type, currently only ESSD cloud disks are supported, with the value <strong>cloud_essd</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when creating an elastic storage mode instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The mode of the Serverless instance. The values are as follows:</p>
     * <ul>
     * <li><strong>Manual</strong>: Manual scheduling (default).</li>
     * <li><strong>Auto</strong>: Auto scheduling.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only for Serverless mode instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("ServerlessMode")
    public String serverlessMode;

    /**
     * <p>The threshold for computing resources. The value range is 8 to 32, with a step of 8, and the unit is ACU. The default value is 32.</p>
     * <blockquote>
     * <p>This parameter is required only for Serverless auto-scheduling mode instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ServerlessResource")
    public Integer serverlessResource;

    /**
     * <p>ID of the source instance to be cloned.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> interface to view details of all AnalyticDB for PostgreSQL instances in the target region, including the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    /**
     * <p>VSwitch ID of the standby zone.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required for multi-zone deployment.</li>
     * <li>The VSwitch ID of the standby zone must be in the same zone as the StandbyZoneId.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>ID of the standby zone.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required for multi-zone deployment.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available zone IDs.</li>
     * <li>The ID of the standby zone must be different from the ID of the primary zone.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The size of the storage space, in GB, with a value range of &lt;props=&quot;china&quot;&gt;50<del>8000&lt;props=&quot;intl&quot;&gt;50</del>6000.</p>
     * <blockquote>
     * <p>This parameter is required when creating an instance in the storage elastic mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>This parameter is deprecated and should not be passed.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The Nth tag. The value of N ranges from 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>Duration for which resources are purchased. The values are as follows:</p>
     * <ul>
     * <li>When <strong>Period</strong> is <strong>Month</strong>, the value ranges from 1 to 9.</li>
     * <li>When <strong>Period</strong> is <strong>Year</strong>, the value ranges from 1 to 3.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when creating a subscription-billed instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>VPC ID.</p>
     * <blockquote>
     * <ul>
     * <li><strong>VPCId</strong> is required.</li>
     * <li>The region of the <strong>VPC</strong> must be consistent with <strong>RegionId</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp19ame5m1r3oejns****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>vSwitch ID.</p>
     * <blockquote>
     * <ul>
     * <li><strong>vSwitchId</strong> is required.</li>
     * <li>The availability zone of the <strong>vSwitch</strong> must be consistent with <strong>ZoneId</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Whether to enable vector engine optimization. The value description is as follows:</p>
     * <ul>
     * <li><strong>enabled</strong>: Enable vector engine optimization.</li>
     * <li><strong>disabled</strong> (default): Do not enable vector engine optimization.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For mainstream analysis scenarios, data warehouse scenarios, and real-time data warehouse scenarios, it is recommended to <strong>not enable</strong> vector engine optimization.</li>
     * <li>For users using the vector analysis engine for AIGC, vector retrieval, and other scenarios, it is recommended to <strong>enable</strong> vector engine optimization.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    /**
     * <p>Zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available zone IDs.</p>
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

    public CreateDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
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

    public static class CreateDBInstanceRequestTag extends TeaModel {
        /**
         * <p>Tag key. The restrictions are as follows:</p>
         * <ul>
         * <li>It cannot be an empty string.</li>
         * <li>It supports up to 128 characters.</li>
         * <li>It cannot start with <code>aliyun</code> or <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value. The restrictions are as follows:</p>
         * <ul>
         * <li>It can be an empty string.</li>
         * <li>It supports up to 128 characters.</li>
         * <li>It cannot start with <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</li>
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
