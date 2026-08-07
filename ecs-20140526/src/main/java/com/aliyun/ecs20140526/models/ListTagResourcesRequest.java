// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token used to start the next query.</p>
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
     * <p>The region ID of the resource. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ECS resource ID. Valid values of N: 1 to 50.</p>
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
     * <li>instance: ECS instance.</li>
     * <li>disk: cloud disk.</li>
     * <li>snapshot: snapshot.</li>
     * <li>image: image.</li>
     * <li>securitygroup: security group.</li>
     * <li>volume: storage volume.</li>
     * <li>eni: Elastic Network Interface (ENI).</li>
     * <li>ddh: dedicated host.</li>
     * <li>ddhcluster: dedicated host cluster.</li>
     * <li>keypair: SSH key pair.</li>
     * <li>launchtemplate: launch template.</li>
     * <li>reservedinstance: reserved instance.</li>
     * <li>snapshotpolicy: automatic snapshot policy.</li>
     * <li>elasticityassurance: elasticity assurance.</li>
     * <li>capacityreservation: capacity reservation.</li>
     * <li>command: Cloud Assistant command.</li>
     * <li>invocation: Cloud Assistant command execution or file sending result.</li>
     * <li>activation: Cloud Assistant managed instance activation code.</li>
     * <li>managedinstance: Cloud Assistant managed instance.</li>
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
     * <p>The tag filter rules.</p>
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
         * <p>The tag key used to perform an exact search for ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <p>Usage notes of the <code>Tag.N</code> parameter:</p>
         * <ul>
         * <li><p>Method 1: Used to perform an exact search for ECS resources that have the specified tags bound. Each tag is a key-value pair.</p>
         * <ul>
         * <li><p>If you specify only <code>Tag.N.Key</code>, all resources associated with the tag key are returned.</p>
         * </li>
         * <li><p>If you specify only <code>Tag.N.Value</code>, the <code>InvalidParameter.TagValue</code> error is returned.</p>
         * </li>
         * <li><p>If you specify multiple tag key-value pairs at the same time, only ECS resources that match all the specified tag key-value pairs are returned.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Method 2: Used to query resource information in non-default resource groups. Set <code>Key</code> to <code>acs:rm:rgId</code> and set the corresponding <code>Value</code> to the resource group ID.</p>
         * <ul>
         * <li><p>If <code>Key</code> is set to <code>acs:rm:rgId</code>, <code>Value</code> can only be set to a non-default resource group ID. If the specified resource group ID is the default resource group, an error message is returned.</p>
         * </li>
         * <li><p>If <code>Key</code> is set to <code>acs:rm:rgId</code>, you cannot specify other tag key-value pairs. If you use multiple <code>Tag.N</code> parameters to query resources by resource group and tags at the same time, an error message is returned.</p>
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
         * <p>The tag value used to perform an exact search for ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>If <code>Key=acs:rm:rgId</code>, this parameter can only be set to a resource group ID, and the resource group ID cannot be the default resource group.</p>
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
         * <p>The tag key used to perform a fuzzy search for ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.</p>
         * <p><code>TagFilter.N</code> is used to perform a fuzzy search for ECS resources that have the specified tags bound. It consists of a key and one or more values. A fuzzy search may have a latency of up to 2 seconds and supports only scenarios where the number of resources after fuzzy filtering is less than or equal to 5,000.</p>
         * <ul>
         * <li><p>When you perform a fuzzy search for ECS resources by tag key (<code>TagFilter.N.TagKey</code>), the tag value (<code>TagFilter.N.TagValues.N</code>) must be empty. For example, to perform a fuzzy search for ECS resources whose tag key is <code>environment</code>, you can set <code>TagFilter.1.TagKey</code> to <code>env*</code> (prefix match), <code>*env*</code> (infix match), or <code>env</code> (exact match), and <code>TagFilter.1.TagValues</code> must be empty.</p>
         * </li>
         * <li><p>When you perform a fuzzy search for ECS resources by tag value (<code>TagFilter.N.TagValues.N</code>), the tag key (<code>TagFilter.N.TagKey</code>) must be set to an exact value. For example, to perform a fuzzy search for ECS resources whose tag key is <code>env</code> and tag value is <code>product</code>, <code>TagFilter.1.TagKey</code> must be set to the exact value <code>env</code>, and <code>TagFilter.1.TagValues.1</code> can be set to <code>proc*</code> (prefix match), <code>*proc*</code> (infix match), or <code>proc</code> (exact match). Only one search method can be used for the same <code>TagKey</code>. If multiple search methods are specified, the first method takes precedence.</p>
         * </li>
         * <li><p>Tag keys have an AND relationship. Only ECS resources that match all specified tag keys are returned.</p>
         * </li>
         * <li><p>Tag values under the same tag key have an OR relationship. ECS resources that match any of the tag values specified for a tag key are returned.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The <code>TagFilter.N</code> and <code>Tag.N</code> parameters cannot be used at the same time. Otherwise, an error message is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value used to perform a fuzzy search for ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 5. For the metric description, see the <code>TagFilter.N.TagKey</code> parameter description.</p>
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
