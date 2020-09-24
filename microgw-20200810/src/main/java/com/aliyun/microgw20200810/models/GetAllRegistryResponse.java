// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAllRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllRegistryResponseBody body;

    public static GetAllRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegistryResponse self = new GetAllRegistryResponse();
        return TeaModel.build(map, self);
    }

    public GetAllRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllRegistryResponse setBody(GetAllRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllRegistryResponseBody getBody() {
        return this.body;
    }

}
