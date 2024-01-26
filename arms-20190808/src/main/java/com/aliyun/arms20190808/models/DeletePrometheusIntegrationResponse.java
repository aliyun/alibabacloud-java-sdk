// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusIntegrationResponseBody body;

    public static DeletePrometheusIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusIntegrationResponse self = new DeletePrometheusIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusIntegrationResponse setBody(DeletePrometheusIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

}
