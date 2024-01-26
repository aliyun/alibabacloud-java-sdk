// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrometheusMonitoringResponseBody body;

    public static DeletePrometheusMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusMonitoringResponse self = new DeletePrometheusMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusMonitoringResponse setBody(DeletePrometheusMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

}
