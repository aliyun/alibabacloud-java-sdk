// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about resource tags.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesResponseBodyTagResources tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(ListTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key of the resource.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTagResource self = new ListTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
