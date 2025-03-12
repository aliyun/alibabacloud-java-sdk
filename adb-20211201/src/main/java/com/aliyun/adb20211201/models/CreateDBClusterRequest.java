// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>The ID of the backup set that you want to use to restore data.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612318.html">DescribeBackups</a> operation to query the backup sets of the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1880808684</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The region ID of the source cluster.</p>
     * <blockquote>
     * <p> This parameter must be specified for cloning clusters across regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("CloneSourceRegionId")
    public String cloneSourceRegionId;

    /**
     * <p>The amount of reserved computing resources. Valid values: 0ACU to 4096ACU. The value must be in increments of 16ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
     * <blockquote>
     * <p> This parameter must be specified with a unit.</p>
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
     * <li>The description must be 2 to 256 characters in length</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The network type of the cluster. Set the value to <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The version of the cluster. Set the value to <strong>5.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DiskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>Specifies whether to allocate all reserved computing resources to the user_default resource group. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDefaultResourcePool")
    public Boolean enableDefaultResourcePool;

    /**
     * <p>The ID of the key that is used to encrypt disk data.</p>
     * <blockquote>
     * <p> This parameter must be specified only when disk encryption is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e1935511-cf88-1123-a0f8-1be8d251****</p>
     */
    @NameInMap("KmsId")
    public String kmsId;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
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
     * <p> This parameter must be specified when PayType is set to Prepaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The product form of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>IntegrationForm</strong>: integrated.</li>
     * <li><strong>LegacyForm</strong>: Data Lakehouse Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ProductForm")
    public String productForm;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>BasicVersion</strong>: Basic Edition.</li>
     * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter must be specified only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BasicVersion</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

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
     * <p>The number of reserved resource nodes.</p>
     * <ul>
     * <li>For Enterprise Edition, the default value is 3 and the step size is 3.</li>
     * <li>For Basic Edition, the default value is 1.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter must be specified only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReservedNodeCount")
    public Integer reservedNodeCount;

    /**
     * <p>The specifications of reserved resource nodes. Unit: ACUs.</p>
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
     * <p>The method that you want to use to restore data. Valid values:</p>
     * <ul>
     * <li><strong>backup</strong>: restores data from a backup set. You must also specify the <strong>BackupSetId</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
     * <li><strong>timepoint</strong>: restores data to a point in time. You must also specify the <strong>RestoreToTime</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>backup</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The ID of the secondary vSwitch.</p>
     * <blockquote>
     * <p> You cannot set this parameter to a value that is the same as that of the VSwitchId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1aadw9k19x451gx****</p>
     */
    @NameInMap("SecondaryVSwitchId")
    public String secondaryVSwitchId;

    /**
     * <p>The ID of the secondary zone.</p>
     * <blockquote>
     * <p> You cannot set this parameter to a value that is the same as that of the ZoneId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The ID of the source AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("SourceDbClusterId")
    public String sourceDbClusterId;

    /**
     * <p>The amount of reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of 24ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
     * <blockquote>
     * <p> This parameter must be specified with a unit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24ACU</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1at5ze0t5u3xtqn****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     * <p>This parameter is required.</p>
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
         * <p>The key of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p> The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
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
