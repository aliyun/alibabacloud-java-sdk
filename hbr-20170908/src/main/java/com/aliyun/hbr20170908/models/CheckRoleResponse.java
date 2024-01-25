// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CheckRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRoleResponseBody body;

    public static CheckRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleResponse self = new CheckRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRoleResponse setBody(CheckRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRoleResponseBody getBody() {
        return this.body;
    }

}
