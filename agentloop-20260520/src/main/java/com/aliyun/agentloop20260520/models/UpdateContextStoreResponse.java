// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateContextStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextStoreResponseBody body;

    public static UpdateContextStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreResponse self = new UpdateContextStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextStoreResponse setBody(UpdateContextStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextStoreResponseBody getBody() {
        return this.body;
    }

}
