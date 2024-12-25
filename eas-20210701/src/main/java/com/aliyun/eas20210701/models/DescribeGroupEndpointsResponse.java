// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeGroupEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupEndpointsResponseBody body;

    public static DescribeGroupEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupEndpointsResponse self = new DescribeGroupEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupEndpointsResponse setBody(DescribeGroupEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupEndpointsResponseBody getBody() {
        return this.body;
    }

}
