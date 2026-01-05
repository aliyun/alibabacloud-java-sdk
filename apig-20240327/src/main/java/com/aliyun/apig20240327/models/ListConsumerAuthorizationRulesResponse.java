// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerAuthorizationRulesResponseBody body;

    public static ListConsumerAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerAuthorizationRulesResponse self = new ListConsumerAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerAuthorizationRulesResponse setBody(ListConsumerAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
