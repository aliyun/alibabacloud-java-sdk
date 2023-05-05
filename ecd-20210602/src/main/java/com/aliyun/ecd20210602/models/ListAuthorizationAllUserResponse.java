// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationAllUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationAllUserResponseBody body;

    public static ListAuthorizationAllUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationAllUserResponse self = new ListAuthorizationAllUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationAllUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationAllUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationAllUserResponse setBody(ListAuthorizationAllUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationAllUserResponseBody getBody() {
        return this.body;
    }

}
