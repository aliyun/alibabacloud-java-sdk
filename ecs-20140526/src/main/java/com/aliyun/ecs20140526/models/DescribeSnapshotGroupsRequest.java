// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-j6ca469urv8ei629****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the snapshot-consistent group.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that determines the start point of the next query. Set the value to the NextToken value that is returned from the last call.</p>
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
     * <p>The region ID of the snapshot-consistent group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
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
     * <p>The ID of snapshot-consistent group N. Valid values of N: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>ssg-j6ciyh3k52qp7ovm****</p>
     */
    @NameInMap("SnapshotGroupId")
    public java.util.List<String> snapshotGroupId;

    /**
     * <p>The state of snapshot-consistent group N. Valid values of the second N: 1, 2, and 3. Valid values:</p>
     * <ul>
     * <li>progressing: The snapshot-consistent group is being created.</li>
     * <li>accomplished: The snapshot-consistent group is created.</li>
     * <li>failed: The snapshot-consistent group fails to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accomplished</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tags of the snapshot-consistent group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotGroupsRequestTag> tag;

    public static DescribeSnapshotGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotGroupsRequest self = new DescribeSnapshotGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotGroupsRequest setAdditionalAttributes(java.util.List<String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public DescribeSnapshotGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSnapshotGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSnapshotGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSnapshotGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSnapshotGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSnapshotGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSnapshotGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSnapshotGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSnapshotGroupsRequest setSnapshotGroupId(java.util.List<String> snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }
    public java.util.List<String> getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    public DescribeSnapshotGroupsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeSnapshotGroupsRequest setTag(java.util.List<DescribeSnapshotGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSnapshotGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSnapshotGroupsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the snapshot-consistent group. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the snapshot-consistent group. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsRequestTag self = new DescribeSnapshotGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
