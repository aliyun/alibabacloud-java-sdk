// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertRoleResponseBody body;

    public static InsertRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertRoleResponse self = new InsertRoleResponse();
        return TeaModel.build(map, self);
    }

    public InsertRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertRoleResponse setBody(InsertRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertRoleResponseBody getBody() {
        return this.body;
    }

}
