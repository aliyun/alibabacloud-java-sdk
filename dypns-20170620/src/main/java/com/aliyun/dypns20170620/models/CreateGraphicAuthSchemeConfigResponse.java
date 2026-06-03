// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateGraphicAuthSchemeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGraphicAuthSchemeConfigResponseBody body;

    public static CreateGraphicAuthSchemeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphicAuthSchemeConfigResponse self = new CreateGraphicAuthSchemeConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateGraphicAuthSchemeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGraphicAuthSchemeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGraphicAuthSchemeConfigResponse setBody(CreateGraphicAuthSchemeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGraphicAuthSchemeConfigResponseBody getBody() {
        return this.body;
    }

}
