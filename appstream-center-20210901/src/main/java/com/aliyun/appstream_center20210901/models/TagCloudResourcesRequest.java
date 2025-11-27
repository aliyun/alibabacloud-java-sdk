// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. You can specify up to 50 resource IDs. You do not need to specify this parameter if you set ResourceType to AliUid.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the cloud resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CenterImageId: center image ID.</li>
     * <li>AppId: app ID.</li>
     * <li>WyId: Alibaba Cloud Workspace user ID.</li>
     * <li>AppInstanceGroupId: delivery group ID.</li>
     * <li>AliUid: tenant ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to remove from the cloud resources. System and custom tags are supported.</p>
     * <ul>
     * <li><p>Valid values for system tags:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: canary tags.</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tags used to stop new users bound to the delivery group from establishing a connection.</li>
     * </ul>
     * </li>
     * <li><p>You can create up to 20 custom tags.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each tag key on a resource can have only one tag value. If you create a tag that has the same key as an existing tag, the value of the existing tag is overwritten.</p>
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
         * <p>The key of a tag. The value must be 1 to 128 characters in length and is case-sensitive. The name must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. The value must be 1 to 128 characters in length and is case-sensitive. The name must be 1 to 128 characters in length.</p>
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
