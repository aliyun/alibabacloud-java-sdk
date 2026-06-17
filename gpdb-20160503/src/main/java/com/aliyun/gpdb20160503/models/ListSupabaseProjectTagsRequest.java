// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectTagsRequest extends TeaModel {
    /**
     * <p>The token for the next page of results. This token is returned in the <code>NextToken</code> parameter of a previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>ResourceId</code> and <code>Tag</code> parameters.</p>
     * </blockquote>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set the value to <code>instance</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>ResourceId</code> and <code>Tag</code> parameters.</p>
     * </blockquote>
     */
    @NameInMap("Tag")
    public java.util.List<ListSupabaseProjectTagsRequestTag> tag;

    public static ListSupabaseProjectTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseProjectTagsRequest self = new ListSupabaseProjectTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListSupabaseProjectTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseProjectTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSupabaseProjectTagsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListSupabaseProjectTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSupabaseProjectTagsRequest setTag(java.util.List<ListSupabaseProjectTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListSupabaseProjectTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListSupabaseProjectTagsRequestTag extends TeaModel {
        /**
         * <p>The tag key. The key can be 1 to 64 characters in length.</p>
         * <p>The <code>Tag.N</code> parameter specifies a key-value pair to filter Supabase instances.</p>
         * <p>N is an integer from 1 to 20.</p>
         * <ul>
         * <li><p>If you specify only <code>Tag.N.Key</code>, the operation returns all instances that have the specified tag key.</p>
         * </li>
         * <li><p>If you specify only <code>Tag.N.Value</code>, an <code>InvalidParameter.TagValue</code> error is returned.</p>
         * </li>
         * <li><p>If you specify multiple tag key-value pairs, the operation returns only Supabase instances that match all the specified pairs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSupabaseProjectTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListSupabaseProjectTagsRequestTag self = new ListSupabaseProjectTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListSupabaseProjectTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSupabaseProjectTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
