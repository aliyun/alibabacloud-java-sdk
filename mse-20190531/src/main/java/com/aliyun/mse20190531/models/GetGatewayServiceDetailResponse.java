// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayServiceDetailResponseBody body;

    public static GetGatewayServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayServiceDetailResponse self = new GetGatewayServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayServiceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayServiceDetailResponse setBody(GetGatewayServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayServiceDetailResponseBody getBody() {
        return this.body;
    }

}
