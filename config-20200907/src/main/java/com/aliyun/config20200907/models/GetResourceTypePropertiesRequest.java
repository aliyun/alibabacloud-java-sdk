// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceTypePropertiesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceTypePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypePropertiesRequest self = new GetResourceTypePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypePropertiesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
