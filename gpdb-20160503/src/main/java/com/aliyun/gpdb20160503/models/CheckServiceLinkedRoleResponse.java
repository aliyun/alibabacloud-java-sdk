// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceLinkedRoleResponseBody body;

    public static CheckServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponse self = new CheckServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceLinkedRoleResponse setBody(CheckServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
