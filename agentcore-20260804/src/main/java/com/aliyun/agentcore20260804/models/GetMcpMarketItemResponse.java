// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpMarketItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcpMarketItemResponseBody body;

    public static GetMcpMarketItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcpMarketItemResponse self = new GetMcpMarketItemResponse();
        return TeaModel.build(map, self);
    }

    public GetMcpMarketItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcpMarketItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcpMarketItemResponse setBody(GetMcpMarketItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcpMarketItemResponseBody getBody() {
        return this.body;
    }

}
