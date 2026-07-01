// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeSnapshotsRequestFilter> filter;

    /**
     * <p>The category of the snapshot. Valid values:</p>
     * <ul>
     * <li>Standard: standard snapshot.</li>
     * <li>Flash: local snapshot. This value is about to be deprecated. Local snapshots have been replaced by the snapshot instant access feature. The metric description is as follows:<ul>
     * <li>If you used local snapshots before December 14, 2020, you can use this parameter. The parameter is active.</li>
     * <li>If you did not use local snapshots before December 14, 2020, you cannot use this parameter.</li>
     * </ul>
     * </li>
     * <li>archive: archive snapshot.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/noticelist/articleid/1060755542.html">Chinese site notice on snapshot service upgrade and new billing items on December 14</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM users, and missing parameter values. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to filter encrypted snapshots. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The instance ID. Specify this parameter to query snapshot information of disks attached to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key used by the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The maximum number of entries per page for paging. Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Obtained from the response of the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults for paging instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults for paging instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the disk. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. When you use this parameter to filter resources, the resource count cannot exceed 1000.</p>
     * <blockquote>
     * <p>Filtering by default resource group is not supported.</p>
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
     * <p>The IDs of snapshots. The value is a JSON array that consists of up to 100 snapshot IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;s-bp67acfmxazb4p****&quot;, &quot;s-bp67acfmxazb5p****&quot;, … &quot;s-bp67acfmxazb6p****&quot;]</p>
     */
    @NameInMap("SnapshotIds")
    public String snapshotIds;

    /**
     * <p>The ID of the snapshot chain.</p>
     * 
     * <strong>example:</strong>
     * <p>sl-bp1grgphbcc9brb5****</p>
     */
    @NameInMap("SnapshotLinkId")
    public String snapshotLinkId;

    /**
     * <p>The name of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The type of automatic creation. Valid values: </p>
     * <ul>
     * <li>auto: automatic snapshot.</li>
     * <li>user: manual snapshot.</li>
     * <li>all (default): All automatic creation types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The type of the source disk. Valid values: </p>
     * <ul>
     * <li>system: system disk.</li>
     * <li>data: data disk.</li>
     * </ul>
     * <blockquote>
     * <p>The value is case-insensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    /**
     * <p>The status of the snapshot. Valid values: </p>
     * <ul>
     * <li>progressing: The snapshot is being created.</li>
     * <li>accomplished: The snapshot is created.</li>
     * <li>failed: The snapshot failed to be created.</li>
     * <li>all (default): All snapshot statuses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotsRequestTag> tag;

    /**
     * <p>Specifies whether the snapshot has been used to create images or disks. Valid values: </p>
     * <ul>
     * <li>image: The snapshot has been used to create custom images.</li>
     * <li>disk: The snapshot has been used to create disks.</li>
     * <li>image_disk: The snapshot has been used to create both data disks and custom images.</li>
     * <li>none: The snapshot has not been used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
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
         * <p>The filter key used to query resources. Set the value to <code>CreationStartTime</code>. When you specify both <code>Filter.1.Key</code> and <code>Filter.1.Value</code>, you can query resources created after the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value used to query resources. When you specify this parameter, you must also specify <code>Filter.1.Key</code>. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-13T17:00Z</p>
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
         * <p>The tag key of the snapshot. Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count with all specified tags attached cannot exceed 1000. If the resource count exceeds 1000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
