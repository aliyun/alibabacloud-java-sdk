// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserPoolResponseBody body;

    public static UpdateUserPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolResponse self = new UpdateUserPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserPoolResponse setBody(UpdateUserPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserPoolResponseBody getBody() {
        return this.body;
    }

}
