// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutCustomMetricRuleResponse setBody(PutCustomMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutCustomMetricRuleResponseBody getBody() {
        return this.body;
    }

}
