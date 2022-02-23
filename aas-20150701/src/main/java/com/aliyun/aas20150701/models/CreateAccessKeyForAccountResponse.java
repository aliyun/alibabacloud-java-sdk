// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAccessKeyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccessKeyForAccountResponseBody body;

    public static CreateAccessKeyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyForAccountResponse self = new CreateAccessKeyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessKeyForAccountResponse setBody(CreateAccessKeyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessKeyForAccountResponseBody getBody() {
        return this.body;
    }

}
