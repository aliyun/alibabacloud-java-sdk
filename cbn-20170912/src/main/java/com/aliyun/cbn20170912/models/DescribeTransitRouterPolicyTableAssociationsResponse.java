// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTableAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouterPolicyTableAssociationsResponseBody body;

    public static DescribeTransitRouterPolicyTableAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTableAssociationsResponse self = new DescribeTransitRouterPolicyTableAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTableAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponse setBody(DescribeTransitRouterPolicyTableAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouterPolicyTableAssociationsResponseBody getBody() {
        return this.body;
    }

}
