// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. This parameter is not required when the resource type is tenant ID.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The cloud resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags. System tags and custom tags are supported.</p>
     * <ul>
     * <li><p>System tag enum values:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: grayscale tag.</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tag that prevents new users bound to the app instance group from establishing connections.</li>
     * </ul>
     * </li>
     * <li><p>Custom tags: A maximum of 20 custom tags can be created.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>A tag key on a resource can map to only one tag value. If you add a tag with an existing key, the tag value is updated to the new value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public java.util.List<TagCloudResourcesRequestTags> tags;

    public static TagCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagCloudResourcesRequest self = new TagCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagCloudResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public TagCloudResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagCloudResourcesRequest setTags(java.util.List<TagCloudResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagCloudResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class TagCloudResourcesRequestTags extends TeaModel {
        /**
         * <p>The tag key. It is case-sensitive and must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. It is case-sensitive and must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720p</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagCloudResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagCloudResourcesRequestTags self = new TagCloudResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public TagCloudResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagCloudResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
