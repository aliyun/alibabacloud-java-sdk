// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreAPIKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextStoreAPIKeyResponseBody body;

    public static GetContextStoreAPIKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreAPIKeyResponse self = new GetContextStoreAPIKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetContextStoreAPIKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextStoreAPIKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextStoreAPIKeyResponse setBody(GetContextStoreAPIKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextStoreAPIKeyResponseBody getBody() {
        return this.body;
    }

}
