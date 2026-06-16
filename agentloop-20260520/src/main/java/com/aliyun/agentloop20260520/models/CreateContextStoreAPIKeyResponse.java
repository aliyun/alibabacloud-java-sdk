// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateContextStoreAPIKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextStoreAPIKeyResponseBody body;

    public static CreateContextStoreAPIKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreAPIKeyResponse self = new CreateContextStoreAPIKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreAPIKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextStoreAPIKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextStoreAPIKeyResponse setBody(CreateContextStoreAPIKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextStoreAPIKeyResponseBody getBody() {
        return this.body;
    }

}
