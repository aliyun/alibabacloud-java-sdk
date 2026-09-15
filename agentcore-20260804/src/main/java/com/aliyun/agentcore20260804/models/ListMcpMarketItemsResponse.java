// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpMarketItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcpMarketItemsResponseBody body;

    public static ListMcpMarketItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcpMarketItemsResponse self = new ListMcpMarketItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcpMarketItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcpMarketItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcpMarketItemsResponse setBody(ListMcpMarketItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcpMarketItemsResponseBody getBody() {
        return this.body;
    }

}
