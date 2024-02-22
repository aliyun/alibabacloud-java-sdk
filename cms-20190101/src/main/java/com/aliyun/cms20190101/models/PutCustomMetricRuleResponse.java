// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutCustomMetricRuleResponseBody body;

    public static PutCustomMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRuleResponse self = new PutCustomMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutCustomMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutCustomMetricRuleResponse setBody(PutCustomMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomMetricRuleResponseBody getBody() {
        return this.body;
    }

}
