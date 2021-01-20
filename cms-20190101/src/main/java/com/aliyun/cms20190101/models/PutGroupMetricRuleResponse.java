// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutGroupMetricRuleResponse setBody(PutGroupMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutGroupMetricRuleResponseBody getBody() {
        return this.body;
    }

}
