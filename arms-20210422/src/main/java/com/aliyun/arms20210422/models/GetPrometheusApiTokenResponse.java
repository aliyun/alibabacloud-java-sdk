// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetPrometheusApiTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrometheusApiTokenResponseBody body;

    public static GetPrometheusApiTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusApiTokenResponse self = new GetPrometheusApiTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusApiTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusApiTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusApiTokenResponse setBody(GetPrometheusApiTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusApiTokenResponseBody getBody() {
        return this.body;
    }

}
