// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagCloudResourcesRequest extends TeaModel {
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
