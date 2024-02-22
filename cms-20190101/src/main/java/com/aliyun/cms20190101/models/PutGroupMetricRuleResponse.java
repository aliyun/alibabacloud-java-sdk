// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutGroupMetricRuleResponseBody body;

    public static PutGroupMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleResponse self = new PutGroupMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutGroupMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutGroupMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutGroupMetricRuleResponse setBody(PutGroupMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutGroupMetricRuleResponseBody getBody() {
        return this.body;
    }

}
