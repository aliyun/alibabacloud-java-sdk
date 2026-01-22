// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupInput extends TeaModel {
    @NameInMap("newResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceType")
    public String resourceType;

    public static ChangeResourceGroupInput build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupInput self = new ChangeResourceGroupInput();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupInput setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ChangeResourceGroupInput setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceGroupInput setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
