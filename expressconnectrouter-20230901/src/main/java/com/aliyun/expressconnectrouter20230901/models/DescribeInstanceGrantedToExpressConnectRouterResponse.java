// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeInstanceGrantedToExpressConnectRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceGrantedToExpressConnectRouterResponseBody body;

    public static DescribeInstanceGrantedToExpressConnectRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGrantedToExpressConnectRouterResponse self = new DescribeInstanceGrantedToExpressConnectRouterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponse setBody(DescribeInstanceGrantedToExpressConnectRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceGrantedToExpressConnectRouterResponseBody getBody() {
        return this.body;
    }

}
