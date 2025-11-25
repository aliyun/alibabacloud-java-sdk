// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetOpenStatisticResponseBody body;

    public static DescribeInternetOpenStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenStatisticResponse self = new DescribeInternetOpenStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetOpenStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetOpenStatisticResponse setBody(DescribeInternetOpenStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetOpenStatisticResponseBody getBody() {
        return this.body;
    }

}
