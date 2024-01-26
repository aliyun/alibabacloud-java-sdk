// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusAlertTemplatesResponseBody body;

    public static ListPrometheusAlertTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertTemplatesResponse self = new ListPrometheusAlertTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusAlertTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusAlertTemplatesResponse setBody(ListPrometheusAlertTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusAlertTemplatesResponseBody getBody() {
        return this.body;
    }

}
