// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeServiceLinkRoleResponseBody body;

    public static InitializeServiceLinkRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkRoleResponse self = new InitializeServiceLinkRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeServiceLinkRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeServiceLinkRoleResponse setBody(InitializeServiceLinkRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeServiceLinkRoleResponseBody getBody() {
        return this.body;
    }

}
