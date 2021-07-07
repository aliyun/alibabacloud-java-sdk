// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSipAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSipAccountResponseBody body;

    public static CreateSipAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSipAccountResponse self = new CreateSipAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateSipAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSipAccountResponse setBody(CreateSipAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSipAccountResponseBody getBody() {
        return this.body;
    }

}
