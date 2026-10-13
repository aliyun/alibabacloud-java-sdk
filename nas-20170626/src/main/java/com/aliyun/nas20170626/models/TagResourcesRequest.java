// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. Valid values of array length: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03e08484f0</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>filesystem: file system.</li>
     * <li>accesspoint: access point.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filesystem</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags. Array length: 1 to 20. If the array contains multiple tag objects, the tag key (Key) must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
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

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Cannot be empty or an empty string. </li>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nastest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>filetest</p>
         */
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
