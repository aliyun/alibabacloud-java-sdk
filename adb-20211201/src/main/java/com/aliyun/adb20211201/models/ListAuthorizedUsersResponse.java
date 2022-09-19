// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizedUsersResponseBody body;

    public static ListAuthorizedUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersResponse self = new ListAuthorizedUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedUsersResponse setBody(ListAuthorizedUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedUsersResponseBody getBody() {
        return this.body;
    }

}
