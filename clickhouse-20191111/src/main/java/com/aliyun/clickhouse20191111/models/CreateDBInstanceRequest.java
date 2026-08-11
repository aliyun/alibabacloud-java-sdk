// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <blockquote>
     * <p>This parameter takes effect only when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The backup set ID. You can call the <a href="https://help.aliyun.com/document_detail/360339.html">DescribeBackups</a> operation to query the backup set ID.</p>
     * <blockquote>
     * <p>This parameter is required when you restore data for an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b-12af23adsf</p>
     */
    @NameInMap("BackupSetID")
    public String backupSetID;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The value is a string that contains up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The replica configuration. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: single-replica edition.</li>
     * <li><strong>HighAvailability</strong>: double-replica edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("DBClusterCategory")
    public String DBClusterCategory;

    /**
     * <p>The cluster specifications.
     * &lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Single-replica edition. Valid values:<ul>
     * <li><strong>LS20</strong>: large storage, 20 cores, 88 GB.</li>
     * <li><strong>LS40</strong>: large storage, 40 cores, 176 GB.</li>
     * <li><strong>LS80</strong>: large storage, 80 cores, 352 GB.</li>
     * <li><strong>S8</strong>: standard, 8 cores, 32 GB.</li>
     * <li><strong>S16</strong>: standard, 16 cores, 64 GB.</li>
     * <li><strong>S32</strong>: standard, 32 cores, 128 GB.</li>
     * <li><strong>S64</strong>: standard, 64 cores, 256 GB.</li>
     * <li><strong>S80</strong>: standard, 80 cores, 384 GB.</li>
     * <li><strong>S104</strong>: standard, 104 cores, 384 GB.</li>
     * </ul>
     * </li>
     * <li>Double-replica edition. Valid values:<ul>
     * <li><strong>LC20</strong>: large storage, 20 cores, 88 GB.</li>
     * <li><strong>LC40</strong>: large storage, 40 cores, 176 GB.</li>
     * <li><strong>LC80</strong>: large storage, 80 cores, 352 GB.</li>
     * <li><strong>C8</strong>: standard, 8 cores, 32 GB.</li>
     * <li><strong>C16</strong>: standard, 16 cores, 64 GB.</li>
     * <li><strong>C32</strong>: standard, 32 cores, 128 GB.</li>
     * <li><strong>C64</strong>: standard, 64 cores, 256 GB.</li>
     * <li><strong>C80</strong>: standard, 80 cores, 384 GB.</li>
     * <li><strong>C104</strong>: standard, 104 cores, 384 GB.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Single-replica edition. Valid values:    <ul>
     * <li><strong>S8</strong>: 8 cores, 32 GB.</li>
     * <li><strong>S16</strong>: 16 cores, 64 GB.    </li>
     * <li><strong>S32</strong>: 32 cores, 128 GB.</li>
     * <li><strong>S64</strong>: 64 cores, 256 GB.</li>
     * <li><strong>S104</strong>: 104 cores, 384 GB.</li>
     * </ul>
     * </li>
     * <li>Double-replica edition. Valid values:<ul>
     * <li><strong>C8</strong>: 8 cores, 32 GB.</li>
     * <li><strong>C16</strong>: 16 cores, 64 GB.</li>
     * <li><strong>C32</strong>: 32 cores, 128 GB.</li>
     * <li><strong>C64</strong>: 64 cores, 256 GB.</li>
     * <li><strong>C104</strong>: 104 cores, 384 GB.</li>
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
     * <p>The network type. Only VPC is supported.</p>
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
     * <li>Single-replica edition: valid values: 1 to 48.</li>
     * <li>Double-replica edition: valid values: 1 to 24.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity per node. Valid values: 100 to 32000. Unit: GB.</p>
     * <blockquote>
     * <p>The step size is 100 GB.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The storage type. Valid values:
     * &lt;props=&quot;china&quot;&gt;- <strong>CloudESSD_PL0</strong>: PL0 ESSD.</p>
     * <ul>
     * <li><strong>CloudESSD</strong>: PL1 ESSD.</li>
     * <li><strong>CloudESSD_PL2</strong>: PL2 ESSD.</li>
     * <li><strong>CloudESSD_PL3</strong>: PL3 ESSD.</li>
     * <li><strong>CloudEfficiency</strong>: ultra cloud disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudESSD_PL2</p>
     */
    @NameInMap("DbNodeStorageType")
    public String dbNodeStorageType;

    /**
     * <p>The ID of the key used for cloud disk encryption. This parameter is required when EncryptionType is set to CloudDisk.</p>
     * <p>You can view the key ID in the Key Management Service (KMS) console or create a key.</p>
     * <blockquote>
     * <p>If EncryptionType is not specified, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d2470df-da7b-4786-b981-9a164dae****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption type. Only cloud disk encryption is supported. Set the value to <strong>CloudDisk</strong>.</p>
     * <blockquote>
     * <p>If this parameter is not specified, data is not encrypted.</p>
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
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect and is required only when PayType is set to Prepaid.				</p>
     * </blockquote>
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis.</li>
     * <li><strong>Month</strong>: subscription on a monthly basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The source cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * <blockquote>
     * <p>This parameter is required when you restore data for an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1lxbo89u950****</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateDBInstanceRequestTags> tags;

    /**
     * <p>The subscription duration of the subscription cluster.</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect and is required only when PayType is set to Prepaid.</p>
     * </blockquote>
     * <ul>
     * <li>If Period is set to Year, valid values: 1 to 3 (integer).</li>
     * <li>If Period is set to Month, valid values: 1 to 9 (integer).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>VPC ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The secondary vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchBak")
    public String vSwitchBak;

    /**
     * <p>The secondary vSwitch 2.</p>
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
     * <p>The secondary zone 2.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZondIdBak2")
    public String zondIdBak2;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the zone ID.</p>
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
