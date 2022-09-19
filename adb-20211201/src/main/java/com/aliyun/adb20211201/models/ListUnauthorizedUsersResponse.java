// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListUnauthorizedUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUnauthorizedUsersResponseBody body;

    public static ListUnauthorizedUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnauthorizedUsersResponse self = new ListUnauthorizedUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListUnauthorizedUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnauthorizedUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnauthorizedUsersResponse setBody(ListUnauthorizedUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnauthorizedUsersResponseBody getBody() {
        return this.body;
    }

}
