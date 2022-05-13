// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGatewayResponseBody body;

    public static GetGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResponse self = new GetGatewayResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayResponse setBody(GetGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayResponseBody getBody() {
        return this.body;
    }

}
