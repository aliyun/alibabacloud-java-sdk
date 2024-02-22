// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableActiveMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableActiveMetricRuleResponseBody body;

    public static DisableActiveMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableActiveMetricRuleResponse self = new DisableActiveMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableActiveMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableActiveMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableActiveMetricRuleResponse setBody(DisableActiveMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

}
