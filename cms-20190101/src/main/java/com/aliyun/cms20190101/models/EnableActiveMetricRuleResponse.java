// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableActiveMetricRuleResponseBody body;

    public static EnableActiveMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableActiveMetricRuleResponse self = new EnableActiveMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableActiveMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableActiveMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableActiveMetricRuleResponse setBody(EnableActiveMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

}
