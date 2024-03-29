// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthConsumerDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayAuthConsumerDetailResponseBody body;

    public static GetGatewayAuthConsumerDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayAuthConsumerDetailResponse self = new GetGatewayAuthConsumerDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayAuthConsumerDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayAuthConsumerDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayAuthConsumerDetailResponse setBody(GetGatewayAuthConsumerDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayAuthConsumerDetailResponseBody getBody() {
        return this.body;
    }

}
