// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectUsersResponseBody body;

    public static ListProjectUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectUsersResponse self = new ListProjectUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectUsersResponse setBody(ListProjectUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectUsersResponseBody getBody() {
        return this.body;
    }

}
