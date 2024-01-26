// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrometheusIntegrationResponseBody body;

    public static AddPrometheusIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusIntegrationResponse self = new AddPrometheusIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public AddPrometheusIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrometheusIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrometheusIntegrationResponse setBody(AddPrometheusIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

}
