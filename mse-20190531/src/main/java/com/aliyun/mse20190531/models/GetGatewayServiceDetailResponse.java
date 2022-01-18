// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetGatewayServiceDetailResponse setBody(GetGatewayServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayServiceDetailResponseBody getBody() {
        return this.body;
    }

}
