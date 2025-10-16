// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRegionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionInfoResponseBody body;

    public static DescribeRegionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfoResponse self = new DescribeRegionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionInfoResponse setBody(DescribeRegionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionInfoResponseBody getBody() {
        return this.body;
    }

}
