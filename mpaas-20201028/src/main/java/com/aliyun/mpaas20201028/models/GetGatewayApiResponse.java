// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGatewayApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayApiResponseBody body;

    public static GetGatewayApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayApiResponse self = new GetGatewayApiResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayApiResponse setBody(GetGatewayApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayApiResponseBody getBody() {
        return this.body;
    }

}
