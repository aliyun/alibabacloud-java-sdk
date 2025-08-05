// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsEndpointListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateDnsEndpointListResponseBody body;

    public static DescribePrivateDnsEndpointListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsEndpointListResponse self = new DescribePrivateDnsEndpointListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsEndpointListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateDnsEndpointListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateDnsEndpointListResponse setBody(DescribePrivateDnsEndpointListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateDnsEndpointListResponseBody getBody() {
        return this.body;
    }

}
