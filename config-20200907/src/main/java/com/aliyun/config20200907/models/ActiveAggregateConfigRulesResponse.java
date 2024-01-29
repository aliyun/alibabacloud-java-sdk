// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveAggregateConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveAggregateConfigRulesResponseBody body;

    public static ActiveAggregateConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveAggregateConfigRulesResponse self = new ActiveAggregateConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ActiveAggregateConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveAggregateConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveAggregateConfigRulesResponse setBody(ActiveAggregateConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveAggregateConfigRulesResponseBody getBody() {
        return this.body;
    }

}
