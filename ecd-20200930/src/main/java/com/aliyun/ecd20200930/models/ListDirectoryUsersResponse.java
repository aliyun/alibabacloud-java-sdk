// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDirectoryUsersResponse setBody(ListDirectoryUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectoryUsersResponseBody getBody() {
        return this.body;
    }

}
