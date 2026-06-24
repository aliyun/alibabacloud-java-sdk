// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. You do not need to specify this parameter when the resource type is tenant ID.</p>
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
     * <p>The list of tags. System tags and custom tags are supported. You can specify up to 10 tags.</p>
     * <p>Enumerated values for system tags:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: canary release tag</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tag that prevents newly bound users in a delivery group from establishing connections.</li>
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
