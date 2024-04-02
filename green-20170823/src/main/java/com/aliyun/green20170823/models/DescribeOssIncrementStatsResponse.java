// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssIncrementStatsResponseBody body;

    public static DescribeOssIncrementStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementStatsResponse self = new DescribeOssIncrementStatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssIncrementStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssIncrementStatsResponse setBody(DescribeOssIncrementStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssIncrementStatsResponseBody getBody() {
        return this.body;
    }

}
