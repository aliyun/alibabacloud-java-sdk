// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. This parameter is not required when the resource type is tenant ID.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tag keys. Both system tags and custom tags are supported. A maximum of 10 tag keys can be passed.</p>
     * <p>Valid values for system tags:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: Canary release tag.</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: Tag that prevents new users bound to the delivery group from establishing connections.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    public static UntagCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagCloudResourcesRequest self = new UntagCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagCloudResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UntagCloudResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagCloudResourcesRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
