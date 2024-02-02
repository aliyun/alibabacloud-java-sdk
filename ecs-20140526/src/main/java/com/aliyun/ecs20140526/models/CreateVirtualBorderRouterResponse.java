// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualBorderRouterResponseBody body;

    public static CreateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponse self = new CreateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualBorderRouterResponse setBody(CreateVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
