// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsEndpointDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateDnsEndpointDetailResponseBody body;

    public static DescribePrivateDnsEndpointDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsEndpointDetailResponse self = new DescribePrivateDnsEndpointDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsEndpointDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateDnsEndpointDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateDnsEndpointDetailResponse setBody(DescribePrivateDnsEndpointDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateDnsEndpointDetailResponseBody getBody() {
        return this.body;
    }

}
