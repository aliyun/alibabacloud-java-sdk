// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeDisksRequestFilter> filter;

    /**
     * <p>The list of additional attribute values. The only valid value is <code>Placement</code>, which queries the data storage location of the disk.</p>
     * <blockquote>
     * <p>Only regional ESSD disks have data storage locations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IOPS</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>The ID of the automatic snapshot policy that is applied to the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-m5e2w2jutw8bv31****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The category of the disk. Valid values: </p>
     * <ul>
     * <li>all: all disks, local disks, and elastic ephemeral disks.</li>
     * <li>cloud: basic disk.</li>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: enterprise SSD (ESSD).</li>
     * <li>cloud_auto: ESSD AutoPL disk.</li>
     * <li>cloud_regional_disk_auto: regional ESSD.</li>
     * <li>cloud_essd_entry: ESSD Entry disk.</li>
     * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard.</li>
     * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium.</li>
     * <li>local_ssd_pro: I/O-intensive local disk.</li>
     * <li>local_hdd_pro: throughput-intensive local disk.</li>
     * <li>ephemeral: (retired) local disk.</li>
     * <li>ephemeral_ssd: (retired) local SSD.</li>
     * </ul>
     * <p>Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether automatic snapshots are released when the disk is released.</p>
     * <ul>
     * <li><p>true: Automatic snapshots are released.</p>
     * </li>
     * <li><p>false: Automatic snapshots are not released.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether the disk is released together with the instance. Valid values:</p>
     * <ul>
     * <li>true: The disk is released together with the instance.</li>
     * <li>false: The disk is retained as a pay-as-you-go data disk after the instance is released.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The billing method of the disk. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The IDs of disks, local disks, or elastic ephemeral disks. The value is a JSON array that can contain up to 100 IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d-bp67acfmxazb4p****&quot;, &quot;d-bp67acfmxazb4g****&quot;, … &quot;d-bp67acfmxazb4d****&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters, digits, and characters categorized as letter in Unicode. The name can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The type of the disk, local disk, or elastic ephemeral disk to query. Valid values: </p>
     * <ul>
     * <li>all: queries both system disks and data disks.</li>
     * <li>system: queries only system disks.</li>
     * <li>data: queries only data disks.</li>
     * </ul>
     * <p>Default value: all.</p>
     * <blockquote>
     * <p>Elastic ephemeral disks cannot be used as system disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: Only a dry run is performed. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is granted the required authorization, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: A Normal request is sent. If the request passes the dry run, a 2XX HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the automatic snapshot policy feature is enabled for the disk.</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is deprecated. After a disk is created, the automatic snapshot policy feature is enabled by default. You only need to apply an automatic snapshot policy to the disk.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    /**
     * <p>Specifies whether an automatic snapshot policy is applied to the disk.</p>
     * <ul>
     * <li>true: An automatic snapshot policy is applied.</li>
     * <li>false: No automatic snapshot policy is applied.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAutomatedSnapshotPolicy")
    public Boolean enableAutomatedSnapshotPolicy;

    /**
     * <p>Specifies whether the disk is a Shared Block Storage device.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableShared")
    public Boolean enableShared;

    /**
     * <p>Specifies whether to query only encrypted disks.</p>
     * <ul>
     * <li><p>true: Only encrypted disks are queried.</p>
     * </li>
     * <li><p>false: Encrypted disks are not exclusively queried.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The instance ID of the instance to which the disk, local disk, or elastic ephemeral disk is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4q****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used by the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The reason why the disk is locked. Valid values:</p>
     * <ul>
     * <li>financial: The disk is locked due to overdue payments.</li>
     * <li>security: The disk is locked for security reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>security</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries to return. Valid values: 10 to 500.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If this parameter is not specified or is set to a value smaller than 10, the default value is 10.</li>
     * <li>If this parameter is set to a value greater than 500, the default value is 500.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether the multi-attach feature is enabled for the disk. Valid values:</p>
     * <ul>
     * <li>Disabled: The multi-attach feature is not enabled.</li>
     * <li>Enabled: The multi-attach feature is enabled.</li>
     * <li>LegacyShared: queries Shared Block Storage devices.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * <p>For information about how to view the returned data, see the operation description section above.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the disk is removable. Valid values:</p>
     * <ul>
     * <li><p>true: The disk is removable. The disk can exist independently and can be freely attached to or detached from instances within the same zone.</p>
     * </li>
     * <li><p>false: The disk is not removable. The disk cannot exist independently and cannot be freely attached to or detached from instances within the same zone.</p>
     * </li>
     * </ul>
     * <p>The Portable attribute of the following types of block storage devices is false, and their lifecycle is the same as that of the instance:</p>
     * <ul>
     * <li>Local disks.</li>
     * <li>Local SSDs.</li>
     * <li>Subscription data disks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Portable")
    public Boolean portable;

    /**
     * <p>The region ID of the block storage device. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the disk belongs. When you use this parameter to filter resources, the resource count cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the snapshot used to create the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The status of the disk. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk status</a>. Valid values:</p>
     * <ul>
     * <li>In_use: in use.</li>
     * <li>Available: to be attached.</li>
     * <li>Attaching: being attached.</li>
     * <li>Detaching: being detached.</li>
     * <li>Creating: being created.</li>
     * <li>ReIniting: being initialized.</li>
     * <li>All: all statuses.</li>
     * </ul>
     * <p>Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags of the disk.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDisksRequestTag> tag;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksRequest self = new DescribeDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisksRequest setFilter(java.util.List<DescribeDisksRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeDisksRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeDisksRequest setAdditionalAttributes(java.util.List<String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public DescribeDisksRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DescribeDisksRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDisksRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public DescribeDisksRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public DescribeDisksRequest setDiskChargeType(String diskChargeType) {
        this.diskChargeType = diskChargeType;
        return this;
    }
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    public DescribeDisksRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public DescribeDisksRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public DescribeDisksRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeDisksRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeDisksRequest setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
        this.enableAutoSnapshot = enableAutoSnapshot;
        return this;
    }
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public DescribeDisksRequest setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
        this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
        return this;
    }
    public Boolean getEnableAutomatedSnapshotPolicy() {
        return this.enableAutomatedSnapshotPolicy;
    }

    public DescribeDisksRequest setEnableShared(Boolean enableShared) {
        this.enableShared = enableShared;
        return this;
    }
    public Boolean getEnableShared() {
        return this.enableShared;
    }

    public DescribeDisksRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public DescribeDisksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDisksRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public DescribeDisksRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeDisksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDisksRequest setMultiAttach(String multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }
    public String getMultiAttach() {
        return this.multiAttach;
    }

    public DescribeDisksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDisksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDisksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksRequest setPortable(Boolean portable) {
        this.portable = portable;
        return this;
    }
    public Boolean getPortable() {
        return this.portable;
    }

    public DescribeDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDisksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDisksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDisksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDisksRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeDisksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDisksRequest setTag(java.util.List<DescribeDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDisksRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDisksRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDisksRequestFilter extends TeaModel {
        /**
         * <p>查询资源时的筛选键，取值必须为<code>CreationStartTime</code>。同时设置<code>Filter.1.Key</code>和<code>Filter.1.Value</code>可以查询在指定时间点后创建的资源信息。</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>查询资源时的筛选值。指定该参数时必须同时指定<code>Filter.1.Key</code>参数，格式为：<code>yyyy-MM-ddTHH:mmZ</code>，采用UTC +0时区。</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T22:40Z</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDisksRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksRequestFilter self = new DescribeDisksRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeDisksRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDisksRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDisksRequestTag extends TeaModel {
        /**
         * <p>The tag key of the disk. Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count with all specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the disk. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksRequestTag self = new DescribeDisksRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDisksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
