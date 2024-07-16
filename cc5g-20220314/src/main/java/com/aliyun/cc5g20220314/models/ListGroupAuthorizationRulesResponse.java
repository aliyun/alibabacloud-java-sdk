// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupAuthorizationRulesResponseBody body;

    public static ListGroupAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAuthorizationRulesResponse self = new ListGroupAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupAuthorizationRulesResponse setBody(ListGroupAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
