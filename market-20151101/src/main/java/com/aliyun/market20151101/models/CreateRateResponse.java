// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateRateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRateResponseBody body;

    public static CreateRateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRateResponse self = new CreateRateResponse();
        return TeaModel.build(map, self);
    }

    public CreateRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRateResponse setBody(CreateRateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRateResponseBody getBody() {
        return this.body;
    }

}
