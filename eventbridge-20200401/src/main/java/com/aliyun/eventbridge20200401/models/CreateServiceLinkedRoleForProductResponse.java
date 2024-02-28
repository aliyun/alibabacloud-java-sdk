// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceLinkedRoleForProductResponseBody body;

    public static CreateServiceLinkedRoleForProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForProductResponse self = new CreateServiceLinkedRoleForProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceLinkedRoleForProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceLinkedRoleForProductResponse setBody(CreateServiceLinkedRoleForProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceLinkedRoleForProductResponseBody getBody() {
        return this.body;
    }

}
