// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrometheusMonitoringResponseBody body;

    public static GetPrometheusMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusMonitoringResponse self = new GetPrometheusMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusMonitoringResponse setBody(GetPrometheusMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

}
