// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class TagResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static TagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponse self = new TagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TagResourcesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTagResourcesResponseTagResourcesTagResource extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        public static ListTagResourcesResponseTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseTagResourcesTagResource self = new ListTagResourcesResponseTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListTagResourcesResponseTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListTagResourcesResponseTagResources extends TeaModel {
        @NameInMap("TagResource")
        @Validation(required = true)
        public java.util.List<ListTagResourcesResponseTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseTagResources self = new ListTagResourcesResponseTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseTagResources setTagResource(java.util.List<ListTagResourcesResponseTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
