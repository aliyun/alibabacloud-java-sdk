// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteGatewayApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayApiResponseBody body;

    public static DeleteGatewayApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayApiResponse self = new DeleteGatewayApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayApiResponse setBody(DeleteGatewayApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayApiResponseBody getBody() {
        return this.body;
    }

}
