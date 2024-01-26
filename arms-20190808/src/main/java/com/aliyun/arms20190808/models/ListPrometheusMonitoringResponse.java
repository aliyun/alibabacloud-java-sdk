// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusMonitoringResponseBody body;

    public static ListPrometheusMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusMonitoringResponse self = new ListPrometheusMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusMonitoringResponse setBody(ListPrometheusMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

}
