// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayOptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayOptionResponseBody body;

    public static GetGatewayOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayOptionResponse self = new GetGatewayOptionResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayOptionResponse setBody(GetGatewayOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayOptionResponseBody getBody() {
        return this.body;
    }

}
