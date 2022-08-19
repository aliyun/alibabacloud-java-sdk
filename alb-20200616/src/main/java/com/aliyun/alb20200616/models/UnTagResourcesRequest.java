// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<UnTagResourcesRequestTag> tag;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesRequest setTag(java.util.List<UnTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UnTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public UnTagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public static class UnTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UnTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UnTagResourcesRequestTag self = new UnTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public UnTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UnTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
