// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListClientUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientUsersResponseBody body;

    public static ListClientUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientUsersResponse self = new ListClientUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListClientUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientUsersResponse setBody(ListClientUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientUsersResponseBody getBody() {
        return this.body;
    }

}
