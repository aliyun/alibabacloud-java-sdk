// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceAccountResponseBody body;

    public static CreateInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAccountResponse self = new CreateInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceAccountResponse setBody(CreateInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
