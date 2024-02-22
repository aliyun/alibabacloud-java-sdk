// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableMetricRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMetricRulesResponse setBody(EnableMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMetricRulesResponseBody getBody() {
        return this.body;
    }

}
