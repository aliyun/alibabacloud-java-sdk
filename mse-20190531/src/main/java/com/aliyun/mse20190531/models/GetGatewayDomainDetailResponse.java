// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetGatewayDomainDetailResponse setBody(GetGatewayDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayDomainDetailResponseBody getBody() {
        return this.body;
    }

}
