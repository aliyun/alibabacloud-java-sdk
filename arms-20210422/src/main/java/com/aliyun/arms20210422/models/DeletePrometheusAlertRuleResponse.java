// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePrometheusAlertRuleResponseBody body;

    public static DeletePrometheusAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusAlertRuleResponse self = new DeletePrometheusAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrometheusAlertRuleResponse setBody(DeletePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
