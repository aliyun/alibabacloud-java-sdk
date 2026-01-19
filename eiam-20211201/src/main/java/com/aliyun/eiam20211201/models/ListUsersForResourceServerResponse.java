// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForResourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersForResourceServerResponseBody body;

    public static ListUsersForResourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForResourceServerResponse self = new ListUsersForResourceServerResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersForResourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersForResourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersForResourceServerResponse setBody(ListUsersForResourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersForResourceServerResponseBody getBody() {
        return this.body;
    }

}
