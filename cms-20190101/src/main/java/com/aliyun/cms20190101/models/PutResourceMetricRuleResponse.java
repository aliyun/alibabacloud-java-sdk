// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutResourceMetricRuleResponseBody body;

    public static PutResourceMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleResponse self = new PutResourceMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutResourceMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutResourceMetricRuleResponse setBody(PutResourceMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutResourceMetricRuleResponseBody getBody() {
        return this.body;
    }

}
