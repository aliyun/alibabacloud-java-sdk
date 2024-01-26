// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrometheusIntegrationResponseBody body;

    public static GetPrometheusIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusIntegrationResponse self = new GetPrometheusIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusIntegrationResponse setBody(GetPrometheusIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

}
