// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveAggregateConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactiveAggregateConfigRulesResponseBody body;

    public static DeactiveAggregateConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveAggregateConfigRulesResponse self = new DeactiveAggregateConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveAggregateConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactiveAggregateConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactiveAggregateConfigRulesResponse setBody(DeactiveAggregateConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveAggregateConfigRulesResponseBody getBody() {
        return this.body;
    }

}
