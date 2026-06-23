// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationServersResponseBody body;

    public static ListAuthorizationServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationServersResponse self = new ListAuthorizationServersResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationServersResponse setBody(ListAuthorizationServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationServersResponseBody getBody() {
        return this.body;
    }

}
