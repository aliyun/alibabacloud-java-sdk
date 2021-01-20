// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutResourceMetricRuleResponse setBody(PutResourceMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutResourceMetricRuleResponseBody getBody() {
        return this.body;
    }

}
