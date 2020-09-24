// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateSpecialRouteForRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpecialRouteForRegistryResponseBody body;

    public static CreateSpecialRouteForRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpecialRouteForRegistryResponse self = new CreateSpecialRouteForRegistryResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpecialRouteForRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpecialRouteForRegistryResponse setBody(CreateSpecialRouteForRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpecialRouteForRegistryResponseBody getBody() {
        return this.body;
    }

}
