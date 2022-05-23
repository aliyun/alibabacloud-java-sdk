// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
