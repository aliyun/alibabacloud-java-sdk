// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMasFunnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMasFunnelResponseBody body;

    public static CreateMasFunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMasFunnelResponse self = new CreateMasFunnelResponse();
        return TeaModel.build(map, self);
    }

    public CreateMasFunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMasFunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMasFunnelResponse setBody(CreateMasFunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMasFunnelResponseBody getBody() {
        return this.body;
    }

}
