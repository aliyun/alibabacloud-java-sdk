// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayApiResponseBody body;

    public static UpdateGatewayApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiResponse self = new UpdateGatewayApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayApiResponse setBody(UpdateGatewayApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayApiResponseBody getBody() {
        return this.body;
    }

}
