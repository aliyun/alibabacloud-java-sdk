// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayServiceResponseBody body;

    public static GetGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayServiceResponse self = new GetGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayServiceResponse setBody(GetGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
