// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRegionResourceTypeAutoEnableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionResourceTypeAutoEnableResponseBody body;

    public static DescribeRegionResourceTypeAutoEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResourceTypeAutoEnableResponse self = new DescribeRegionResourceTypeAutoEnableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResourceTypeAutoEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionResourceTypeAutoEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionResourceTypeAutoEnableResponse setBody(DescribeRegionResourceTypeAutoEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionResourceTypeAutoEnableResponseBody getBody() {
        return this.body;
    }

}
