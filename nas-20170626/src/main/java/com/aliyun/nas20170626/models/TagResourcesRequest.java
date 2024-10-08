// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. Valid values of N: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03e08484f0</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set the value to filesystem.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filesystem</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The details about the tags.</p>
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
         * <p>The key of tag N to add to the resource.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The tag key cannot be left empty.</li>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>The tag key must be 1 to 128 characters in length.</li>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nastest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>The tag value must be 1 to 128 characters in length.</li>
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
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
