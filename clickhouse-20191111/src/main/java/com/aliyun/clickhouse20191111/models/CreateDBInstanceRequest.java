// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <blockquote>
     * <p>This parameter applies only when <code>PayType</code> is set to <code>Prepaid</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/360339.html">DescribeBackups</a> API to query backup set IDs.</p>
     * <blockquote>
     * <p>This parameter is required when restoring data to an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b-12af23adsf</p>
     */
    @NameInMap("BackupSetID")
    public String backupSetID;

    /**
     * <p>A client token used to ensure request idempotence. The value must be a string of no more than 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The replica configuration. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: single-replica</p>
     * </li>
     * <li><p><strong>HighAvailability</strong>: high availability (dual-replica)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The instance type.&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>For single-replica clusters, valid values are:</p>
     * <ul>
     * <li><p><strong>LS20</strong>: Large-storage, 20 cores, 88 GB</p>
     * </li>
     * <li><p><strong>LS40</strong>: Large-storage, 40 cores, 176 GB</p>
     * </li>
     * <li><p><strong>LS80</strong>: Large-storage, 80 cores, 352 GB</p>
     * </li>
     * <li><p><strong>S8</strong>: Standard, 8 cores, 32 GB</p>
     * </li>
     * <li><p><strong>S16</strong>: Standard, 16 cores, 64 GB</p>
     * </li>
     * <li><p><strong>S32</strong>: Standard, 32 cores, 128 GB</p>
     * </li>
     * <li><p><strong>S64</strong>: Standard, 64 cores, 256 GB</p>
     * </li>
     * <li><p><strong>S80</strong>: Standard, 80 cores, 384 GB</p>
     * </li>
     * <li><p><strong>S104</strong>: Standard, 104 cores, 384 GB</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For high availability clusters, valid values are:</p>
     * <ul>
     * <li><p><strong>LC20</strong>: Large-storage, 20 cores, 88 GB</p>
     * </li>
     * <li><p><strong>LC40</strong>: Large-storage, 40 cores, 176 GB</p>
     * </li>
     * <li><p><strong>LC80</strong>: Large-storage, 80 cores, 352 GB</p>
     * </li>
     * <li><p><strong>C8</strong>: Standard, 8 cores, 32 GB</p>
     * </li>
     * <li><p><strong>C16</strong>: Standard, 16 cores, 64 GB</p>
     * </li>
     * <li><p><strong>C32</strong>: Standard, 32 cores, 128 GB</p>
     * </li>
     * <li><p><strong>C64</strong>: Standard, 64 cores, 256 GB</p>
     * </li>
     * <li><p><strong>C80</strong>: Standard, 80 cores, 384 GB</p>
     * </li>
     * <li><p><strong>C104</strong>: Standard, 104 cores, 384 GB</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>For single-replica clusters, valid values are:</p>
     * <ul>
     * <li><p><strong>S8</strong>: 8 cores, 32 GB</p>
     * </li>
     * <li><p><strong>S16</strong>: 16 cores, 64 GB</p>
     * </li>
     * <li><p><strong>S32</strong>: 32 cores, 128 GB</p>
     * </li>
     * <li><p><strong>S64</strong>: 64 cores, 256 GB</p>
     * </li>
     * <li><p><strong>S104</strong>: 104 cores, 384 GB</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For high availability clusters, valid values are:</p>
     * <ul>
     * <li><p><strong>C8</strong>: 8 cores, 32 GB</p>
     * </li>
     * <li><p><strong>C16</strong>: 16 cores, 64 GB</p>
     * </li>
     * <li><p><strong>C32</strong>: 32 cores, 128 GB</p>
     * </li>
     * <li><p><strong>C64</strong>: 64 cores, 256 GB</p>
     * </li>
     * <li><p><strong>C104</strong>: 104 cores, 384 GB</p>
     * </li>
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
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type. Currently, only VPC is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The engine version. Valid values:</p>
     * <ul>
     * <li><p><strong>21.8.10.19</strong></p>
     * </li>
     * <li><p><strong>22.8.5.29</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22.8.5.29</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The number of nodes.</p>
     * <ul>
     * <li><p>For single-replica clusters, the valid range is 1–48.</p>
     * </li>
     * <li><p>For high availability clusters, the valid range is 1–24.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity per node, in GB. The valid range is 100–32,000.</p>
     * <blockquote>
     * <p>The value must be a multiple of 100.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The storage type. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p><strong>CloudESSD_PL0</strong>: ESSD PL0 cloud disk</p>
     * </li>
     * <li><p><strong>CloudESSD</strong>: ESSD PL1 cloud disk</p>
     * </li>
     * <li><p><strong>CloudESSD_PL2</strong>: ESSD PL2 cloud disk</p>
     * </li>
     * <li><p><strong>CloudESSD_PL3</strong>: ESSD PL3 cloud disk</p>
     * </li>
     * <li><p><strong>CloudEfficiency</strong>: Ultra Disk</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudESSD_PL2</p>
     */
    @NameInMap("DbNodeStorageType")
    public String dbNodeStorageType;

    /**
     * <p>This parameter is required when <code>EncryptionType</code> is set to <code>CloudDisk</code>.</p>
     * <p>The ID of the cloud disk encryption key. You can create and manage keys in the Key Management Service console.</p>
     * <blockquote>
     * <p>If <code>EncryptionType</code> is not specified, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d2470df-da7b-4786-b981-9a164dae****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Only cloud disk encryption is supported. Set this value to <strong>CloudDisk</strong>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, encryption is disabled.</p>
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
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration unit.</p>
     * <blockquote>
     * <p>Notice: This parameter is required only when <code>PayType</code> is set to <code>Prepaid</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>Year</strong>: Measured in years.</p>
     * </li>
     * <li><p><strong>Month</strong>: Measured in months.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> API to query the latest region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group that contains the cluster.</p>
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
     * <p>The ID of the source cluster. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> API to query cluster IDs.</p>
     * <blockquote>
     * <p>This parameter is required when restoring data to an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1lxbo89u950****</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    /**
     * <p>The tags to add to the cluster.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateDBInstanceRequestTags> tags;

    /**
     * <p>The subscription duration.</p>
     * <blockquote>
     * <p>Notice: This parameter is required only when <code>PayType</code> is set to <code>Prepaid</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p>If <code>Period</code> is <code>Year</code>, the valid range is 1–3.</p>
     * </li>
     * <li><p>If <code>Period</code> is <code>Month</code>, the valid range is 1–9.</p>
     * </li>
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
     * <p>The ID of the secondary VSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchBak")
    public String vSwitchBak;

    /**
     * <p>The ID of the second standby VSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchBak2")
    public String vSwitchBak2;

    /**
     * <p>The VSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the second standby availability zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZondIdBak2")
    public String zondIdBak2;

    /**
     * <p>The availability zone ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> API to query the latest availability zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the secondary availability zone.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Example string</p>
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
