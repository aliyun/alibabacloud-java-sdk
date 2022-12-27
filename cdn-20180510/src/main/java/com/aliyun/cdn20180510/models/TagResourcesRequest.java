// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The list of resource ID.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // The type of resource. The resource type. Set the value to **DOMAIN**.
    @NameInMap("ResourceType")
    public String resourceType;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeTagResourcesRequestTag extends TeaModel {
        // The key of the tag. Valid values of N: **1** to **20**.
        @NameInMap("Key")
        public String key;

        // The value of the tag. Valid values of N: **1** to **20**.
        @NameInMap("Value")
        public String value;

        public static DescribeTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesRequestTag self = new DescribeTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TagResourcesRequestTag extends TeaModel {
        // The key of the tag. Valid values of N: **1** to **20**.
        @NameInMap("Key")
        public String key;

        // The value of the tag. Valid values of N: **1** to **20**.
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
