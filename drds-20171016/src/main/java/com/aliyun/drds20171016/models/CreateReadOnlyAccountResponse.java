// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateReadOnlyAccountResponseBody body;

    public static CreateReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyAccountResponse self = new CreateReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReadOnlyAccountResponse setBody(CreateReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
