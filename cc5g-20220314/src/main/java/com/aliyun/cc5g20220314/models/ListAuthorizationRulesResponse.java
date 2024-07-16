// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationRulesResponseBody body;

    public static ListAuthorizationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesResponse self = new ListAuthorizationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationRulesResponse setBody(ListAuthorizationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

}
