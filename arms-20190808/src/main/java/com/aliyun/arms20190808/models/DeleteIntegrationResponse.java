// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIntegrationResponseBody body;

    public static DeleteIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationResponse self = new DeleteIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntegrationResponse setBody(DeleteIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntegrationResponseBody getBody() {
        return this.body;
    }

}
