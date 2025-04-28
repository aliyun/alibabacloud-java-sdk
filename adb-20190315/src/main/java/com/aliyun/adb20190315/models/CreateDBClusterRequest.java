// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("BackupSetID")
    public String backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The value is case-sensitive and can contain a maximum of 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-t7241****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The computing resources of the cluster. You can use computing resources to compute data. The increase in the computing resources can accelerate data queries. The computing resources are available for Cluster Edition and Basic Edition.</p>
     * <ul>
     * <li>Computing resources for Cluster Edition include 16 cores and 64 GB memory, 24 cores and 96 GB memory, and 32 cores or more. Cluster Edition supports resource isolation, scheduled scaling, and tiered storage of hot and cold data.</li>
     * <li>Computing resources for Basic Edition include 8 cores and 32 GB memory and 16 cores and 64 GB memory. Alibaba Cloud does not provide an SLA guarantee for Basic Edition, and 4 to 8 hours are required for a failover. We recommend that you do not use Basic Edition in production environments.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/190632.html">DescribeAvailableResource</a> operation to query the available computing resources in a region.</p>
     * </li>
     * <li><p>This parameter must be specified when Mode is set to <strong>Flexible</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>32Core128GB</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Cluster</strong>: reserved mode for Cluster Edition</li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li><strong>MixedStorage</strong>: elastic mode for Cluster Edition</li>
     * </ul>
     * <blockquote>
     * <p> If the DBClusterCategory parameter is set to Cluster, you must set the Mode parameter to Reserver. If the DBClusterCategory parameter is set to MixedStorage, you must set the Mode parameter to Flexible. Otherwise, the cluster fails to be created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The specification of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>C8</strong></li>
     * <li><strong>C32</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the Mode parameter is set to Reserver.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C8</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The description of the cluster.</p>
     * <ul>
     * <li>The description cannot start with <code>http://</code> or <code>https</code>.</li>
     * <li>The description must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type of the cluster. Set the value to <strong>VPC</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The version of the cluster. Set the value to <strong>3.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The number of node groups. Valid values: 1 to 200 (integer).</p>
     * <blockquote>
     * <p> This parameter is required if the Mode parameter is set to Reserver.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity of the cluster. Unit: GB.</p>
     * <ul>
     * <li>Valid values when DBClusterClass is set to C8: 100 to 1000</li>
     * <li>Valid values when DBClusterClass is set to C32: 100 to 8000</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if the Mode parameter is set to Reserver.</li>
     * <li>1000 The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>Indicates whether disk encryption is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DiskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>The number of elastic I/O units (EIUs). For more information, see <a href="https://help.aliyun.com/document_detail/189505.html">Elasticity of the storage layer</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ElasticIOResource")
    public String elasticIOResource;

    /**
     * <p>Specifies whether to enable SSL encryption. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("ExecutorCount")
    public String executorCount;

    /**
     * <p>The Key Management Service (KMS) ID that is used for disk encryption. This parameter takes effect only when DiskEncryption is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxx-xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("KmsId")
    public String kmsId;

    /**
     * <p>The mode of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Reserver</strong>: the reserved mode.</li>
     * <li><strong>Flexible</strong>: the elastic mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Reserver</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis</li>
     * <li><strong>Month</strong>: subscription on a monthly basis</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the PayType parameter is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags to add to the cluster.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBClusterRequestTag> tag;

    /**
     * <p>The subscription period of the subscription cluster.</p>
     * <ul>
     * <li>Valid values when Period is set to Year: 1, 2, and 3 (integer)</li>
     * <li>Valid values when Period is set to Month: 1 to 9 (integer)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if the PayType parameter is set to Prepaid.</li>
     * <li>Longer subscription periods offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1at5ze0t5u3xtqn****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1aadw9k19x6cis9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterRequest self = new CreateDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterRequest setBackupSetID(String backupSetID) {
        this.backupSetID = backupSetID;
        return this;
    }
    public String getBackupSetID() {
        return this.backupSetID;
    }

    public CreateDBClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public CreateDBClusterRequest setDBClusterCategory(String DBClusterCategory) {
        this.DBClusterCategory = DBClusterCategory;
        return this;
    }
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    public CreateDBClusterRequest setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public CreateDBClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateDBClusterRequest setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public CreateDBClusterRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public CreateDBClusterRequest setDBNodeGroupCount(String DBNodeGroupCount) {
        this.DBNodeGroupCount = DBNodeGroupCount;
        return this;
    }
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    public CreateDBClusterRequest setDBNodeStorage(String DBNodeStorage) {
        this.DBNodeStorage = DBNodeStorage;
        return this;
    }
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    public CreateDBClusterRequest setDiskEncryption(Boolean diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    public CreateDBClusterRequest setElasticIOResource(String elasticIOResource) {
        this.elasticIOResource = elasticIOResource;
        return this;
    }
    public String getElasticIOResource() {
        return this.elasticIOResource;
    }

    public CreateDBClusterRequest setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public CreateDBClusterRequest setExecutorCount(String executorCount) {
        this.executorCount = executorCount;
        return this;
    }
    public String getExecutorCount() {
        return this.executorCount;
    }

    public CreateDBClusterRequest setKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }
    public String getKmsId() {
        return this.kmsId;
    }

    public CreateDBClusterRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDBClusterRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDBClusterRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public CreateDBClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
    }

    public CreateDBClusterRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBClusterRequest setTag(java.util.List<CreateDBClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBClusterRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBClusterRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBClusterRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p> The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p> The tag value can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBClusterRequestTag self = new CreateDBClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
