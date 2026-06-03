// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConnectorResponseBody body;

    public static DeleteConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorResponse self = new DeleteConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConnectorResponse setBody(DeleteConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnectorResponseBody getBody() {
        return this.body;
    }

}
