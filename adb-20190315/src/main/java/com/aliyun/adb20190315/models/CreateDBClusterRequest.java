// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("BackupSetID")
    public String backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The value is case-sensitive and can contain a maximum of 64 ASCII characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The computing resources of the cluster. This parameter is required if the Mode parameter is set to **Flexible**.</p>
     * <br>
     * <p>>  You can call the [DescribeAvailableResource](~~190632~~) operation to query the computing resources that are available within a specific region.</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Cluster**: reserved mode for Cluster Edition</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   **MixedStorage**: elastic mode for Cluster Edition</p>
     * <br>
     * <p>>  If the DBClusterCategory parameter is set to Cluster, you must set the Mode parameter to Reserver. If the DBClusterCategory parameter is set to MixedStorage, you must set the Mode parameter to Flexible. Otherwise, the cluster fails to be created.</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The specification of the cluster. Valid values:</p>
     * <br>
     * <p>*   **C8**</p>
     * <p>*   **C32**</p>
     * <br>
     * <p>>  This parameter is required if the Mode parameter is set to Reserver.</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The description of the cluster.</p>
     * <br>
     * <p>*   The description cannot start with `http://` or `https`.</p>
     * <p>*   The description must be 2 to 256 characters in length.</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type of the cluster. Set the value to **VPC**.</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The version of the cluster. Set the value to **3.0**.</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The number of node groups. Valid values: 1 to 200 (integer).</p>
     * <br>
     * <p>>  This parameter is required if the Mode parameter is set to Reserver.</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity of the cluster. Unit: GB.</p>
     * <br>
     * <p>*   Valid values when DBClusterClass is set to C8: 100 to 1000</p>
     * <p>*   Valid values when DBClusterClass is set to C32: 100 to 8000</p>
     * <br>
     * <p>> * This parameter is required if the Mode parameter is set to Reserver.</p>
     * <p>> * 1000 The storage capacity less than 1,000 GB increases in 100 GB increments. The storage capacity greater than 1,000 GB increases in 1,000 GB increments.</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("DiskEncryption")
    public String diskEncryption;

    /**
     * <p>The number of elastic I/O units (EIUs). For more information, see [Use EIUs to scale up storage resources](~~189505~~).</p>
     */
    @NameInMap("ElasticIOResource")
    public String elasticIOResource;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("ExecutorCount")
    public String executorCount;

    /**
     * <p>The Key Management Service (KMS) ID that is used for disk encryption. This parameter is valid only when DiskEncryption is set to true.</p>
     */
    @NameInMap("KmsId")
    public String kmsId;

    /**
     * <p>The mode of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Reserver**: the reserved mode.</p>
     * <p>*   **Flexible**: the elastic mode.</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <br>
     * <p>*   **Year**: subscription on a yearly basis</p>
     * <p>*   **Month**: subscription on a monthly basis</p>
     * <br>
     * <p>>  This parameter is required if the PayType parameter is set to Prepaid.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    /**
     * <p>A reserved parameter.</p>
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
     * <br>
     * <p>*   Valid values when Period is set to Year: 1, 2, 3, and 5 (integer)</p>
     * <p>*   Valid values when Period is set to Month: 1 to 11 (integer)</p>
     * <br>
     * <p>> * This parameter is required if the PayType parameter is set to Prepaid.</p>
     * <p>> * Longer subscription periods offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the cluster.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent zone list.</p>
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

    public CreateDBClusterRequest setDiskEncryption(String diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }
    public String getDiskEncryption() {
        return this.diskEncryption;
    }

    public CreateDBClusterRequest setElasticIOResource(String elasticIOResource) {
        this.elasticIOResource = elasticIOResource;
        return this;
    }
    public String getElasticIOResource() {
        return this.elasticIOResource;
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
         * <p>The key of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of `Tag.N.Key` is paired with a value of `Tag.N.Value`.</p>
         * <br>
         * <p>>  The tag key can be up to 64 characters in length and cannot start with `aliyun`, `acs:`, `http://`, or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of `Tag.N.Key` is paired with a value of `Tag.N.Value`.</p>
         * <br>
         * <p>>  The tag value can be up to 64 characters in length and cannot start with `aliyun`, `acs:`, `http://`, or `https://`.</p>
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
