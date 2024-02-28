// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRolesResponseBody body;

    public static ListRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponse self = new ListRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRolesResponse setBody(ListRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRolesResponseBody getBody() {
        return this.body;
    }

}
