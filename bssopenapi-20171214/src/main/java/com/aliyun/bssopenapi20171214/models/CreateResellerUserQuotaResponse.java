// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResellerUserQuotaResponseBody body;

    public static CreateResellerUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResellerUserQuotaResponse self = new CreateResellerUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CreateResellerUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResellerUserQuotaResponse setBody(CreateResellerUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResellerUserQuotaResponseBody getBody() {
        return this.body;
    }

}
