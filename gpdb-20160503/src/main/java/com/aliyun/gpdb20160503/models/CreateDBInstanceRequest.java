// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the IDs of all backup sets in the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to load a sample dataset after the instance is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, no sample dataset is loaded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateSampleData")
    public Boolean createSampleData;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <ul>
     * <li><strong>HighAvailability</strong>: High-availability Edition.</li>
     * <li><strong>Basic</strong>: Basic Edition.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when you create an instance in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>The instance type of the instance. For information, see <a href="https://help.aliyun.com/document_detail/86942.html">Instance types</a>.</p>
     * <blockquote>
     * <p>This parameter must be specified when you create an instance in reserved storage mode.</p>
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
     * <p>This parameter must be specified when you create an instance in reserved storage mode.</p>
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
     * <li><strong>StorageElastic</strong>: elastic storage mode.</li>
     * <li><strong>Serverless</strong>: Serverless mode.</li>
     * <li><strong>Classic</strong>: reserved storage mode.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StorageElastic</p>
     */
    @NameInMap("DBInstanceMode")
    public String DBInstanceMode;

    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>The ID of the encryption key.</p>
     * <blockquote>
     * <p>If EncryptionType is set to CloudDisk, you must specify an encryption key that resides in the same region as the cloud disk that is specified by EncryptionType. Otherwise, leave this parameter empty.</p>
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
     * <li><strong>NULL</strong> (default): Encryption is disabled.</li>
     * <li><strong>CloudDisk</strong>: Encryption is enabled on cloud disks, and EncryptionKey is used to specify an encryption key.</li>
     * </ul>
     * <blockquote>
     * <p>Disk encryption cannot be disabled after it is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>The database engine of the instance. Set the value to gpdb.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <ul>
     * <li>6.0</li>
     * <li>7.0</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The wait time for the instance that has no traffic to become idle. Minimum value: 60. Default value: 600. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
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
     * </blockquote>
     * <ul>
     * <li><p>Only the Virtual Private Cloud (VPC) type is supported in Alibaba Cloud public cloud.</p>
     * </li>
     * <li><p>If you do not specify this parameter, VPC is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The specifications of compute nodes.</p>
     * <p>Valid values for High-availability Edition instances in elastic storage mode:</p>
     * <ul>
     * <li><strong>2C16G</strong></li>
     * <li><strong>4C32G</strong></li>
     * <li><strong>16C128G</strong></li>
     * </ul>
     * <p>Valid values for Basic Edition instances in elastic storage mode:</p>
     * <ul>
     * <li><strong>2C8G</strong></li>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * <li><strong>16C64G</strong></li>
     * </ul>
     * <p>Valid values for instances in Serverless mode:</p>
     * <ul>
     * <li><strong>4C16G</strong></li>
     * <li><strong>8C32G</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The amount of coordinator node resources. Valid values:</p>
     * <ul>
     * <li>2 CU</li>
     * <li>4 CU</li>
     * <li>8 CU</li>
     * <li>16 CU</li>
     * <li>32 CU</li>
     * </ul>
     * <blockquote>
     * <p> You are charged for coordinator node resources of more than 8 CUs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8 CU</p>
     */
    @NameInMap("MasterCU")
    public Integer masterCU;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you do not specify this parameter, Postpaid is used.</p>
     * </li>
     * <li><p>You can obtain more cost savings if you create a subscription instance for one year or longer. We recommend that you select the billing method that best suits your needs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong></li>
     * <li><strong>Year</strong><blockquote>
     * <p>This parameter must be specified when PayType is set to Prepaid.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.*</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ProdType")
    public String prodType;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist of the instance.</p>
     * <p>A value of 127.0.0.1 denies access from any external IP address. You can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist after you create an instance.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The performance level of ESSDs. Valid values:</p>
     * <ul>
     * <li><strong>pl0</strong></li>
     * <li><strong>pl1</strong></li>
     * <li><strong>pl2</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when SegStorageType is set to cloud_essd.</p>
     * </li>
     * <li><p>If you do not specify this parameter, pl1 is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes.</p>
     * <ul>
     * <li>Valid values for High-availability Edition instances in elastic storage mode: multiples of 4 in the range of 4 to 512.</li>
     * <li>Valid values for Basic Edition instances in elastic storage mode: multiples of 2 in the range of 2 to 512.</li>
     * <li>Valid values for instances in Serverless mode: multiples of 2 in the range of 2 to 512.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The disk storage type of the instance. Only enhanced SSDs (ESSDs) are supported. Set the value to cloud_essd.</p>
     * <blockquote>
     * <p>This parameter must be specified when you create an instance in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The type of the Serverless mode. Valid values:</p>
     * <ul>
     * <li><strong>Manual</strong> (default): manual scheduling.</li>
     * <li><strong>Auto</strong>: automatic scheduling.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified only when you create an instance in Serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("ServerlessMode")
    public String serverlessMode;

    /**
     * <p>The threshold of computing resources. Unit: AnalyticDB compute unit (ACU). Valid values: 8 to 32. The value must be in increments of 8 ACUs. Default value: 32.</p>
     * <blockquote>
     * <p>This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ServerlessResource")
    public Integer serverlessResource;

    /**
     * <p>The ID of the source instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    /**
     * <p>The storage capacity of the instance. Unit: GB. Valid values: 50 to 6000.</p>
     * <blockquote>
     * <p> This parameter must be specified when you create an instance in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li>Valid values when Period is set to Month: 1 to 9.</li>
     * <li>Valid values when Period is set to Year: 1 to 3.<blockquote>
     * <p>This parameter must be specified when PayType is set to Prepaid.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID of the instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><strong>This parameter</strong> must be specified.</p>
     * </li>
     * <li><p>The region where the <strong>VPC</strong> resides must be the same as the region that is specified by <strong>RegionId</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><strong>This parameter</strong> must be specified.</p>
     * </li>
     * <li><p>The zone where the <strong>vSwitch</strong> resides must be the same as the zone that is specified by <strong>ZoneId</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp*******************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to enable vector search engine optimization. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong></li>
     * <li><strong>disabled</strong> (default)</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>We recommend that you <strong>do not enable</strong> vector search engine optimization in mainstream analysis, data warehousing, and real-time data warehousing scenarios.</p>
     * </li>
     * <li><p>We recommend that you <strong>enable</strong> vector search engine optimization in AI-generated content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    /**
     * <p>The zone ID of the read-only instance. You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent zone list.</p>
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
         * <p>The key of tag N. Take note of the following requirements:</p>
         * <ul>
         * <li>The tag key cannot be an empty string.</li>
         * <li>The tag key can be up to 128 characters in length.</li>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Take note of the following requirements:</p>
         * <ul>
         * <li>The tag key cannot be an empty string.</li>
         * <li>The tag key can be up to 128 characters in length.</li>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and contain <code>http://</code> or <code>https://</code>.</li>
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
