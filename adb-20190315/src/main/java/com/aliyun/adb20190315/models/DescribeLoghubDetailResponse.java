// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoghubDetailResponseBody body;

    public static DescribeLoghubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoghubDetailResponse self = new DescribeLoghubDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoghubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoghubDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoghubDetailResponse setBody(DescribeLoghubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoghubDetailResponseBody getBody() {
        return this.body;
    }

}
