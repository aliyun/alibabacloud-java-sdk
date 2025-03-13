// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTagCloudResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAYRHtOLVQzCYj17y+OP7LZRrUJaF4rnBGQkWwMiVHlLZBB1w3Us37CVvhvyM0TXavA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTags")
    public java.util.List<ListTagCloudResourcesResponseBodyResourceTags> resourceTags;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagCloudResourcesResponseBody self = new ListTagCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagCloudResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagCloudResourcesResponseBody setResourceTags(java.util.List<ListTagCloudResourcesResponseBodyResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<ListTagCloudResourcesResponseBodyResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    public ListTagCloudResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagCloudResourcesResponseBodyResourceTagsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>1080p</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagCloudResourcesResponseBodyResourceTagsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagCloudResourcesResponseBodyResourceTagsTags self = new ListTagCloudResourcesResponseBodyResourceTagsTags();
            return TeaModel.build(map, self);
        }

        public ListTagCloudResourcesResponseBodyResourceTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagCloudResourcesResponseBodyResourceTagsTags setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListTagCloudResourcesResponseBodyResourceTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTagCloudResourcesResponseBodyResourceTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aig-0001</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>AppInstanceGroupId</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public java.util.List<ListTagCloudResourcesResponseBodyResourceTagsTags> tags;

        public static ListTagCloudResourcesResponseBodyResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagCloudResourcesResponseBodyResourceTags self = new ListTagCloudResourcesResponseBodyResourceTags();
            return TeaModel.build(map, self);
        }

        public ListTagCloudResourcesResponseBodyResourceTags setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagCloudResourcesResponseBodyResourceTags setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagCloudResourcesResponseBodyResourceTags setTags(java.util.List<ListTagCloudResourcesResponseBodyResourceTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTagCloudResourcesResponseBodyResourceTagsTags> getTags() {
            return this.tags;
        }

    }

}
