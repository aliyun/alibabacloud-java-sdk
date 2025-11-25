// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetOpenDetailResponseBody body;

    public static DescribeInternetOpenDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenDetailResponse self = new DescribeInternetOpenDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetOpenDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetOpenDetailResponse setBody(DescribeInternetOpenDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetOpenDetailResponseBody getBody() {
        return this.body;
    }

}
