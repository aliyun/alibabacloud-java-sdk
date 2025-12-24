// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveTagResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6a5e8f4fae643e70d1a2ff1827cd91bd</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public ListLiveTagResourcesResponseBodyTagResources tagResources;

    public static ListLiveTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTagResourcesResponseBody self = new ListLiveTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLiveTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveTagResourcesResponseBody setTagResources(ListLiveTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListLiveTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListLiveTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-resource-id</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>DOMAIN</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListLiveTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTagResourcesResponseBodyTagResourcesTagResource self = new ListLiveTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListLiveTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListLiveTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListLiveTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListLiveTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListLiveTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListLiveTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListLiveTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTagResourcesResponseBodyTagResources self = new ListLiveTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListLiveTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListLiveTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListLiveTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
