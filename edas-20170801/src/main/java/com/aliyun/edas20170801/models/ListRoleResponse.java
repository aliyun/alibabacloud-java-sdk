// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoleResponseBody body;

    public static ListRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoleResponse self = new ListRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoleResponse setBody(ListRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoleResponseBody getBody() {
        return this.body;
    }

}
