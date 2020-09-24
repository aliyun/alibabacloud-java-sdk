// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRegistryResponseBody body;

    public static CreateRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryResponse self = new CreateRegistryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRegistryResponse setBody(CreateRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRegistryResponseBody getBody() {
        return this.body;
    }

}
