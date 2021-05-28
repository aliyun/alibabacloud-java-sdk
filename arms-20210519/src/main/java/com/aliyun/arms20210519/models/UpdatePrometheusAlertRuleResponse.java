// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdatePrometheusAlertRuleResponse setBody(UpdatePrometheusAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

}
