// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceEndpointsResponseBody body;

    public static DescribeServiceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEndpointsResponse self = new DescribeServiceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceEndpointsResponse setBody(DescribeServiceEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceEndpointsResponseBody getBody() {
        return this.body;
    }

}
