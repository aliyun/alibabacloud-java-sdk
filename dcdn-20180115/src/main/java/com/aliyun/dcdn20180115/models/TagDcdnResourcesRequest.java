// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class TagDcdnResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<TagDcdnResourcesRequestTag> tag;

    public static TagDcdnResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagDcdnResourcesRequest self = new TagDcdnResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagDcdnResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagDcdnResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagDcdnResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagDcdnResourcesRequest setTag(java.util.List<TagDcdnResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagDcdnResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagDcdnResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagDcdnResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagDcdnResourcesRequestTag self = new TagDcdnResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagDcdnResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagDcdnResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
