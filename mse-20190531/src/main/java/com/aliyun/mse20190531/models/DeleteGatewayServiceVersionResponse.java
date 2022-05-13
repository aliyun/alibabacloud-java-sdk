// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayServiceVersionResponseBody body;

    public static DeleteGatewayServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayServiceVersionResponse self = new DeleteGatewayServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayServiceVersionResponse setBody(DeleteGatewayServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

}
