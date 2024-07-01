// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterResourceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterResourceDetailResponseBody body;

    public static DescribeClusterResourceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourceDetailResponse self = new DescribeClusterResourceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterResourceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterResourceDetailResponse setBody(DescribeClusterResourceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterResourceDetailResponseBody getBody() {
        return this.body;
    }

}
