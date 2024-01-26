// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrometheusMonitoringResponseBody body;

    public static CreatePrometheusMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusMonitoringResponse self = new CreatePrometheusMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrometheusMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrometheusMonitoringResponse setBody(CreatePrometheusMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

}
