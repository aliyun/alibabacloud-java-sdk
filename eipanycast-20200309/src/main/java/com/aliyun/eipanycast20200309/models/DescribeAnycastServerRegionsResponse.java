// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastServerRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnycastServerRegionsResponseBody body;

    public static DescribeAnycastServerRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastServerRegionsResponse self = new DescribeAnycastServerRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastServerRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastServerRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnycastServerRegionsResponse setBody(DescribeAnycastServerRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastServerRegionsResponseBody getBody() {
        return this.body;
    }

}
