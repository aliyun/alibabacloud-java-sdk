// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <blockquote>
     * <p> This parameter is valid only if the value of PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/360339.html">DescribeBackups</a> operation to query the backup sets.</p>
     * <blockquote>
     * <p> If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b-12af23adsf</p>
     */
    @NameInMap("BackupSetID")
    public String backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The value is a string and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: Single-replica Edition</li>
     * <li><strong>HighAvailability</strong>: Double-replica Edition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The specifications of the cluster.</p>
     * <ul>
     * <li><p>Valid values for a Single-replica Edition cluster:</p>
     * <ul>
     * <li><strong>S8</strong>: 8 cores and 32 GB of memory</li>
     * <li><strong>S16</strong>: 16 cores and 64 GB of memory</li>
     * <li><strong>S32</strong>: 32 cores and 128 GB of memory</li>
     * <li><strong>S64</strong>: 64 cores and 256 GB of memory</li>
     * <li><strong>S104</strong>: 104 cores and 384 GB of memory</li>
     * </ul>
     * </li>
     * <li><p>Valid values for a Double-replica Edition cluster:</p>
     * <ul>
     * <li><strong>C8</strong>: 8 cores and 32 GB of memory</li>
     * <li><strong>C16</strong>: 16 cores and 64 GB of memory</li>
     * <li><strong>C32</strong>: 32 cores and 128 GB of memory</li>
     * <li><strong>C64</strong>: 64 cores and 256 GB of memory</li>
     * <li><strong>C104</strong>: 104 cores and 384 GB of memory</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S8</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type of the cluster. Only Virtual Private Cloud (VPC) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The kernel version. Valid values:</p>
     * <ul>
     * <li><strong>21.8.10.19</strong></li>
     * <li><strong>22.8.5.29</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21.8.10.19</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The number of nodes.</p>
     * <ul>
     * <li>Valid values when the cluster is of Single-replica Edition: 1 to 48.</li>
     * <li>Valid values when the cluster is of Double-replica Edition: 1 to 24.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity of a single node. Valid values: 100 to 32000. Unit: GB.</p>
     * <blockquote>
     * <p> This value is a multiple of 100.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The storage type of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>CloudESSD</strong>: The cluster uses an enhanced SSD (ESSD) of performance level 1 (PL1).</li>
     * <li><strong>CloudESSD_PL2</strong>: The cluster uses an ESSD of PL2.</li>
     * <li><strong>CloudESSD_PL3</strong>: The cluster uses an ESSD of PL3.</li>
     * <li><strong>CloudEfficiency</strong>: The cluster uses an ultra disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudESSD_PL2</p>
     */
    @NameInMap("DbNodeStorageType")
    public String dbNodeStorageType;

    /**
     * <p>You must specify this parameter when EncryptionType is set to CloudDisk.</p>
     * <p>The ID of the key that is used to encrypt data on disks. You can obtain the ID of the key from the Key Management Service (KMS) console. You can also create a key.</p>
     * <blockquote>
     * <p> If EncryptionType is empty, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d2470df-da7b-4786-b981-9a164dae****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Set the value to <strong>CloudDisk</strong>, which indicates that only disk encryption is supported.</p>
     * <blockquote>
     * <p> If this parameter is not specified, data is not encrypted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: The cluster uses the pay-as-you-go billing method.</li>
     * <li><strong>Prepaid</strong>: The cluster uses the subscription billing method.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration for the cluster. Valid values:</p>
     * <blockquote>
     * <p> This parameter is required only when PayType is set to Prepaid.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The ID of the source cluster. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query backup set IDs.</p>
     * <blockquote>
     * <p> If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1lxbo89u950****</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    @NameInMap("Tags")
    public java.util.List<CreateDBInstanceRequestTags> tags;

    /**
     * <p>The subscription duration of the subscription cluster.</p>
     * <blockquote>
     * <p> This parameter is required only when PayType is set to Prepaid.</p>
     * </blockquote>
     * <ul>
     * <li>Valid values when Period is set to Year: 1 to 3 (integer)</li>
     * <li>Valid values when Period is set to Month: 1 to 9 (integer)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch in the secondary zone for the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchBak")
    public String vSwitchBak;

    /**
     * <p>The vSwitch in secondary zone 2 for the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchBak2")
    public String vSwitchBak2;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The secondary zone 2 of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZondIdBak2")
    public String zondIdBak2;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
     */
    @NameInMap("ZoneIdBak")
    public String zoneIdBak;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setBackupSetID(String backupSetID) {
        this.backupSetID = backupSetID;
        return this;
    }
    public String getBackupSetID() {
        return this.backupSetID;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setDBClusterCategory(String DBClusterCategory) {
        this.DBClusterCategory = DBClusterCategory;
        return this;
    }
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    public CreateDBInstanceRequest setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public CreateDBInstanceRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateDBInstanceRequest setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public CreateDBInstanceRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public CreateDBInstanceRequest setDBNodeGroupCount(String DBNodeGroupCount) {
        this.DBNodeGroupCount = DBNodeGroupCount;
        return this;
    }
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    public CreateDBInstanceRequest setDBNodeStorage(String DBNodeStorage) {
        this.DBNodeStorage = DBNodeStorage;
        return this;
    }
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    public CreateDBInstanceRequest setDbNodeStorageType(String dbNodeStorageType) {
        this.dbNodeStorageType = dbNodeStorageType;
        return this;
    }
    public String getDbNodeStorageType() {
        return this.dbNodeStorageType;
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

    public CreateDBInstanceRequest setSourceDBClusterId(String sourceDBClusterId) {
        this.sourceDBClusterId = sourceDBClusterId;
        return this;
    }
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    public CreateDBInstanceRequest setTags(java.util.List<CreateDBInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestTags> getTags() {
        return this.tags;
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

    public CreateDBInstanceRequest setVSwitchBak(String vSwitchBak) {
        this.vSwitchBak = vSwitchBak;
        return this;
    }
    public String getVSwitchBak() {
        return this.vSwitchBak;
    }

    public CreateDBInstanceRequest setVSwitchBak2(String vSwitchBak2) {
        this.vSwitchBak2 = vSwitchBak2;
        return this;
    }
    public String getVSwitchBak2() {
        return this.vSwitchBak2;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setZondIdBak2(String zondIdBak2) {
        this.zondIdBak2 = zondIdBak2;
        return this;
    }
    public String getZondIdBak2() {
        return this.zondIdBak2;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceRequest setZoneIdBak(String zoneIdBak) {
        this.zoneIdBak = zoneIdBak;
        return this;
    }
    public String getZoneIdBak() {
        return this.zoneIdBak;
    }

    public static class CreateDBInstanceRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>示例字符串</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateDBInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestTags self = new CreateDBInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
