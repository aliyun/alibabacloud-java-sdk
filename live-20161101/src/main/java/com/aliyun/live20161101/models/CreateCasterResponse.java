// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCasterResponseBody body;

    public static CreateCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasterResponse self = new CreateCasterResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCasterResponse setBody(CreateCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasterResponseBody getBody() {
        return this.body;
    }

}
