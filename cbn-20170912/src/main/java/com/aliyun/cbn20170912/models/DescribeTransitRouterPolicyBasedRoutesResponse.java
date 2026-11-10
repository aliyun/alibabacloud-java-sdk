// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyBasedRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouterPolicyBasedRoutesResponseBody body;

    public static DescribeTransitRouterPolicyBasedRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyBasedRoutesResponse self = new DescribeTransitRouterPolicyBasedRoutesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyBasedRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponse setBody(DescribeTransitRouterPolicyBasedRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouterPolicyBasedRoutesResponseBody getBody() {
        return this.body;
    }

}
