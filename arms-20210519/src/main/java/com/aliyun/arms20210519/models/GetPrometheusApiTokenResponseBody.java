// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponseBody extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPrometheusApiTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenResponseBody self = new GetPrometheusApiTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusApiTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetPrometheusApiTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
