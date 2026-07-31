// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AINodeNumber")
    public Integer AINodeNumber;

    /**
     * <strong>example:</strong>
     * <p>ADB.MLPlus.4</p>
     */
    @NameInMap("AINodeSpec")
    public String AINodeSpec;

    /**
     * <p>The ID of the backup set used for restoration from a backup set.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612318.html">DescribeBackups</a> operation to query the backup list of the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1880808684</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The region of the source cluster.</p>
     * <blockquote>
     * <p>This parameter is required for cross-region cloning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("CloneSourceRegionId")
    public String cloneSourceRegionId;

    /**
     * <p>The compute reserved resources. Valid values: 0 ACU to 4096 ACU, in increments of 16. 1 ACU is approximately equivalent to 1 core and 4 GB of memory.</p>
     * <blockquote>
     * <p>Include the unit when specifying this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16ACU</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The description of the cluster.</p>
     * <ul>
     * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type of the cluster. Only <strong>VPC</strong> (Virtual Private Cloud) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The version of the Data Lakehouse Edition cluster. Valid values: <strong>5.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>Specifies whether to enable cloud disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DiskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>Specifies whether to allocate all compute reserved resources to the default resource group (user_default). Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): All compute reserved resources are allocated to the default resource group.</li>
     * <li><strong>false</strong>: Not all compute reserved resources are allocated to the default resource group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDefaultResourcePool")
    public Boolean enableDefaultResourcePool;

    /**
     * <p>Specifies whether to enable SSL encryption. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: SSL encryption is enabled.</li>
     * <li><strong>false</strong>: SSL encryption is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>The ID of the key used to encrypt cloud disk data.</p>
     * <blockquote>
     * <p>This parameter is used only when cloud disk encryption is enabled for the AnalyticDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e1935511-cf88-1123-a0f8-1be8d251****</p>
     */
    @NameInMap("KmsId")
    public String kmsId;

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
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis.</li>
     * <li><strong>Month</strong>: subscription on a monthly basis.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The product form. Valid values:</p>
     * <ul>
     * <li><strong>IntegrationForm</strong>: integrated form.</li>
     * <li><strong>LegacyForm</strong>: Data Lakehouse Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ProductForm")
    public String productForm;

    /**
     * <p>The product version. Valid values:</p>
     * <ul>
     * <li><strong>BasicVersion</strong>: Basic Edition.</li>
     * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.<blockquote>
     * <p>This parameter is required only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BasicVersion</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of a specific Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of reserved nodes. </p>
     * <ul>
     * <li>Enterprise Edition uses 3 nodes by default, in increments of 3.</li>
     * <li>Basic Edition uses 1 node by default.<blockquote>
     * <p>This parameter is required only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReservedNodeCount")
    public Integer reservedNodeCount;

    /**
     * <p>The node specifications of reserved nodes, in ACUs.</p>
     * 
     * <strong>example:</strong>
     * <p>8ACU</p>
     */
    @NameInMap("ReservedNodeSize")
    public String reservedNodeSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The point in time to which you want to restore data from the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-20T03:13:56Z</p>
     */
    @NameInMap("RestoreToTime")
    public String restoreToTime;

    /**
     * <p>The restoration method. Valid values:</p>
     * <ul>
     * <li><strong>backup</strong>: restores data from a backup set. You must also specify the <strong>BackupSetId</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
     * <li><strong>timepoint</strong>: restores data to a specific point in time. You must also specify the <strong>RestoreToTime</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>backup</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The secondary vSwitch ID.</p>
     * <blockquote>
     * <p>The value of this parameter must be different from the value of the VSwitchId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1aadw9k19x451gx****</p>
     */
    @NameInMap("SecondaryVSwitchId")
    public String secondaryVSwitchId;

    /**
     * <p>The secondary zone ID.</p>
     * <blockquote>
     * <p>The value of this parameter must be different from the value of the ZoneId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The instance ID of the source AnalyticDB for MySQL Data Warehouse Edition cluster. If this parameter is specified, the Data Lakehouse Edition cluster is used to recover from the Data Warehouse Edition cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("SourceDbClusterId")
    public String sourceDbClusterId;

    /**
     * <p>The storage reserved resources. Valid values: 0 ACU to 2064 ACU, in increments of 24. 1 ACU is approximately equivalent to 1 core and 4 GB of memory.</p>
     * <blockquote>
     * <p>Include the unit when specifying this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24ACU</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBClusterRequestTag> tag;

    /**
     * <p>The subscription duration of the subscription cluster. Valid values:</p>
     * <ul>
     * <li>When <strong>Period</strong> is set to Year, the value of UsedTime ranges from 1 to 3 (integer).</li>
     * <li>When <strong>Period</strong> is set to Month, the value of UsedTime ranges from 1 to 9 (integer).</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when PayType is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1at5ze0t5u3xtqn****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1aadw9k19x6cis9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the zone ID of a specific Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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

    public CreateDBClusterRequest setAINodeNumber(Integer AINodeNumber) {
        this.AINodeNumber = AINodeNumber;
        return this;
    }
    public Integer getAINodeNumber() {
        return this.AINodeNumber;
    }

    public CreateDBClusterRequest setAINodeSpec(String AINodeSpec) {
        this.AINodeSpec = AINodeSpec;
        return this;
    }
    public String getAINodeSpec() {
        return this.AINodeSpec;
    }

    public CreateDBClusterRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDBClusterRequest setCloneSourceRegionId(String cloneSourceRegionId) {
        this.cloneSourceRegionId = cloneSourceRegionId;
        return this;
    }
    public String getCloneSourceRegionId() {
        return this.cloneSourceRegionId;
    }

    public CreateDBClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
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

    public CreateDBClusterRequest setDiskEncryption(Boolean diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    public CreateDBClusterRequest setEnableDefaultResourcePool(Boolean enableDefaultResourcePool) {
        this.enableDefaultResourcePool = enableDefaultResourcePool;
        return this;
    }
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    public CreateDBClusterRequest setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public CreateDBClusterRequest setKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }
    public String getKmsId() {
        return this.kmsId;
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

    public CreateDBClusterRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public CreateDBClusterRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public CreateDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBClusterRequest setReservedNodeCount(Integer reservedNodeCount) {
        this.reservedNodeCount = reservedNodeCount;
        return this;
    }
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    public CreateDBClusterRequest setReservedNodeSize(String reservedNodeSize) {
        this.reservedNodeSize = reservedNodeSize;
        return this;
    }
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
    }

    public CreateDBClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBClusterRequest setRestoreToTime(String restoreToTime) {
        this.restoreToTime = restoreToTime;
        return this;
    }
    public String getRestoreToTime() {
        return this.restoreToTime;
    }

    public CreateDBClusterRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDBClusterRequest setSecondaryVSwitchId(String secondaryVSwitchId) {
        this.secondaryVSwitchId = secondaryVSwitchId;
        return this;
    }
    public String getSecondaryVSwitchId() {
        return this.secondaryVSwitchId;
    }

    public CreateDBClusterRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateDBClusterRequest setSourceDbClusterId(String sourceDbClusterId) {
        this.sourceDbClusterId = sourceDbClusterId;
        return this;
    }
    public String getSourceDbClusterId() {
        return this.sourceDbClusterId;
    }

    public CreateDBClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
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
         * <p>The tag key. You can use tags to filter the cluster list. You can specify up to 20 tag pairs. The value of N for each tag pair must be unique and must be a consecutive integer that starts from 1. The value of <code>Tag.N.Key</code> corresponds to the value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can use tags to filter the cluster list. You can specify up to 20 tag pairs. The value of N for each tag pair must be unique and must be a consecutive integer that starts from 1. The value of <code>Tag.N.Key</code> corresponds to the value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p>The tag value can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
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
