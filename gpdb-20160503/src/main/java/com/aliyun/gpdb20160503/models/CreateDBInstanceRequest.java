// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. For more information, see [Ensure idempotence](~~327176~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to load a sample dataset after the instance is created. Valid values:</p>
     * <br>
     * <p>- **true**</p>
     * <p>- **false**</p>
     * <br>
     * <p>If you do not specify this parameter, no sample dataset is loaded.</p>
     */
    @NameInMap("CreateSampleData")
    public Boolean createSampleData;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>- **HighAvailability**: High-availability Edition.</p>
     * <p>- **Basic**: Basic Edition.</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in elastic storage mode.</p>
     */
    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>The instance type of the instance. For information, see [Instance types](~~86942~~).</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in reserved storage mode.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The description of the instance.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The number of compute groups. Valid values: 2, 4, 8, 12, 16, 24, 32, 64, 96, and 128.</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in reserved storage mode.</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The resource type of the instance. Valid values:</p>
     * <br>
     * <p>- **StorageElastic**: elastic storage mode.</p>
     * <p>- **Serverless**: Serverless mode.</p>
     * <p>- **Classic**: reserved storage mode.</p>
     * <br>
     * <p>> This parameter must be specified.</p>
     */
    @NameInMap("DBInstanceMode")
    public String DBInstanceMode;

    /**
     * <p>The ID of the encryption key.</p>
     * <br>
     * <p>> If EncryptionType is set to CloudDisk, you must specify an encryption key that resides in the same region as the cloud disk that is specified by EncryptionType. Otherwise, leave this parameter empty.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Valid values:</p>
     * <br>
     * <p>- **NULL** (default): Encryption is disabled.</p>
     * <p>- **CloudDisk**: Encryption is enabled on cloud disks, and EncryptionKey is used to specify an encryption key.</p>
     * <br>
     * <p>> Disk encryption cannot be disabled after it is enabled.</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>The database engine of the instance. Set the value to gpdb.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <br>
     * <p>- 6.0</p>
     * <p>- 7.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The wait time for the instance that has no traffic to become idle. Minimum value: 60. Default value: 600. Unit: seconds.</p>
     * <br>
     * <p>> This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
     */
    @NameInMap("IdleTime")
    public Integer idleTime;

    /**
     * <p>The network type of the instance. Set the value to VPC.</p>
     * <br>
     * <p>> </p>
     * <p>- Only the Virtual Private Cloud (VPC) type is supported.</p>
     * <p>- If you do not specify this parameter, VPC is used.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The specifications of compute nodes.</p>
     * <br>
     * <p>Valid values for High-availability Edition instances in elastic storage mode:</p>
     * <br>
     * <p>- **2C16G**</p>
     * <p>- **4C32G**</p>
     * <p>- **16C128G**</p>
     * <br>
     * <p>Valid values for Basic Edition instances in elastic storage mode:</p>
     * <br>
     * <p>- **2C8G**</p>
     * <p>- **4C16G**</p>
     * <p>- **8C32G**</p>
     * <p>- **16C64G**</p>
     * <br>
     * <p>Valid values for instances in Serverless mode:</p>
     * <br>
     * <p>- **4C16G**</p>
     * <p>- **8C32G**</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("MasterCU")
    public Integer masterCU;

    /**
     * <p>The number of coordinator nodes. Valid values: 1 and 2.</p>
     * <br>
     * <p>> If you do not specify this parameter, 1 is used.</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you do not specify this parameter, Postpaid is used.</p>
     * <br>
     * <p>*   You can obtain more cost savings if you create a subscription instance for one year or longer. We recommend that you select the billing method that best suits your needs.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <br>
     * <p>- **Month**</p>
     * <p>- **Year**</p>
     * <p>> This parameter must be specified when PayType is set to Prepaid.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The private IP address of the instance.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist of the instance.</p>
     * <br>
     * <p>A value of 127.0.0.1 specifies that no IP address is allowed for external access. You can call the [ModifySecurityIps](~~86928~~) operation to modify the IP address whitelist after you create an instance.</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The performance level of ESSDs. Valid values:</p>
     * <br>
     * <p>*   **pl0**</p>
     * <p>*   **pl1**</p>
     * <p>*   **pl2**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only when SegStorageType is set to cloud_essd.</p>
     * <br>
     * <p>*   If you do not specify this parameter, pl1 is used.</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes.</p>
     * <br>
     * <p>- Valid values for High-availability Edition instances in elastic storage mode: multiples of 4 in the range of 4 to 512.</p>
     * <p>- Valid values for Basic Edition instances in elastic storage mode: multiples of 2 in the range of 2 to 512.</p>
     * <p>- Valid values for instances in Serverless mode: multiples of 2 in the range of 2 to 512.</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in elastic storage mode or Serverless mode.</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The disk storage type of the instance. Only enhanced SSDs (ESSDs) are supported. Set the value to cloud_essd.</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in elastic storage mode.</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The type of the Serverless mode. Valid values:</p>
     * <br>
     * <p>- **Manual** (default): manual scheduling.</p>
     * <p>- **Auto**: automatic scheduling.</p>
     * <br>
     * <p>> This parameter must be specified only when you create an instance in Serverless mode.</p>
     */
    @NameInMap("ServerlessMode")
    public String serverlessMode;

    /**
     * <p>The threshold of computing resources. Unit: AnalyticDB compute unit (ACU). Valid values: 8 to 32. The value must be in increments of 8 ACUs. Default value: 32.</p>
     * <br>
     * <p>> This parameter must be specified only when you create an instance in automatic Serverless mode.</p>
     */
    @NameInMap("ServerlessResource")
    public Integer serverlessResource;

    @NameInMap("SrcDbInstanceName")
    public String srcDbInstanceName;

    /**
     * <p>The storage capacity of the instance. Unit: GB. Valid values: 50 to 4000.</p>
     * <br>
     * <p>> This parameter must be specified when you create an instance in elastic storage mode.</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>This parameter is no longer used.</p>
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
     * <br>
     * <p>- Valid values when Period is set to Month: 1 to 9.</p>
     * <p>- Valid values when Period is set to Year: 1 to 3.</p>
     * <p>> This parameter must be specified when PayType is set to Prepaid.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID of the instance.</p>
     * <br>
     * <p>> </p>
     * <p>- This parameter must be specified.</p>
     * <p>- The region where the VPC resides must be the same as the region that is specified by RegionId.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * <br>
     * <p>> </p>
     * <p>- This parameter must be specified.</p>
     * <p>- The zone where the vSwitch resides must be the same as the zone that is specified by ZoneId.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
     * <br>
     * <p>- **enabled**</p>
     * <p>- **disabled** (default)</p>
     * <br>
     * <p>> </p>
     * <p>- We recommend that you do not enable vector engine optimization in mainstream analysis and real-time data warehousing scenarios.</p>
     * <p>- We recommend that you enable vector engine optimization in AI Generated Content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    /**
     * <p>The zone ID of the read-only instance. You can call the [DescribeRegions](~~86912~~) operation to query the most recent zone list.</p>
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
         * <br>
         * <p>- The tag key cannot be an empty string.</p>
         * <p>- The tag key can be up to 128 characters in length.</p>
         * <p>- The tag key cannot start with `aliyun` or `acs:`, and contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Take note of the following requirements:</p>
         * <br>
         * <p>- The tag key cannot be an empty string.</p>
         * <p>- The tag key can be up to 128 characters in length.</p>
         * <p>- The tag key cannot start with `aliyun` or `acs:`, and contain `http://` or `https://`.</p>
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
