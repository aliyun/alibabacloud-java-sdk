// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetArmsConsoleUrlRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetArmsConsoleUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArmsConsoleUrlRequest self = new GetArmsConsoleUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetArmsConsoleUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
