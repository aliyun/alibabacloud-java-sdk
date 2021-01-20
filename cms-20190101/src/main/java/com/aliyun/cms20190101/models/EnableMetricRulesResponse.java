// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMetricRulesResponseBody body;

    public static EnableMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRulesResponse self = new EnableMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public EnableMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMetricRulesResponse setBody(EnableMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMetricRulesResponseBody getBody() {
        return this.body;
    }

}
