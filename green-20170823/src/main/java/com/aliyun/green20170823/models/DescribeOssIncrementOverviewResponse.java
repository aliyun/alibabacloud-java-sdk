// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssIncrementOverviewResponseBody body;

    public static DescribeOssIncrementOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementOverviewResponse self = new DescribeOssIncrementOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssIncrementOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssIncrementOverviewResponse setBody(DescribeOssIncrementOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssIncrementOverviewResponseBody getBody() {
        return this.body;
    }

}
