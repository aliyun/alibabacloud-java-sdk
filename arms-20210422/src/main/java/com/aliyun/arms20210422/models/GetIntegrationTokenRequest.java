// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetIntegrationTokenRequest extends TeaModel {
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RegionId")
    public String regionId;

    public static GetIntegrationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationTokenRequest self = new GetIntegrationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegrationTokenRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetIntegrationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
