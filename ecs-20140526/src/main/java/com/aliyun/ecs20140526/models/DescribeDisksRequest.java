// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeDisksRequestFilter> filter;

    // The values of attributes.
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    // The ID of the automatic snapshot policy that is applied to the cloud disk.
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    // The category of the disk. Valid values:
    // 
    // * all: all disk categories
    // * cloud: basic disk
    // * cloud_efficiency: ultra disk
    // * cloud_ssd: standard SSD
    // * cloud_essd: enhanced SSD (ESSD)
    // * local\_ssd_pro: I/O-intensive local disk
    // * local\_hdd_pro: throughput-intensive local disk
    // * ephemeral: retired local disk
    // * ephemeral_ssd: retired local SSD
    // 
    // Default value: all.
    @NameInMap("Category")
    public String category;

    // Specifies whether to delete the automatic snapshots of the cloud disk when the disk is released.
    // 
    // *   true: The automatic snapshots of the cloud disk are deleted when the disk is released.
    // *   false: The automatic snapshots of the cloud disk are not deleted when the disk is released.
    // 
    // Default value: false.
    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    // Specifies whether to release the cloud disk when its associated instance is released. Valid values:
    // 
    // *   true: The cloud disk is released when its associated instance is released.
    // *   false: The cloud disk is not released but is retained as a pay-as-you-go data disk when its associated instance is released.
    // 
    // Default value: false.
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    // The billing method of the disk. Valid values:
    // 
    // *   PrePaid: subscription
    // *   PostPaid: pay-as-you-go
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    // The IDs of disks. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,).
    @NameInMap("DiskIds")
    public String diskIds;

    // The name of the disk.
    @NameInMap("DiskName")
    public String diskName;

    // The type of the disk. Valid values:
    // 
    // *   all: system disk and data disk
    // *   system: system disk
    // *   data: data disk
    // 
    // Default value: all.
    @NameInMap("DiskType")
    public String diskType;

    // Specifies whether to check the validity of the request without actually making the request. Valid values:
    // 
    // *   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.
    // *   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.
    // 
    // Default value: false.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // Specifies whether the automatic snapshot policy feature is enabled for the cloud disk.
    // 
    // *   true: The automatic snapshot policy feature is enabled for the cloud disk.
    // *   false: The automatic snapshot policy feature is not enabled for the cloud disk.
    // 
    // >  By default, the automatic snapshot policy feature is enabled for created cloud disks. You only need to apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.
    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    // Specifies whether an automatic snapshot policy is applied to the cloud disk.
    // 
    // *   true: An automatic snapshot policy is applied to the cloud disk.
    // *   false: No automatic snapshot policy is applied to the cloud disk.
    // 
    // Default value: false.
    @NameInMap("EnableAutomatedSnapshotPolicy")
    public Boolean enableAutomatedSnapshotPolicy;

    // Specifies whether the disk is a Shared Block Storage device.
    @NameInMap("EnableShared")
    public Boolean enableShared;

    // Specifies whether to query only encrypted cloud disks.
    // 
    // *   true: queries only encrypted cloud disks.
    // *   false: does not query encrypted cloud disks.
    // 
    // Default value: false.
    @NameInMap("Encrypted")
    public Boolean encrypted;

    // The ID of the instance to which the disk is attached.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the Key Management Service (KMS) key used by the cloud disk.
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    // The reason why the disk is locked. Valid values:
    // 
    // *   financial: The disk is locked due to overdue payments.
    // *   security: The disk is locked due to security reasons.
    // *   recycling: The preemptible instance is locked and pending release.
    // *   dedicatedhostfinancial: The instance is locked due to overdue payments for the dedicated host.
    @NameInMap("LockReason")
    public String lockReason;

    // The maximum number of entries to return on each page. Valid values: 1 to 500.
    // 
    // Default value:
    // 
    // *   If this parameter is not specified or is set to a value smaller than 10, the default value is 10.
    // *   If this parameter is set to a value greater than 500, the default value is 500.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // Specifies whether the multi-attach feature is enabled for the disk. Valid values:
    // 
    // *   Disabled: The multi-attach feature is not enabled for the disk.
    // *   Enabled: The multi-attach feature is enabled for the disk.
    // *   LegacyShared: Shared Block Storage devices are queried.
    // 
    // The multi-attach feature is in invitational preview. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm#/ticket/list).
    @NameInMap("MultiAttach")
    public String multiAttach;

    // The query token. Set the value to the `NextToken` value returned in the last call to the Describedisks operation.
    // 
    // For more information about how to check the responses returned by this operation, see the preceding "Description" section.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Page start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // Specifies whether the disk is removable. Valid values:
    // 
    // *   true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.
    // *   false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.
    // 
    // The `Portable` attribute of the following disks is `false`, and these disks share the same lifecycle with their associated instances:
    // 
    // *   Local disks
    // *   Local SSDs
    // *   Subscription data disks
    @NameInMap("Portable")
    public Boolean portable;

    // The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which the disk belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the snapshot that was used to create the cloud disk.
    @NameInMap("SnapshotId")
    public String snapshotId;

    // The state of the cloud disk. For more information, see [Disk states](~~25689~~). Valid values:
    // 
    // * In_use
    // * Available
    // * Attaching
    // * Detaching
    // * Creating
    // * ReIniting
    // * All
    // 
    // Default value: All.
    @NameInMap("Status")
    public String status;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeDisksRequestTag> tag;

    // The zone ID of the disk.
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
        // The key of filter 1 used to query resources. Set the value to `CreationStartTime`. You can specify a time by setting both `Filter.1.Key` and `Filter.1.Value` to query resources that were created after the time.
        @NameInMap("Key")
        public String key;

        // The value of filter 1 used to query resources. Set the value to a time. If you specify this parameter, you must also specify the `Filter.1.Key` parameter. Specify the time in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.
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
        // The key of tag N of the disk. Valid values of N: 1 to 20.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the disk. Valid values of N: 1 to 20.
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
