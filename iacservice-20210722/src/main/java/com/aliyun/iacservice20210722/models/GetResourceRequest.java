// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class GetResourceRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static GetResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRequest self = new GetResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
