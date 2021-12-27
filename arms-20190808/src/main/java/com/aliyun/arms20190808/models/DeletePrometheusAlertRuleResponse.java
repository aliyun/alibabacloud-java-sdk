// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeletePrometheusAlertRuleResponse setBody(DeletePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
