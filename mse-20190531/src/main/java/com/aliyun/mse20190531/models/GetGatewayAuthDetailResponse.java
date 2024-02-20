// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayAuthDetailResponseBody body;

    public static GetGatewayAuthDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayAuthDetailResponse self = new GetGatewayAuthDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayAuthDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayAuthDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayAuthDetailResponse setBody(GetGatewayAuthDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayAuthDetailResponseBody getBody() {
        return this.body;
    }

}
