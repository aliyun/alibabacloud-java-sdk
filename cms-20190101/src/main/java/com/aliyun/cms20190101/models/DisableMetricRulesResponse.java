// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableMetricRulesResponseBody body;

    public static DisableMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMetricRulesResponse self = new DisableMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMetricRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableMetricRulesResponse setBody(DisableMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMetricRulesResponseBody getBody() {
        return this.body;
    }

}
