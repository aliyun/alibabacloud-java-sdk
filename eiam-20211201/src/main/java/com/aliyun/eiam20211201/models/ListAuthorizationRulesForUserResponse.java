// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationRulesForUserResponseBody body;

    public static ListAuthorizationRulesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesForUserResponse self = new ListAuthorizationRulesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationRulesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationRulesForUserResponse setBody(ListAuthorizationRulesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationRulesForUserResponseBody getBody() {
        return this.body;
    }

}
