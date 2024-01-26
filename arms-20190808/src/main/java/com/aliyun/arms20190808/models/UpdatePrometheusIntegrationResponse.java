// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusIntegrationResponseBody body;

    public static UpdatePrometheusIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusIntegrationResponse self = new UpdatePrometheusIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusIntegrationResponse setBody(UpdatePrometheusIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

}
