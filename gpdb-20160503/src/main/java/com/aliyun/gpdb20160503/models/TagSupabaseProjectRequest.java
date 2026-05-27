// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TagSupabaseProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<TagSupabaseProjectRequestTag> tag;

    public static TagSupabaseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        TagSupabaseProjectRequest self = new TagSupabaseProjectRequest();
        return TeaModel.build(map, self);
    }

    public TagSupabaseProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagSupabaseProjectRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagSupabaseProjectRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagSupabaseProjectRequest setTag(java.util.List<TagSupabaseProjectRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagSupabaseProjectRequestTag> getTag() {
        return this.tag;
    }

    public static class TagSupabaseProjectRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagSupabaseProjectRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagSupabaseProjectRequestTag self = new TagSupabaseProjectRequestTag();
            return TeaModel.build(map, self);
        }

        public TagSupabaseProjectRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagSupabaseProjectRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
