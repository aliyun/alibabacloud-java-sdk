// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody body;

    public static DescribeExpressConnectRouterAllowedPrefixHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAllowedPrefixHistoryResponse self = new DescribeExpressConnectRouterAllowedPrefixHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse setBody(DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody getBody() {
        return this.body;
    }

}
