// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class TagDcdnResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the resource. Valid values of N: **1** to **50**.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Set the value to **DOMAIN**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagDcdnResourcesRequestTag> tag;

    public static TagDcdnResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagDcdnResourcesRequest self = new TagDcdnResourcesRequest();
        return TeaModel.build(map, self);
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
        /**
         * <p>The key of the tag. Valid values of N: **1** to **20**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. Valid values of N: **1** to **20**.</p>
         */
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
