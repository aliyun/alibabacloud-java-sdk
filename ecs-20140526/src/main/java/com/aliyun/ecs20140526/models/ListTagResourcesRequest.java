// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The pagination token to retrieve the next page of results.</p>
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
     * <p>The ID of the region where the resource is located. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of an ECS resource. The value of N ranges from 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1j6qtvdm8w0z1o****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>instance: ECS instance</p>
     * </li>
     * <li><p>disk: disk</p>
     * </li>
     * <li><p>snapshot: snapshot</p>
     * </li>
     * <li><p>image: image</p>
     * </li>
     * <li><p>securitygroup: security group</p>
     * </li>
     * <li><p>volume: volume</p>
     * </li>
     * <li><p>eni: elastic network interface</p>
     * </li>
     * <li><p>ddh: dedicated host</p>
     * </li>
     * <li><p>ddhcluster: dedicated host cluster</p>
     * </li>
     * <li><p>keypair: SSH key pair</p>
     * </li>
     * <li><p>launchtemplate: launch template</p>
     * </li>
     * <li><p>reservedinstance: reserved instance</p>
     * </li>
     * <li><p>snapshotpolicy: snapshot policy</p>
     * </li>
     * <li><p>elasticityassurance: Elasticity Assurance</p>
     * </li>
     * <li><p>capacityreservation: capacity reservation</p>
     * </li>
     * <li><p>command: Cloud Assistant command</p>
     * </li>
     * <li><p>invocation: The result of a command execution or file delivery in Cloud Assistant</p>
     * </li>
     * <li><p>activation: Cloud Assistant managed instance activation code</p>
     * </li>
     * <li><p>managedinstance: Cloud Assistant managed instance</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    /**
     * <p>A list of tag filters.</p>
     * <blockquote>
     * <p>This parameter is in invitation-only preview and is not yet available.</p>
     * </blockquote>
     */
    @NameInMap("TagFilter")
    public java.util.List<ListTagResourcesRequestTagFilter> tagFilter;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public ListTagResourcesRequest setTagFilter(java.util.List<ListTagResourcesRequestTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key to use for an exact match. The tag key must be 1 to 128 characters in length. The value of N ranges from 1 to 20.</p>
         * <p>Usage notes for the <code>Tag.N</code> parameter:</p>
         * <ul>
         * <li><p>Method 1: To find ECS resources that have specific tags.</p>
         * <ul>
         * <li><p>If you specify only <code>Tag.N.Key</code>, the operation returns all resources that have the specified tag key.</p>
         * </li>
         * <li><p>If you specify only <code>Tag.N.Value</code>, the operation returns an <code>InvalidParameter.TagValue</code> error.</p>
         * </li>
         * <li><p>If you specify multiple tag key-value pairs, the operation returns only the ECS resources that match all specified pairs.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Method 2: To query resources in a non-default resource group.</p>
         * <ul>
         * <li><p>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you must set <code>Value</code> to the ID of a non-default resource group. If you specify the ID of the default resource group, the operation returns an error.</p>
         * </li>
         * <li><p>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you cannot specify other tag key-value pairs. If you use multiple <code>Tag.N</code> parameters to query for resources by both resource group and tag, the operation returns an error.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to use for an exact match. The tag value must be 1 to 128 characters in length. The value of N ranges from 1 to 20.</p>
         * <blockquote>
         * <p>When <code>Key</code> is <code>acs:rm:rgId</code>, you must set this parameter to the ID of a non-default resource group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTagResourcesRequestTagFilter extends TeaModel {
        /**
         * <p>The tag key to use for a fuzzy match. The tag key must be 1 to 128 characters in length. The value of N ranges from 1 to 5.</p>
         * <p>Use the <code>TagFilter.N</code> parameter to perform a fuzzy match on tags to find matching ECS resources. Each filter consists of one key and one or more values. A fuzzy match may have a 2-second latency and is supported only for queries that return 5,000 or fewer resources after filtering.</p>
         * <ul>
         * <li><p>To perform a fuzzy match by tag key (<code>TagFilter.N.TagKey</code>), you must leave the tag values (<code>TagFilter.N.TagValues.N</code>) empty. For example, to search for ECS resources that have the tag key <code>environment</code>, you can set <code>TagFilter.1.TagKey</code> to <code>env*</code> (prefix match), <code>*env*</code> (substring match), or <code>env</code> (exact match), but you must leave <code>TagFilter.1.TagValues</code> empty.</p>
         * </li>
         * <li><p>To perform a fuzzy match by tag value (<code>TagFilter.N.TagValues.N</code>), you must set the tag key (<code>TagFilter.N.TagKey</code>) to an exact value. For example, to search for ECS resources with the tag key <code>env</code> and the tag value <code>product</code>, you must set <code>TagFilter.1.TagKey</code> to <code>env</code>. You can then set <code>TagFilter.1.TagValues.1</code> to <code>proc*</code> (prefix match), <code>*proc*</code> (substring match), or <code>proc</code> (exact match). For the same <code>TagKey</code>, you can use only one search pattern. If you specify multiple patterns, the system uses only the first pattern.</p>
         * </li>
         * <li><p>Tag keys are combined by using a logical AND. The operation returns only the ECS resources that match all specified tag keys.</p>
         * </li>
         * <li><p>Tag values for the same tag key are combined by using a logical OR. The operation returns the ECS resources that match any of the specified tag values for that tag key.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You cannot specify both the <code>TagFilter.N</code> and <code>Tag.N</code> parameters in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag values to use for a fuzzy match. The tag value must be 1 to 128 characters in length. The value of N ranges from 1 to 5. For more information, see the description of the <code>TagFilter.N.TagKey</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTagFilter</p>
         */
        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static ListTagResourcesRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTagFilter self = new ListTagResourcesRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTagFilter setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesRequestTagFilter setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
