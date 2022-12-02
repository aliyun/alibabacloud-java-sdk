// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static ChangeResourceManagerResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceManagerResourceGroupRequest self = new ChangeResourceManagerResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceManagerResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceManagerResourceGroupRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ChangeResourceManagerResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
