// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectTagsResponseBody extends TeaModel {
    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<ListSupabaseProjectTagsResponseBodyTagResources> tagResources;

    public static ListSupabaseProjectTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseProjectTagsResponseBody self = new ListSupabaseProjectTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupabaseProjectTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupabaseProjectTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupabaseProjectTagsResponseBody setTagResources(java.util.List<ListSupabaseProjectTagsResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<ListSupabaseProjectTagsResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class ListSupabaseProjectTagsResponseBodyTagResources extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListSupabaseProjectTagsResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListSupabaseProjectTagsResponseBodyTagResources self = new ListSupabaseProjectTagsResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListSupabaseProjectTagsResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSupabaseProjectTagsResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSupabaseProjectTagsResponseBodyTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListSupabaseProjectTagsResponseBodyTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
