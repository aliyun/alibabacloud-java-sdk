// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSchemeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSchemeConfigResponseBody body;

    public static CreateSchemeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeConfigResponse self = new CreateSchemeConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchemeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchemeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSchemeConfigResponse setBody(CreateSchemeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchemeConfigResponseBody getBody() {
        return this.body;
    }

}
