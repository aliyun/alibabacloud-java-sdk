// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class PullServiceInfoFromRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullServiceInfoFromRegistryResponseBody body;

    public static PullServiceInfoFromRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        PullServiceInfoFromRegistryResponse self = new PullServiceInfoFromRegistryResponse();
        return TeaModel.build(map, self);
    }

    public PullServiceInfoFromRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullServiceInfoFromRegistryResponse setBody(PullServiceInfoFromRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public PullServiceInfoFromRegistryResponseBody getBody() {
        return this.body;
    }

}
