// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsaEnhanceResponseBody body;

    public static CreateMsaEnhanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceResponse self = new CreateMsaEnhanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsaEnhanceResponse setBody(CreateMsaEnhanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsaEnhanceResponseBody getBody() {
        return this.body;
    }

}
