// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesForApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationRulesForApplicationResponseBody body;

    public static ListAuthorizationRulesForApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesForApplicationResponse self = new ListAuthorizationRulesForApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesForApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationRulesForApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationRulesForApplicationResponse setBody(ListAuthorizationRulesForApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationRulesForApplicationResponseBody getBody() {
        return this.body;
    }

}
