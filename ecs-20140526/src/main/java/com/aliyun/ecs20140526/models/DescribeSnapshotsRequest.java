// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeSnapshotsRequestFilter> filter;

    /**
     * <p>The category of the snapshot. Valid values:</p>
     * <ul>
     * <li><p><code>Standard</code>: A standard snapshot.</p>
     * </li>
     * <li><p><code>Flash</code>: A local snapshot. This value is deprecated because the local snapshot feature has been replaced by the instant access feature.</p>
     * <ul>
     * <li><p>If you have used local snapshots before December 14, 2020, you can continue to use this value.</p>
     * </li>
     * <li><p>If you have not used local snapshots before December 14, 2020, you cannot use this value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>archive</code>: An archive snapshot.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>For more information, see <a href="https://help.aliyun.com/noticelist/articleid/1060755542.html">December 14: Alibaba Cloud snapshot service upgrade and new billing items notice</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <ul>
     * <li><p><code>true</code>: Performs a dry run but does not query resources. The system checks the request for potential issues, including missing required parameters, invalid parameter values, and insufficient permissions. If the request is invalid, an error is returned. If the request is valid, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><code>false</code> (Default): Sends a normal request. If the request is valid, the system returns a 2xx HTTP status code and the query results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to return only encrypted snapshots. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the instance. When you specify this ID, the operation returns snapshots of cloud disks attached to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the KMS key used to encrypt the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to start the next page of results. You can obtain this token from the response to a previous query.</p>
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
     * <p>This parameter is deprecated. We recommend that you use the <code>NextToken</code> and <code>MaxResults</code> parameters for paged queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. We recommend that you use the <code>NextToken</code> and <code>MaxResults</code> parameters for paged queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the snapshot belongs. When you filter by this parameter, the query can return a maximum of 1,000 snapshots.</p>
     * <blockquote>
     * <p>You cannot filter resources that are in the default resource group.</p>
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
     * <p>A JSON array that contains the IDs of up to 100 snapshots to query.</p>
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
     * <p>The snapshot name.</p>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The snapshot creation type. Valid values:</p>
     * <ul>
     * <li><p><code>auto</code>: An automatically created snapshot.</p>
     * </li>
     * <li><p><code>user</code>: A manually created snapshot.</p>
     * </li>
     * <li><p><code>all</code> (Default): All snapshot creation types.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The type of the source disk of the snapshot. Valid values:</p>
     * <ul>
     * <li><p><code>system</code>: The snapshot was created from a system disk.</p>
     * </li>
     * <li><p><code>data</code>: The snapshot was created from a data disk.</p>
     * </li>
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
     * <p>The status of the snapshot. Valid values:</p>
     * <ul>
     * <li><p><code>progressing</code>: The snapshot is being created.</p>
     * </li>
     * <li><p><code>accomplished</code>: The snapshot is complete.</p>
     * </li>
     * <li><p><code>failed</code>: Snapshot creation failed.</p>
     * </li>
     * <li><p><code>all</code> (Default): All snapshot statuses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags by which to filter snapshots.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotsRequestTag> tag;

    /**
     * <p>The usage of the snapshot. Valid values:</p>
     * <ul>
     * <li><p><code>image</code>: The snapshot is used to create a custom image.</p>
     * </li>
     * <li><p><code>disk</code>: The snapshot is used to create a cloud disk.</p>
     * </li>
     * <li><p><code>image_disk</code>: The snapshot is used to create a custom image and a data disk.</p>
     * </li>
     * <li><p><code>none</code>: The snapshot is not used.</p>
     * </li>
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
         * <p>The filter key for querying resources. The value must be <code>CreationStartTime</code>. If you specify <code>Filter.1.Key</code> and <code>Filter.1.Value</code>, you can query for resources that were created after the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. If you specify this parameter, you must also specify <code>Filter.1.Key</code>. The value must be in the <code>yyyy-MM-ddTHH:mmZ</code> format and in UTC.</p>
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
         * <p>The tag key.</p>
         * <blockquote>
         * <p>For better compatibility, use the <code>Tag.N.Key</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
