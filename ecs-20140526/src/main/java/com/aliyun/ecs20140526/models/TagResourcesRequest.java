// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The IDs of resources. You can specify up to 50 resource IDs.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // The type of the resource. Valid values:
    // 
    // *   instance: ECS instance
    // *   disk: disk
    // *   snapshot: snapshot
    // *   image: image
    // *   securitygroup: security group
    // *   volume: storage volume
    // *   eni: elastic network interface (ENI)
    // *   ddh: dedicated host
    // *   ddhcluster: dedicated host cluster
    // *   keypair: SSH key pair
    // *   launchtemplate: launch template
    // *   reservedinstance: reserved instance
    // *   snapshotpolicy: automatic snapshot policy
    // *   elasticityassurance: elasticity assurance
    // *   capacityreservation: capacity reservation
    @NameInMap("ResourceType")
    public String resourceType;

    // The tags that are attached to the resources. You can specify up to 20 tags.
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        // The key of tag N used for exact search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.
        // 
        // Methods of using the `Tag.N` parameter pair (Tag.N.Key and Tag.N.Value):
        // 
        // *   Method 1: Use this parameter pair for exact search of ECS resources that have specified tags added. Each tag is a key-value pair.
        // 
        //     *   If you specify only `Tag.N.Key`, all ECS resources whose tags contain the specified tag key are returned.
        //     *   If you specify only `Tag.N.Value`, the `InvalidParameter.TagValue` error is returned.
        //     *   If you specify multiple tag key-value pairs, only the ECS resources that have all these tag key-value pairs added are returned.
        // 
        // *   Method 2: Use this parameter pair to query resource information of a non-default resource group. Set `Tag.1.Key` to `acs:rm:rgId` and `Tag.1.Value` to the ID of a resource group.
        // 
        //     *   If you set `Tag.1.Key` to `acs:rm:rgId`, you must set `Tag.1.Value` to the ID of a non-default resource group. If you set Tag.1.Value to the ID of the default resource group, an error message is returned.
        //     *   If you set `Tag.1.Key` to `acs:rm:rgId`, you cannot specify other Tag.N parameter pairs. If you specify multiple `Tag.N` parameter pairs to query resource groups and resource tags at the same time, an error message is returned.
        @NameInMap("Key")
        public String key;

        // The value of tag N used for exact search of ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.
        // 
        // >  When Tag.1.Key is set to `acs:rm:rgId`, you can set Tag.1.Value only to the ID of a non-default resource group.
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
        // The key of tag N used for fuzzy search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.
        // 
        // The `TagFilter.N` parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) is used for fuzzy search of ECS resources that have specified tags added. In the specified tags, a single tag key may correspond to one or more tag values. Fuzzy search may have a latency of 2 seconds. A fuzzy search can return a result set of entries about up to 5,000 resources.
        // 
        // *   When you use `TagFilter.N.TagKey` for fuzzy search of ECS resources, you must leave `TagFilter.N.TagValues.N` empty. For example, to query ECS resources whose tags contain the `environment` tag key, you can set `TagFilter.1.TagKey` to `env*` for prefix search, `*env*` for infix search, or `env` for exact search, but you must leave `TagFilter.1.TagValues` empty.
        // *   When you use `TagFilter.N.TagValues.N` for fuzzy search of ECS resources, you must set `TagFilter.N.TagKey` to an exact value. For example, to query ECS resources that have a tag consisting of the `env` tag key and the `product` tag value, you must set `TagFilter.1.TagKey` to `env` and can set `TagFilter.1.TagValues.1` to `proc*` for prefix search, to `*proc*` for infix search, or to `proc` for exact search. Only one of the preceding search methods can be used for each tag key (`TagFilter.N.TagKey`). If multiple search methods are configured for a tag key, the first search method prevails.
        // *   If you specify multiple tag keys, only the ECS resources that have all of the specified tag keys added are returned.
        // *   If you specify a tag key that corresponds to multiple tag values, all the ECS resources that have one or more of these tag key-value pairs added are returned.
        // 
        // >  The `TagFilter.N` parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) cannot be used together with the `Tag.N` parameter pair (Tag.N.Key and Tag.N.Value). Otherwise, an error message is returned.
        @NameInMap("TagKey")
        public String tagKey;

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

    public static class TagResourcesRequestTag extends TeaModel {
        // The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
