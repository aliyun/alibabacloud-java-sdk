// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInfomationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCreateCustomerInfomationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInfomationRequest self = new GetCreateCustomerInfomationRequest();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInfomationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
