// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource IDs. Valid values of N: 1 to 50.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   instance: ECS instance</p>
     * <p>*   disk: disk</p>
     * <p>*   snapshot: snapshot</p>
     * <p>*   image: image</p>
     * <p>*   securitygroup: security group</p>
     * <p>*   volume: storage volume</p>
     * <p>*   eni: ENI</p>
     * <p>*   ddh: dedicated host</p>
     * <p>*   ddhcluster: dedicated host cluster</p>
     * <p>*   keypair: SSH key pair</p>
     * <p>*   launchtemplate: launch template</p>
     * <p>*   reservedinstance: reserved instance</p>
     * <p>*   snapshotpolicy: automatic snapshot policy</p>
     * <p>*   elasticityassurance: elasticity assurance</p>
     * <p>*   capacityreservation: capacity reservation</p>
     * <p>*   command: Cloud Assistant command</p>
     * <p>*   invocation: Cloud Assistant command execution result</p>
     * <br>
     * <p>This parameter is required.</p>
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
         * <br>
         * <p>Methods of using the `Tag.N` parameter pair (Tag.N.Key and Tag.N.Value):</p>
         * <br>
         * <p>*   Method 1: Use this parameter pair for exact search of ECS resources that have specified tags added. Each tag is a key-value pair.</p>
         * <br>
         * <p>    *   If you specify only `Tag.N.Key`, all ECS resources whose tags contain the specified tag key are returned.</p>
         * <p>    *   If you specify only `Tag.N.Value`, the `InvalidParameter.TagValue` error is returned.</p>
         * <p>    *   If you specify multiple tag key-value pairs, only the ECS resources that have all these tag key-value pairs added are returned.</p>
         * <br>
         * <p>*   Method 2: Use this parameter pair to query resource information of a non-default resource group. Set `Key` to `acs:rm:rgId` and `Value` to the ID of a resource group.</p>
         * <br>
         * <p>    *   If you set `Key` to `acs:rm:rgId`, you must set `Value` to the ID of a non-default resource group. If you set Value to the ID of the default resource group, an error message is returned.</p>
         * <p>    *   If you set `Key` to `acs:rm:rgId`, you cannot specify other Tag.N parameter pairs. If you specify multiple `Tag.N` parameter pairs to query resource groups and resources at the same time, an error message is returned.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N used for exact search of ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>> When Key is set to `acs:rm:rgId`, you can set Value only to the ID of a non-default resource group.</p>
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
         * <br>
         * <p>The `TagFilter.N` parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) is used for fuzzy search of ECS resources that have specified tags added. In the specified tags, a single tag key may correspond to one or more tag values. Fuzzy search may have a latency of 2 seconds. A fuzzy search can return a result set of entries about a maximum of 5,000 resources.</p>
         * <br>
         * <p>*   When you use `TagFilter.N.TagKey` for fuzzy search of ECS resources, you must leave `TagFilter.N.TagValues.N` empty. For example, to query ECS resources whose tags contain the `environment` tag key, you can set `TagFilter.1.TagKey` to `env*` for prefix search, `*env*` for infix search, or `env` for exact search, but you must leave `TagFilter.1.TagValues` empty.</p>
         * <p>*   When you use `TagFilter.N.TagValues.N` for fuzzy search of ECS resources, you must set `TagFilter.N.TagKey` to an exact value. For example, to query ECS resources that have a tag composed of the `env` tag key and the `product` tag value, you must set `TagFilter.1.TagKey` to `env` and can set `TagFilter.1.TagValues.1` to `proc*` for prefix search, to `*proc*` for infix search, or to `proc` for exact search. Only one of the preceding search methods can be used for each tag key (`TagFilter.N.TagKey`). If multiple search methods are configured for a tag key, the first search method prevails.</p>
         * <p>*   If you specify multiple tag keys, only the ECS resources that have all the specified tag keys added are returned.</p>
         * <p>*   If you specify a tag key that corresponds to multiple tag values, all the ECS resources that have one or more of these tag key-value pairs added are returned.</p>
         * <br>
         * <p>> The `TagFilter.N` parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) cannot be used together with the `Tag.N` parameter pair (Tag.N.Key and Tag.N.Value). Otherwise, an error message is returned.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The values of tag N used for fuzzy search of ECS resources. The tag values must be 1 to 128 characters in length. Valid values of N: 1 to 5. For more information, see the description of `TagFilter.N.TagKey`.</p>
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
