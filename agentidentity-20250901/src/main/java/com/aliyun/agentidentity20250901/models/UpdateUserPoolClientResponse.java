// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserPoolClientResponseBody body;

    public static UpdateUserPoolClientResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolClientResponse self = new UpdateUserPoolClientResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserPoolClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserPoolClientResponse setBody(UpdateUserPoolClientResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserPoolClientResponseBody getBody() {
        return this.body;
    }

}
