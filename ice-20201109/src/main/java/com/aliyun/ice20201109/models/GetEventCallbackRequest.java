// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEventCallbackRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetEventCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventCallbackRequest self = new GetEventCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetEventCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
