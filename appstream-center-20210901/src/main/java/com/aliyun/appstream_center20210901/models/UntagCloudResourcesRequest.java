// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. You can specify up to 50 resource IDs. You do not need to specify this parameter if you set ResourceType to AliUid.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource from which you want to remove tags.</p>
     * <p>Valid values:</p>
     * <ul>
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
     * <p>The tags that you want to remove from the cloud resources. System and custom tags are supported. You can specify up to 10 tags.</p>
     * <p>Valid values for system tags:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: canary tags.</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tags used to stop new users bound to the delivery group from establishing a connection.</li>
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
