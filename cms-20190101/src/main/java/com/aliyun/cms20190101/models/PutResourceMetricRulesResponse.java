// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutResourceMetricRulesResponseBody body;

    public static PutResourceMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesResponse self = new PutResourceMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutResourceMetricRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutResourceMetricRulesResponse setBody(PutResourceMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public PutResourceMetricRulesResponseBody getBody() {
        return this.body;
    }

}
