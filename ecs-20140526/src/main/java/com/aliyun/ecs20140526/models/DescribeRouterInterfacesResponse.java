// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRouterInterfacesResponseBody body;

    public static DescribeRouterInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponse self = new DescribeRouterInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouterInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRouterInterfacesResponse setBody(DescribeRouterInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouterInterfacesResponseBody getBody() {
        return this.body;
    }

}
