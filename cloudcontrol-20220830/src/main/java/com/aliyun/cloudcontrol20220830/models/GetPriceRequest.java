// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetPriceRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceAttributes")
    public java.util.Map<String, ?> resourceAttributes;

    public static GetPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceRequest self = new GetPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPriceRequest setResourceAttributes(java.util.Map<String, ?> resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public java.util.Map<String, ?> getResourceAttributes() {
        return this.resourceAttributes;
    }

}
