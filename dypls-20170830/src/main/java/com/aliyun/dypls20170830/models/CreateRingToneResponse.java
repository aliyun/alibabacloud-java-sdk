// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateRingToneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRingToneResponseBody body;

    public static CreateRingToneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRingToneResponse self = new CreateRingToneResponse();
        return TeaModel.build(map, self);
    }

    public CreateRingToneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRingToneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRingToneResponse setBody(CreateRingToneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRingToneResponseBody getBody() {
        return this.body;
    }

}
