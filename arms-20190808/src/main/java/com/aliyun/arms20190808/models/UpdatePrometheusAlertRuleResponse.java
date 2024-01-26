// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusAlertRuleResponseBody body;

    public static UpdatePrometheusAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusAlertRuleResponse self = new UpdatePrometheusAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusAlertRuleResponse setBody(UpdatePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
