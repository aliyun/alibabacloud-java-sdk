// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationSampleRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain only mock data, which is not real resource data.
     * Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MockOnly")
    public String mockOnly;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
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
