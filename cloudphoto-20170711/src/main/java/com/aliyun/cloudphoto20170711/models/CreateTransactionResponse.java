// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateTransactionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransactionResponseBody body;

    public static CreateTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionResponse self = new CreateTransactionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransactionResponse setBody(CreateTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransactionResponseBody getBody() {
        return this.body;
    }

}
