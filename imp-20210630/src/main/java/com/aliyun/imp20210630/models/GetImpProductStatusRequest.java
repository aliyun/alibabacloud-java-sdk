// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetImpProductStatusRequest extends TeaModel {
    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static GetImpProductStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImpProductStatusRequest self = new GetImpProductStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetImpProductStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
