// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BindPrometheusGrafanaInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPrometheusGrafanaInstanceResponseBody body;

    public static BindPrometheusGrafanaInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPrometheusGrafanaInstanceResponse self = new BindPrometheusGrafanaInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindPrometheusGrafanaInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPrometheusGrafanaInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPrometheusGrafanaInstanceResponse setBody(BindPrometheusGrafanaInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPrometheusGrafanaInstanceResponseBody getBody() {
        return this.body;
    }

}
