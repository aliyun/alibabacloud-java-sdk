// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteASMIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteASMIntegrationResponseBody body;

    public static DeleteASMIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteASMIntegrationResponse self = new DeleteASMIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteASMIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteASMIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteASMIntegrationResponse setBody(DeleteASMIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteASMIntegrationResponseBody getBody() {
        return this.body;
    }

}
