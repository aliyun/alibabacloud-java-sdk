// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusMonitoringStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusMonitoringStatusResponseBody body;

    public static UpdatePrometheusMonitoringStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusMonitoringStatusResponse self = new UpdatePrometheusMonitoringStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusMonitoringStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusMonitoringStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusMonitoringStatusResponse setBody(UpdatePrometheusMonitoringStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusMonitoringStatusResponseBody getBody() {
        return this.body;
    }

}
