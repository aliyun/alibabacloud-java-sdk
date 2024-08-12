// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayConfigResponseBody body;

    public static GetGatewayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayConfigResponse self = new GetGatewayConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayConfigResponse setBody(GetGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayConfigResponseBody getBody() {
        return this.body;
    }

}
