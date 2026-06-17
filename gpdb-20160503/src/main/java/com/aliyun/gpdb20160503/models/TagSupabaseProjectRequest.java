// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TagSupabaseProjectRequest extends TeaModel {
    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the instances. You can specify up to 50 instance IDs.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set this parameter to <code>instance</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags to add. You can specify up to 20 tags.</p>
     */
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
         * <p>The tag key. The key cannot be empty and can be up to 64 characters long. It cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be empty or up to 128 characters long. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
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
