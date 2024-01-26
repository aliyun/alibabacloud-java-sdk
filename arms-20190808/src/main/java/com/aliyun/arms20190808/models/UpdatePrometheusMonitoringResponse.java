// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusMonitoringResponseBody body;

    public static UpdatePrometheusMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusMonitoringResponse self = new UpdatePrometheusMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusMonitoringResponse setBody(UpdatePrometheusMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

}
