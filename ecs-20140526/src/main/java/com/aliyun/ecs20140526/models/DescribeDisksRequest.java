// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeDisksRequestFilter> filter;

    /**
     * <p>The additional attributes. Set the value to <code>Placement</code>, which indicates the data storage locations of the disk.</p>
     * <blockquote>
     * <p> This attribute is valid only for Regional Enterprise SSDs (ESSDs).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IOPS</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>The ID of the automatic snapshot policy that is applied to the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-m5e2w2jutw8bv31****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The category of the disk. Valid values:</p>
     * <ul>
     * <li>all: all disk categories</li>
     * <li>cloud: basic disk</li>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: Enterprise SSD (ESSD)</li>
     * <li>cloud_auto: ESSD AutoPL disk</li>
     * <li>local_ssd_pro: I/O-intensive local disk</li>
     * <li>local_hdd_pro: throughput-intensive local disk</li>
     * <li>cloud_essd_entry: ESSD Entry disk</li>
     * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
     * <li>elastic_ephemeral_disk_premium: premium elastic ephemeral disk</li>
     * <li>ephemeral: retired local disk</li>
     * <li>ephemeral_ssd: retired local SSD</li>
     * </ul>
     * <p>Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to delete the automatic snapshots of the cloud disk after the disk is released.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether the disk is released when the associated instance is released. Valid values:</p>
     * <ul>
     * <li>true: The disk is released when the associated instance is released.</li>
     * <li>false: The disk is retained as a pay-as-you-go data disk when the associated instance is released.</li>
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
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The IDs of cloud disks, local disks, or elastic ephemeral disks. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d-bp67acfmxazb4p****&quot;, &quot;d-bp67acfmxazb4g****&quot;, … &quot;d-bp67acfmxazb4d****&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The type of the disk. Valid values:</p>
     * <ul>
     * <li>all: system disk and data disk</li>
     * <li>system: system disk</li>
     * <li>data: data disk</li>
     * </ul>
     * <p>Default value: all.</p>
     * <blockquote>
     * <p> Elastic ephemeral disks cannot be used as system disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The systems checks whether your AccessKey pair is valid, whether RAM users are granted permissions, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the automatic snapshot policy feature is enabled for the cloud disk. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is deprecated. By default, the automatic snapshot policy feature is enabled for cloud disks. You need to only apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    /**
     * <p>Specifies whether an automatic snapshot policy is applied to the cloud disk.</p>
     * <ul>
     * <li>true: An automatic snapshot policy is applied to the cloud disk.</li>
     * <li>false: No automatic snapshot policy is applied to the cloud disk.</li>
     * </ul>
     * <p>Default value: false</p>
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
     * <p>Specifies whether to query only encrypted cloud disks.</p>
     * <ul>
     * <li>true: queries only encrypted cloud disks.</li>
     * <li>false: does not query encrypted cloud disks.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the Elastic Compute Service (ECS) instance to which the disk is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4q****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key that is used by the cloud disk.</p>
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
     * <li>security: The disk is locked due to security reasons.</li>
     * <li>recycling: The preemptible instance is locked and pending release.</li>
     * <li>dedicatedhostfinancial: The instance is locked due to overdue payments for the dedicated host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>recycling</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries per page. Valid values: 10 to 500.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not specify this parameter or you set this parameter to a value less than 10, the default value is 10.</li>
     * <li>If you set this parameter to a value greater than 500, the default value is 500.</li>
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
     * <li>Disabled: The multi-attach feature is not enabled for the disk.</li>
     * <li>Enabled: The multi-attach feature is enabled for the disk.</li>
     * <li>LegacyShared: Shared Block Storage devices are queried.</li>
     * </ul>
     * <p>The multi-attach feature is available to select users. To use this feature, <a href="https://workorder-intl.console.aliyun.com/console.htm#/ticket/list">submit a ticket</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    /**
     * <p>The query token. Set the value to the <code>NextToken</code> value that was returned in the last call to this operation.</p>
     * <p>For more information about how to check the responses returned by this operation, see the preceding &quot;Description&quot; section.</p>
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
     * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
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
     * <li>true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.</li>
     * <li>false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.</li>
     * </ul>
     * <p>The <code>Portable</code> attribute of the following types of disks is <code>false</code>, and these types of disks share the same lifecycle with their associated instances:</p>
     * <ul>
     * <li>Local disks</li>
     * <li>Local SSDs</li>
     * <li>Subscription data disks</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Portable")
    public Boolean portable;

    /**
     * <p>The region ID of the disk. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the disk belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <blockquote>
     * <p> Resources in the default resource group are displayed in the response regardless of the value specified for this parameter.</p>
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
     * <p>The ID of the snapshot from which you create the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The status of the disk. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk states</a>. Valid values:</p>
     * <ul>
     * <li>In_use</li>
     * <li>Available</li>
     * <li>Attaching</li>
     * <li>Detaching</li>
     * <li>Creating</li>
     * <li>ReIniting</li>
     * <li>All</li>
     * </ul>
     * <p>Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the disk.</p>
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
         * <p>The key of filter 1 used to query resources. Set the value to <code>CreationStartTime</code>. You can specify a time by setting both <code>Filter.1.Key</code> and <code>Filter.1.Value</code> to query resources that were created after the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter 1 used to query resources. Set the value to a time. If you specify this parameter, you must also specify the <code>Filter.1.Key</code> parameter. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
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
         * <p>The key of tag N of the disk. Valid values of N: 1 to 20.</p>
         * <p>If you specify a single tag to query resources, up to 1,000 resources to which the tag is added are returned. If you specify multiple tags to query resources, up to 1,000 resources to which all specified tags are added are returned. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the disk. Valid values of N: 1 to 20.</p>
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
