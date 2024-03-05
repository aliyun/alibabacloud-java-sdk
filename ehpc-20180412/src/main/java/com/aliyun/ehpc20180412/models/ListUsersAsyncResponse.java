// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersAsyncResponseBody body;

    public static ListUsersAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersAsyncResponse self = new ListUsersAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersAsyncResponse setBody(ListUsersAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersAsyncResponseBody getBody() {
        return this.body;
    }

}
