// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRamUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRamUsersResponseBody body;

    public static ListRamUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRamUsersResponse self = new ListRamUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListRamUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRamUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRamUsersResponse setBody(ListRamUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRamUsersResponseBody getBody() {
        return this.body;
    }

}
