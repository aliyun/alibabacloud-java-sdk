// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. You do not need to specify this parameter when the resource type is tenant ID.</p>
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
     * <li><p>System tag enumeration values:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: canary release tag</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tag that prevents new user connections from being established for the delivery group</li>
     * </ul>
     * </li>
     * <li><p>Custom tags: A maximum of 20 custom tags can be created.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each tag key on the same resource can have only one tag value. If you add a tag key that already exists, the corresponding tag value is updated to the new value.</p>
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
         * <p>The tag key. This parameter is case-sensitive. The tag key must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter is case-sensitive. The tag value must be 1 to 128 characters in length.</p>
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
