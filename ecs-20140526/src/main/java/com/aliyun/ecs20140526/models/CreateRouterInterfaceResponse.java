// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRouterInterfaceResponseBody body;

    public static CreateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceResponse self = new CreateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouterInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouterInterfaceResponse setBody(CreateRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
