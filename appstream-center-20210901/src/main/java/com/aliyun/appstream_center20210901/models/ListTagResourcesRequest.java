// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The paged query token. You do not need to specify this parameter for the first request. If the previous invoke returned a non-empty NextToken value, pass it in as-is to retrieve subsequent paging results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYRHtOLVQzCYj17y+OP7LZRrUJaF4rnBGQkWwMiVHlLZBB1w3Us37CVvhvyM0TXavA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported.</p>
     * <p>If the resource type is delivery group, specify the delivery group ID (prefixed with <code>aig-</code>). You can call the ListAppInstanceGroup operation to obtain the delivery group ID.</p>
     * <blockquote>
     * <p>Specify at least one of ResourceId.N and Tag.N. If only ResourceId.N is specified, all tags bound to the specified resources are returned.</p>
     * </blockquote>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>APPINSTANCEGROUP: delivery group.</li>
     * </ul>
     * <p>This parameter is case-insensitive. Only this value is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPINSTANCEGROUP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tag conditions. A maximum of 20 tag conditions are supported.</p>
     * <blockquote>
     * <p>Specify at least one of ResourceId.N and Tag.N. Multiple tags have an AND relationship. Only resources that have all specified tags bound are returned.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

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

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key. This parameter is required. The tag key is case-sensitive and must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value is case-sensitive and can be up to 256 characters in length. If this parameter is not specified, the value of the tag key is not restricted, which means any tag value under the key is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>720p</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
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

}
