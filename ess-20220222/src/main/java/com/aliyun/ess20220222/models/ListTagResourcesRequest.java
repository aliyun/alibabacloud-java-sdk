// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource. You can call the <a href="https://help.aliyun.com/document_detail/2679950.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the Auto Scaling resources. You can specify 1 to 50 resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource type. Set the value to scalinggroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Details of the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTagResourcesRequestTags> tags;

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

    public ListTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTags(java.util.List<ListTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListTagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag. The key is used to perform an exact match of Auto Scaling resources. The key must be 1 to 128 characters in length.</p>
         * <p><code>Tags</code> is used to perform an exact match of Auto Scaling resources to which the specified tags are added. Specify a tag in the key-value pair format.</p>
         * <ul>
         * <li>If you specify only <code>Tags.Key</code>, all resources whose tags contain the specified tag key are returned.</li>
         * <li>If you specify only <code>Tags.Value</code>, the <code>MissingParameter.TagKey</code> error is reported.</li>
         * <li>If you specify multiple key-value pairs at the same time, only Auto Scaling resources that match all the tag keys and tag values are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The value is used to perform an exact match of Auto Scaling resources. The value can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTags self = new ListTagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
