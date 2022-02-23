// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateShortTermAccessKeyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShortTermAccessKeyForAccountResponseBody body;

    public static CreateShortTermAccessKeyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShortTermAccessKeyForAccountResponse self = new CreateShortTermAccessKeyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateShortTermAccessKeyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShortTermAccessKeyForAccountResponse setBody(CreateShortTermAccessKeyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShortTermAccessKeyForAccountResponseBody getBody() {
        return this.body;
    }

}
