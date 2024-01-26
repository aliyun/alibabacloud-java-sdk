// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDirectoryUsersResponseBody body;

    public static ListDirectoryUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoryUsersResponse self = new ListDirectoryUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectoryUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDirectoryUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDirectoryUsersResponse setBody(ListDirectoryUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectoryUsersResponseBody getBody() {
        return this.body;
    }

}
