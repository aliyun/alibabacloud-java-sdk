// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayDomainDetailResponseBody body;

    public static GetGatewayDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDomainDetailResponse self = new GetGatewayDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayDomainDetailResponse setBody(GetGatewayDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayDomainDetailResponseBody getBody() {
        return this.body;
    }

}
