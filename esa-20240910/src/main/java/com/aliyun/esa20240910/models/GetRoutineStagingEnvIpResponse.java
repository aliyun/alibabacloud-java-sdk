// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingEnvIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineStagingEnvIpResponseBody body;

    public static GetRoutineStagingEnvIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineStagingEnvIpResponse self = new GetRoutineStagingEnvIpResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineStagingEnvIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineStagingEnvIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineStagingEnvIpResponse setBody(GetRoutineStagingEnvIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineStagingEnvIpResponseBody getBody() {
        return this.body;
    }

}
