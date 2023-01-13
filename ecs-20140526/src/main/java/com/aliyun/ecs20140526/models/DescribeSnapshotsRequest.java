// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeSnapshotsRequestFilter> filter;

    /**
     * <p>The category of the snapshot. Valid values:</p>
     * <br>
     * <p>*   Standard: normal snapshot</p>
     * <p>*   Flash: local snapshot</p>
     * <br>
     * <p>The local snapshot feature is replaced by the instant access feature. When you specify this parameter, take note of the following items:</p>
     * <br>
     * <p>*   If you have used local snapshots before December 14, 2020, you can use this parameter.</p>
     * <p>*   If you have not used local snapshots before December 14, 2020, you cannot use this parameter.</p>
     * <br>
     * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the snapshot is encrypted. Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used for the data disk.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the query. Set the value to the NextToken value obtained from the response to the previous request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the snapshot belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
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
     * <p>The IDs of snapshots. The value can be a JSON array that consists of up to 100 snapshot IDs. Separate the snapshot IDs with commas (,).</p>
     */
    @NameInMap("SnapshotIds")
    public String snapshotIds;

    /**
     * <p>The ID of the snapshot chain. The value is a JSON array that consists of up to 100 snapshot chain IDs. Separate multiple snapshot chain IDs with commas (,).</p>
     */
    @NameInMap("SnapshotLinkId")
    public String snapshotLinkId;

    /**
     * <p>The name of the snapshot.</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The type of the snapshot. Default value: all. Valid values:</p>
     * <br>
     * <p>*   auto: automatic snapshot</p>
     * <p>*   user: manual snapshot</p>
     * <p>*   all: all snapshot types</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The type of the source disk for which the snapshot was created. Valid values:</p>
     * <br>
     * <p>*   System: system disk</p>
     * <p>*   data: data disk</p>
     * <br>
     * <p>>  The value of this parameter is case-insensitive.</p>
     */
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    /**
     * <p>The state of the snapshot. Default value: all. Valid values:</p>
     * <br>
     * <p>*   progressing: The snapshot is being created.</p>
     * <p>*   accomplished: The snapshot is created.</p>
     * <p>*   failed: The snapshot fails to be created.</p>
     * <p>*   all: This parameter indicates all snapshot states.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotsRequestTag> tag;

    /**
     * <p>Specifies whether the snapshot has been used to create images or disks. Valid values:</p>
     * <br>
     * <p>*   image: The snapshot has been used to create custom images.</p>
     * <p>*   disk: The snapshot has been used to create disks.</p>
     * <p>*   image_disk: The snapshot has been used to create both custom images and data disks.</p>
     * <p>*   none: The snapshot has not been used to create images or disks.</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setFilter(java.util.List<DescribeSnapshotsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeSnapshotsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeSnapshotsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeSnapshotsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeSnapshotsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeSnapshotsRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public DescribeSnapshotsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSnapshotsRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public DescribeSnapshotsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSnapshotsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSnapshotsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSnapshotsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSnapshotsRequest setSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeSnapshotsRequest setSnapshotLinkId(String snapshotLinkId) {
        this.snapshotLinkId = snapshotLinkId;
        return this;
    }
    public String getSnapshotLinkId() {
        return this.snapshotLinkId;
    }

    public DescribeSnapshotsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public DescribeSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public DescribeSnapshotsRequest setSourceDiskType(String sourceDiskType) {
        this.sourceDiskType = sourceDiskType;
        return this;
    }
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public DescribeSnapshotsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSnapshotsRequest setTag(java.util.List<DescribeSnapshotsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSnapshotsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeSnapshotsRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public static class DescribeSnapshotsRequestFilter extends TeaModel {
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

        public static DescribeSnapshotsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestFilter self = new DescribeSnapshotsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSnapshotsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the snapshot. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the snapshot. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestTag self = new DescribeSnapshotsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
