// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the resource.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/601478.html">DescribeRegions</a> to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources to which you want to add tags. You can enter a maximum of 50 resource IDs.</p>
     * <p>Enter multiple resource IDs in the <code>[&quot;ResourceId. 1&quot;,&quot;ResourceId. 2&quot;,...]</code> format.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource to which you want to add tags. Valid values:</p>
     * <ul>
     * <li>key</li>
     * <li>secret</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags. You can enter up to 20 tags.</p>
     * <p>A tag consists of a key-value pair. Enter multiple tags in the <code>[{&quot;Key&quot;:&quot;key1&quot;,&quot;Value&quot;:&quot;value1&quot;},{&quot;Key&quot;:&quot;key2&quot;,&quot;Value&quot;:&quot;value2&quot;},..]</code> format.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

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
         * <p>The key of the tag. A tag consists of a key-value pair.</p>
         * <p>You can enter up to 20 tags. Enter multiple tags in the <code>[{&quot;Key&quot;:&quot;key1&quot;,&quot;Value&quot;:&quot;value1&quot;},{&quot;Key&quot;:&quot;key2&quot;,&quot;Value&quot;:&quot;value2&quot;},..]</code> format.</p>
         * <p>Each key can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
         * <blockquote>
         * <p> The key cannot start with aliyun or acs:.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>disk-encryption</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. A tag consists of a key-value pair.</p>
         * <p>You can enter up to 20 tags. Enter multiple tags in the <code>[{&quot;Key&quot;:&quot;key1&quot;,&quot;Value&quot;:&quot;value1&quot;},{&quot;Key&quot;:&quot;key2&quot;,&quot;Value&quot;:&quot;value2&quot;},..]</code> format.</p>
         * <p>Each value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
