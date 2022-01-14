// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsaEnhanceConfigResponseBody body;

    public static CreateMsaEnhanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceConfigResponse self = new CreateMsaEnhanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsaEnhanceConfigResponse setBody(CreateMsaEnhanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsaEnhanceConfigResponseBody getBody() {
        return this.body;
    }

}
