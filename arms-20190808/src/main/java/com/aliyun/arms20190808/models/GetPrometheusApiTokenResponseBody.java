// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token required for integrating Prometheus Service.</p>
     * 
     * <strong>example:</strong>
     * <p>6dcbb77ef4ba6ef5466b5debf9e2****</p>
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
