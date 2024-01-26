// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusIntegrationResponseBody body;

    public static ListPrometheusIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusIntegrationResponse self = new ListPrometheusIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusIntegrationResponse setBody(ListPrometheusIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

}
