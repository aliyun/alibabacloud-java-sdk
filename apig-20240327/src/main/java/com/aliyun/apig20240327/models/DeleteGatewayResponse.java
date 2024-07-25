// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayResponseBody body;

    public static DeleteGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayResponse self = new DeleteGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayResponse setBody(DeleteGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayResponseBody getBody() {
        return this.body;
    }

}
