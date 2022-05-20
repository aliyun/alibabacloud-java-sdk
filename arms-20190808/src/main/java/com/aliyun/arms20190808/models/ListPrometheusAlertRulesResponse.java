// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrometheusAlertRulesResponseBody body;

    public static ListPrometheusAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertRulesResponse self = new ListPrometheusAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusAlertRulesResponse setBody(ListPrometheusAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusAlertRulesResponseBody getBody() {
        return this.body;
    }

}
