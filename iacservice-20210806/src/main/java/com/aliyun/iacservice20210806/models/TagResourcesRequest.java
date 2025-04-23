// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
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

    public TagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTags(java.util.List<TagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class TagResourcesRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

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
