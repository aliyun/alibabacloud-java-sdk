// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteConnectorClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConnectorClientResponseBody body;

    public static DeleteConnectorClientResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorClientResponse self = new DeleteConnectorClientResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnectorClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConnectorClientResponse setBody(DeleteConnectorClientResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnectorClientResponseBody getBody() {
        return this.body;
    }

}
