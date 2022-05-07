// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GrantVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GrantVirtualBorderRouterResponseBody body;

    public static GrantVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantVirtualBorderRouterResponse self = new GrantVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public GrantVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantVirtualBorderRouterResponse setBody(GrantVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
