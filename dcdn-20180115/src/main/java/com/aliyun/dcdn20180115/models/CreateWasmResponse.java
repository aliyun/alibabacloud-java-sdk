// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateWasmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWasmResponseBody body;

    public static CreateWasmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWasmResponse self = new CreateWasmResponse();
        return TeaModel.build(map, self);
    }

    public CreateWasmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWasmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWasmResponse setBody(CreateWasmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWasmResponseBody getBody() {
        return this.body;
    }

}
