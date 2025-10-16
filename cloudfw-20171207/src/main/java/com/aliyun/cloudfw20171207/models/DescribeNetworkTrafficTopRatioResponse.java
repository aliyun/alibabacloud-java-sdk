// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkTrafficTopRatioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkTrafficTopRatioResponseBody body;

    public static DescribeNetworkTrafficTopRatioResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkTrafficTopRatioResponse self = new DescribeNetworkTrafficTopRatioResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkTrafficTopRatioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkTrafficTopRatioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkTrafficTopRatioResponse setBody(DescribeNetworkTrafficTopRatioResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkTrafficTopRatioResponseBody getBody() {
        return this.body;
    }

}
