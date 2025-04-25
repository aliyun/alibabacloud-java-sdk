// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceLinkedRoleForProductResponseBody body;

    public static CheckServiceLinkedRoleForProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForProductResponse self = new CheckServiceLinkedRoleForProductResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleForProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceLinkedRoleForProductResponse setBody(CheckServiceLinkedRoleForProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleForProductResponseBody getBody() {
        return this.body;
    }

}
