// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static GetPrometheusApiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenRequest self = new GetPrometheusApiTokenRequest();
        return TeaModel.build(map, self);
    }

}
