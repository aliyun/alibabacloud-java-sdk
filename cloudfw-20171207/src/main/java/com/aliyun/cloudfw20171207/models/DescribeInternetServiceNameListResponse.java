// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetServiceNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetServiceNameListResponseBody body;

    public static DescribeInternetServiceNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetServiceNameListResponse self = new DescribeInternetServiceNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetServiceNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetServiceNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetServiceNameListResponse setBody(DescribeInternetServiceNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetServiceNameListResponseBody getBody() {
        return this.body;
    }

}
