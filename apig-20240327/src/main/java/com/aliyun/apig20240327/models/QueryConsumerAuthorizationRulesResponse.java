// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class QueryConsumerAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConsumerAuthorizationRulesResponseBody body;

    public static QueryConsumerAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerAuthorizationRulesResponse self = new QueryConsumerAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConsumerAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConsumerAuthorizationRulesResponse setBody(QueryConsumerAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConsumerAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
