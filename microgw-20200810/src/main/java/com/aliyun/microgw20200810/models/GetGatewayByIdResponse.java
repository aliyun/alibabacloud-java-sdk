// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetGatewayByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGatewayByIdResponseBody body;

    public static GetGatewayByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayByIdResponse self = new GetGatewayByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayByIdResponse setBody(GetGatewayByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayByIdResponseBody getBody() {
        return this.body;
    }

}
