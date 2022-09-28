// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class CreateNormalAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNormalAccountResponseBody body;

    public static CreateNormalAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalAccountResponse self = new CreateNormalAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateNormalAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNormalAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNormalAccountResponse setBody(CreateNormalAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNormalAccountResponseBody getBody() {
        return this.body;
    }

}
