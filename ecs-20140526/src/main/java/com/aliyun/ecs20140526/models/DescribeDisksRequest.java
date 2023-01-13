// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeDisksRequestFilter> filter;

    /**
     * <p>The values of attributes.</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>The ID of the automatic snapshot policy that is applied to the cloud disk.</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The category of the disk. Valid values:</p>
     * <br>
     * <p>* all: all disk categories</p>
     * <p>* cloud: basic disk</p>
     * <p>* cloud_efficiency: ultra disk</p>
     * <p>* cloud_ssd: standard SSD</p>
     * <p>* cloud_essd: enhanced SSD (ESSD)</p>
     * <p>* local\_ssd_pro: I/O-intensive local disk</p>
     * <p>* local\_hdd_pro: throughput-intensive local disk</p>
     * <p>* ephemeral: retired local disk</p>
     * <p>* ephemeral_ssd: retired local SSD</p>
     * <br>
     * <p>Default value: all.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to delete the automatic snapshots of the cloud disk when the disk is released.</p>
     * <br>
     * <p>*   true: The automatic snapshots of the cloud disk are deleted when the disk is released.</p>
     * <p>*   false: The automatic snapshots of the cloud disk are not deleted when the disk is released.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    /**
     * <p>Specifies whether to release the cloud disk when its associated instance is released. Valid values:</p>
     * <br>
     * <p>*   true: The cloud disk is released when its associated instance is released.</p>
     * <p>*   false: The cloud disk is not released but is retained as a pay-as-you-go data disk when its associated instance is released.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The billing method of the disk. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The IDs of disks. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,).</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The name of the disk.</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The type of the disk. Valid values:</p>
     * <br>
     * <p>*   all: system disk and data disk</p>
     * <p>*   system: system disk</p>
     * <p>*   data: data disk</p>
     * <br>
     * <p>Default value: all.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the automatic snapshot policy feature is enabled for the cloud disk.</p>
     * <br>
     * <p>*   true: The automatic snapshot policy feature is enabled for the cloud disk.</p>
     * <p>*   false: The automatic snapshot policy feature is not enabled for the cloud disk.</p>
     * <br>
     * <p>>  By default, the automatic snapshot policy feature is enabled for created cloud disks. You only need to apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.</p>
     */
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    /**
     * <p>Specifies whether an automatic snapshot policy is applied to the cloud disk.</p>
     * <br>
     * <p>*   true: An automatic snapshot policy is applied to the cloud disk.</p>
     * <p>*   false: No automatic snapshot policy is applied to the cloud disk.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("EnableAutomatedSnapshotPolicy")
    public Boolean enableAutomatedSnapshotPolicy;

    /**
     * <p>Specifies whether the disk is a Shared Block Storage device.</p>
     */
    @NameInMap("EnableShared")
    public Boolean enableShared;

    /**
     * <p>Specifies whether to query only encrypted cloud disks.</p>
     * <br>
     * <p>*   true: queries only encrypted cloud disks.</p>
     * <p>*   false: does not query encrypted cloud disks.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the instance to which the disk is attached.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used by the cloud disk.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The reason why the disk is locked. Valid values:</p>
     * <br>
     * <p>*   financial: The disk is locked due to overdue payments.</p>
     * <p>*   security: The disk is locked due to security reasons.</p>
     * <p>*   recycling: The preemptible instance is locked and pending release.</p>
     * <p>*   dedicatedhostfinancial: The instance is locked due to overdue payments for the dedicated host.</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If this parameter is not specified or is set to a value smaller than 10, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 500, the default value is 500.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether the multi-attach feature is enabled for the disk. Valid values:</p>
     * <br>
     * <p>*   Disabled: The multi-attach feature is not enabled for the disk.</p>
     * <p>*   Enabled: The multi-attach feature is enabled for the disk.</p>
     * <p>*   LegacyShared: Shared Block Storage devices are queried.</p>
     * <br>
     * <p>The multi-attach feature is in invitational preview. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm#/ticket/list).</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    /**
     * <p>The query token. Set the value to the `NextToken` value returned in the last call to the Describedisks operation.</p>
     * <br>
     * <p>For more information about how to check the responses returned by this operation, see the preceding "Description" section.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Page start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the disk is removable. Valid values:</p>
     * <br>
     * <p>*   true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.</p>
     * <p>*   false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.</p>
     * <br>
     * <p>The `Portable` attribute of the following disks is `false`, and these disks share the same lifecycle with their associated instances:</p>
     * <br>
     * <p>*   Local disks</p>
     * <p>*   Local SSDs</p>
     * <p>*   Subscription data disks</p>
     */
    @NameInMap("Portable")
    public Boolean portable;

    /**
     * <p>The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the disk belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <br>
     * <p>>  Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the snapshot that was used to create the cloud disk.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The state of the cloud disk. For more information, see [Disk states](~~25689~~). Valid values:</p>
     * <br>
     * <p>* In_use</p>
     * <p>* Available</p>
     * <p>* Attaching</p>
     * <p>* Detaching</p>
     * <p>* Creating</p>
     * <p>* ReIniting</p>
     * <p>* All</p>
     * <br>
     * <p>Default value: All.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDisksRequestTag> tag;

    /**
     * <p>The zone ID of the disk.</p>
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
         * <p>The key of filter 1 used to query resources. Set the value to `CreationStartTime`. You can specify a time by setting both `Filter.1.Key` and `Filter.1.Value` to query resources that were created after the time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter 1 used to query resources. Set the value to a time. If you specify this parameter, you must also specify the `Filter.1.Key` parameter. Specify the time in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.</p>
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
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the disk. Valid values of N: 1 to 20.</p>
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
