// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckServiceRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceRoleResponseBody body;

    public static CheckServiceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceRoleResponse self = new CheckServiceRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceRoleResponse setBody(CheckServiceRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceRoleResponseBody getBody() {
        return this.body;
    }

}
