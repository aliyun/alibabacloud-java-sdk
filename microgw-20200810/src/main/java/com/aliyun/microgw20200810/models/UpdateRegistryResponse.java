// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRegistryResponseBody body;

    public static UpdateRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryResponse self = new UpdateRegistryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRegistryResponse setBody(UpdateRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRegistryResponseBody getBody() {
        return this.body;
    }

}
