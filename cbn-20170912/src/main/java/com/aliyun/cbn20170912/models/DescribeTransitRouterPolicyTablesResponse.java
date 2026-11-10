// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouterPolicyTablesResponseBody body;

    public static DescribeTransitRouterPolicyTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTablesResponse self = new DescribeTransitRouterPolicyTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouterPolicyTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouterPolicyTablesResponse setBody(DescribeTransitRouterPolicyTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouterPolicyTablesResponseBody getBody() {
        return this.body;
    }

}
