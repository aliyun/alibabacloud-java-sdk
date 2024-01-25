// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataByProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStatisticalDataByProductResponseBody body;

    public static DescribeStatisticalDataByProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataByProductResponse self = new DescribeStatisticalDataByProductResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataByProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatisticalDataByProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatisticalDataByProductResponse setBody(DescribeStatisticalDataByProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatisticalDataByProductResponseBody getBody() {
        return this.body;
    }

}
