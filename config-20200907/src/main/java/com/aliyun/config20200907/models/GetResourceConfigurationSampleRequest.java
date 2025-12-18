// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MockOnly")
    public String mockOnly;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceConfigurationSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationSampleRequest self = new GetResourceConfigurationSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationSampleRequest setMockOnly(String mockOnly) {
        this.mockOnly = mockOnly;
        return this;
    }
    public String getMockOnly() {
        return this.mockOnly;
    }

    public GetResourceConfigurationSampleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
