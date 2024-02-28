// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListUsersByRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersByRoleResponseBody body;

    public static ListUsersByRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByRoleResponse self = new ListUsersByRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersByRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersByRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersByRoleResponse setBody(ListUsersByRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersByRoleResponseBody getBody() {
        return this.body;
    }

}
