// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetSupportedResourceRelationConfigRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetSupportedResourceRelationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceRelationConfigRequest self = new GetSupportedResourceRelationConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceRelationConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
