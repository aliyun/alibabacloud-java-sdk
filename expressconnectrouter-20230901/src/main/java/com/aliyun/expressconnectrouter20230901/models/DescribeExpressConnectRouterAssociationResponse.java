// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectRouterAssociationResponseBody body;

    public static DescribeExpressConnectRouterAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAssociationResponse self = new DescribeExpressConnectRouterAssociationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectRouterAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectRouterAssociationResponse setBody(DescribeExpressConnectRouterAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectRouterAssociationResponseBody getBody() {
        return this.body;
    }

}
