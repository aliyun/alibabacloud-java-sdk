// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Returns the location of the data that was read. Empty indicates that the data has been read.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the tag. Contains the resource ID, resource type, and tag key-value information.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<TagResources> tagResources;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(java.util.List<TagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<TagResources> getTagResources() {
        return this.tagResources;
    }

    public ListTagResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class TagResources extends TeaModel {
        /**
         * <p>Indicates the ID of a resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key of the ENI.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the ENI.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static TagResources build(java.util.Map<String, ?> map) throws Exception {
            TagResources self = new TagResources();
            return TeaModel.build(map, self);
        }

        public TagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public TagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public TagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
