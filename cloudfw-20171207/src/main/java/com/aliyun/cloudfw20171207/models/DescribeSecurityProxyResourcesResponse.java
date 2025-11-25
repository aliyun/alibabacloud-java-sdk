// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityProxyResourcesResponseBody body;

    public static DescribeSecurityProxyResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyResourcesResponse self = new DescribeSecurityProxyResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityProxyResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityProxyResourcesResponse setBody(DescribeSecurityProxyResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityProxyResourcesResponseBody getBody() {
        return this.body;
    }

}
