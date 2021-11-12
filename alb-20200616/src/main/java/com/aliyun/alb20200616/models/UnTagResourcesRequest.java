// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    // 资源实例Id
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 标签列表
    @NameInMap("Tag")
    public java.util.List<UnTagResourcesRequestTag> tag;

    // 标签键列表
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
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
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
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
