// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcZoneResponseBody body;

    public static DescribeVpcZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcZoneResponse self = new DescribeVpcZoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcZoneResponse setBody(DescribeVpcZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcZoneResponseBody getBody() {
        return this.body;
    }

}
