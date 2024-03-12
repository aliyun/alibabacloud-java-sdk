// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersForApplicationResponseBody body;

    public static ListUsersForApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForApplicationResponse self = new ListUsersForApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersForApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersForApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersForApplicationResponse setBody(ListUsersForApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersForApplicationResponseBody getBody() {
        return this.body;
    }

}
