// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token required for integrating Prometheus Service.</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetPrometheusApiTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenResponseBody self = new GetPrometheusApiTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusApiTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrometheusApiTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
