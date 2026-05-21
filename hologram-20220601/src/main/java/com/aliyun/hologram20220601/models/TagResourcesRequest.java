// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <strong>example:</strong>
     * <p>1062017779051424</p>
     */
    @NameInMap("tagOwnerUid")
    public Long tagOwnerUid;

    @NameInMap("tags")
    public java.util.List<TagResourcesRequestTags> tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public TagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setTagOwnerUid(Long tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public TagResourcesRequest setTags(java.util.List<TagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class TagResourcesRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>any_string</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>any_string</p>
         */
        @NameInMap("value")
        public String value;

        public static TagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTags self = new TagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
