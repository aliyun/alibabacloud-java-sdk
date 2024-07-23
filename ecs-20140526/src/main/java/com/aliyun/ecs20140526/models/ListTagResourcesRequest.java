// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
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
     * <p>The resource IDs. Valid values of N: 1 to 50.</p>
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
     * <li>disk: disk</li>
     * <li>snapshot: snapshot</li>
     * <li>image: image</li>
     * <li>securitygroup: security group</li>
     * <li>volume: storage volume</li>
     * <li>eni: elastic network interface (ENI)</li>
     * <li>ddh: dedicated host</li>
     * <li>ddhcluster: dedicated host cluster</li>
     * <li>keypair: SSH key pair</li>
     * <li>launchtemplate: launch template</li>
     * <li>reservedinstance: reserved instance</li>
     * <li>snapshotpolicy: automatic snapshot policy</li>
     * <li>elasticityassurance: elasticity assurance</li>
     * <li>capacityreservation: capacity reservation</li>
     * <li>command: Cloud Assistant command</li>
     * <li>invocation: Cloud Assistant command execution result or file delivery result</li>
     * <li>activation: activation code for a Cloud Assistant managed instance</li>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    /**
     * <p>The regular expressions used to filter tags.</p>
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
         * <p>The key of tag N used for exact search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <p>Methods of using the <code>Tag.N</code> parameter pair (Tag.N.Key and Tag.N.Value):</p>
         * <ul>
         * <li><p>Method 1: Use this parameter pair for exact search of ECS resources that have specified tags added. Each tag is a key-value pair.</p>
         * <ul>
         * <li>If you specify only <code>Tag.N.Key</code>, all ECS resources whose tags contain the specified tag key are returned.</li>
         * <li>If you specify only <code>Tag.N.Value</code>, the <code>InvalidParameter.TagValue</code> error is returned.</li>
         * <li>If you specify multiple tag key-value pairs, only the ECS resources that have all these tag key-value pairs added are returned.</li>
         * </ul>
         * </li>
         * <li><p>Method 2: Use this parameter pair to query resource information of a non-default resource group. Set <code>Key</code> to <code>acs:rm:rgId</code> and <code>Value</code> to the ID of a resource group.</p>
         * <ul>
         * <li>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you must set <code>Value</code> to the ID of a non-default resource group. If you set Value to the ID of the default resource group, an error message is returned.</li>
         * <li>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you cannot specify other Tag.N parameter pairs. If you specify multiple <code>Tag.N</code> parameter pairs to query resource groups and resources at the same time, an error message is returned.</li>
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
         * <p>The value of tag N used for exact search of ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>When Key is set to <code>acs:rm:rgId</code>, you can set Value only to the ID of a non-default resource group.</p>
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
         * <p>The key of tag N used for fuzzy search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.</p>
         * <p>The <code>TagFilter.N</code> parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) is used for fuzzy search of ECS resources that have specified tags added. In the specified tags, a single tag key may correspond to one or more tag values. Fuzzy search may have a latency of 2 seconds. A fuzzy search can return a result set of entries about a maximum of 5,000 resources.</p>
         * <ul>
         * <li>When you use <code>TagFilter.N.TagKey</code> for fuzzy search of ECS resources, you must leave <code>TagFilter.N.TagValues.N</code> empty. For example, to query ECS resources whose tags contain the <code>environment</code> tag key, you can set <code>TagFilter.1.TagKey</code> to <code>env*</code> for prefix search, <code>*env*</code> for infix search, or <code>env</code> for exact search, but you must leave <code>TagFilter.1.TagValues</code> empty.</li>
         * <li>When you use <code>TagFilter.N.TagValues.N</code> for fuzzy search of ECS resources, you must set <code>TagFilter.N.TagKey</code> to an exact value. For example, to query ECS resources that have a tag composed of the <code>env</code> tag key and the <code>product</code> tag value, you must set <code>TagFilter.1.TagKey</code> to <code>env</code> and can set <code>TagFilter.1.TagValues.1</code> to <code>proc*</code> for prefix search, to <code>*proc*</code> for infix search, or to <code>proc</code> for exact search. Only one of the preceding search methods can be used for each tag key (<code>TagFilter.N.TagKey</code>). If multiple search methods are configured for a tag key, the first search method prevails.</li>
         * <li>If you specify multiple tag keys, only the ECS resources that have all the specified tag keys added are returned.</li>
         * <li>If you specify a tag key that corresponds to multiple tag values, all the ECS resources that have one or more of these tag key-value pairs added are returned.</li>
         * </ul>
         * <blockquote>
         * <p>The <code>TagFilter.N</code> parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) cannot be used together with the <code>Tag.N</code> parameter pair (Tag.N.Key and Tag.N.Value). Otherwise, an error message is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The values of tag N used for fuzzy search of ECS resources. The tag values must be 1 to 128 characters in length. Valid values of N: 1 to 5. For more information, see the description of <code>TagFilter.N.TagKey</code>.</p>
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
