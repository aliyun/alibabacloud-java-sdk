// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetPriceShrinkRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceAttributes")
    public String resourceAttributesShrink;

    public static GetPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceShrinkRequest self = new GetPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPriceShrinkRequest setResourceAttributesShrink(String resourceAttributesShrink) {
        this.resourceAttributesShrink = resourceAttributesShrink;
        return this;
    }
    public String getResourceAttributesShrink() {
        return this.resourceAttributesShrink;
    }

}
