// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenRequest extends TeaModel {
    // The region ID of the instance.
    @NameInMap("RegionId")
    public String regionId;

    public static GetPrometheusApiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenRequest self = new GetPrometheusApiTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusApiTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
