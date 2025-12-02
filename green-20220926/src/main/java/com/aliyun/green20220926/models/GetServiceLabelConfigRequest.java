// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetServiceLabelConfigRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service code.</p>
     * 
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetServiceLabelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLabelConfigRequest self = new GetServiceLabelConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLabelConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceLabelConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetServiceLabelConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
