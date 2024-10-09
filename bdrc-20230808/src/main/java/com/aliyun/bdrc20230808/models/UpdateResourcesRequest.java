// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static UpdateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesRequest self = new UpdateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
