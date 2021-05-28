// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePrometheusAlertRuleResponseBody body;

    public static CreatePrometheusAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusAlertRuleResponse self = new CreatePrometheusAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrometheusAlertRuleResponse setBody(CreatePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
