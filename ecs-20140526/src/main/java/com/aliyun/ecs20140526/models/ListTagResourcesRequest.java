// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token for the next query.</p>
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
     * <p>The region ID of the resource. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the ECS resource. Valid values of N: 1 to 50.</p>
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
     * <li>instance: ECS instance</li>
     * <li>disk: cloud disk</li>
     * <li>snapshot: snapshot</li>
     * <li>image: image</li>
     * <li>securitygroup: security group</li>
     * <li>volume: storage volume</li>
     * <li>eni: Elastic Network Interface (ENI)</li>
     * <li>ddh: dedicated host</li>
     * <li>ddhcluster: dedicated host cluster</li>
     * <li>keypair: SSH key pair</li>
     * <li>launchtemplate: launch template</li>
     * <li>reservedinstance: reserved instance</li>
     * <li>snapshotpolicy: automatic snapshot policy</li>
     * <li>elasticityassurance: elasticity assurance</li>
     * <li>capacityreservation: capacity reservation</li>
     * <li>command: Cloud Assistant command</li>
     * <li>invocation: Cloud Assistant command execution or file delivery result</li>
     * <li>activation: Cloud Assistant managed instance activation code</li>
     * <li>managedinstance: Cloud Assistant managed instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    /**
     * <p>The tag filtering rules.</p>
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>The tag key used for exact match when querying ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <p>Usage notes for the Tag.N parameter:</p>
         * <ul>
         * <li><p>Method 1: Used to exactly query ECS resources bound to specific tags. It consists of a key-value pair.</p>
         * <ul>
         * <li><p>If only Tag.N.Key is specified, all resources associated with the tag key are returned.</p>
         * </li>
         * <li><p>If only Tag.N.Value is specified, the InvalidParameter.TagValue error is returned.</p>
         * </li>
         * <li><p>If multiple tag key-value pairs are specified, only ECS resources that meet all the tag key-value pairs are returned.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Method 2: Used to query resources in non-default resource groups. The Key is fixed as acs:rm:rgId, and the corresponding Value is the resource group ID.</p>
         * <ul>
         * <li><p>If Key is set to acs:rm:rgId, Value can only be a non-default resource group ID. If the specified resource group ID is the default resource group, an error message is returned.</p>
         * </li>
         * <li><p>If Key is set to acs:rm:rgId, you cannot specify other tag key-value pairs. If you query resources corresponding to both resource groups and tags by using multiple Tag.N parameters at the same time, an error message is returned.</p>
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
         * <p>The tag value used for exact match when querying ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>When Key is set to acs:rm:rgId, this parameter can only be set to a resource group ID, and the resource group ID cannot be the default resource group.</p>
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
         * <p>The tag key used for fuzzy match when querying ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.</p>
         * <p>TagFilter.N is used to fuzzy query ECS resources bound to specific tags. It consists of a key and one or more values. Fuzzy queries may have a delay of 2 seconds and only support scenarios where the number of resources after fuzzy filtering is less than or equal to 5,000.</p>
         * <ul>
         * <li><p>When you fuzzy query ECS resources by tag key (TagFilter.N.TagKey), the tag value (TagFilter.N.TagValues.N) must be empty. For example, to fuzzy search for ECS resources with the tag key environment, you can set TagFilter.1.TagKey to env* (prefix match), <em>env</em> (infix match), or env (exact match), and TagFilter.1.TagValues must be empty.</p>
         * </li>
         * <li><p>When you fuzzy query ECS resources by tag value (TagFilter.N.TagValues.N), the tag key (TagFilter.N.TagKey) must be set to an exact value. For example, to fuzzy search for ECS resources with the tag key env and the tag value product, you must set TagFilter.1.TagKey exactly to env, and you can set TagFilter.1.TagValues.1 to proc* (prefix match), <em>proc</em> (infix match), or proc (exact match). You can use only one search method under the same TagKey. If multiple different search methods are set, the first method prevails.</p>
         * </li>
         * <li><p>Tag keys have an intersection relationship. Only ECS resources that meet all the specified tag keys are returned.</p>
         * </li>
         * <li><p>Tag values under the same tag key have a union relationship. ECS resources that meet any of the specified tag values for the tag key are returned.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You cannot use TagFilter.N and Tag.N at the same time. Otherwise, an error message is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value used for fuzzy match when querying ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 5. For the specific metric description, see the description of the TagFilter.N.TagKey parameter.</p>
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
