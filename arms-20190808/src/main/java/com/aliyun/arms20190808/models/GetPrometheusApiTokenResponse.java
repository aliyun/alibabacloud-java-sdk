// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Token")
    @Validation(required = true)
    public String token;

    public static GetPrometheusApiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenResponse self = new GetPrometheusApiTokenResponse();
        return TeaModel.build(map, self);
    }

}
