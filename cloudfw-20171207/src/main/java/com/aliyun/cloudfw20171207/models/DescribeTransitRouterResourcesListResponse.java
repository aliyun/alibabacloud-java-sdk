// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterResourcesListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouterResourcesListResponseBody body;

    public static DescribeTransitRouterResourcesListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterResourcesListResponse self = new DescribeTransitRouterResourcesListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterResourcesListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouterResourcesListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouterResourcesListResponse setBody(DescribeTransitRouterResourcesListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouterResourcesListResponseBody getBody() {
        return this.body;
    }

}
