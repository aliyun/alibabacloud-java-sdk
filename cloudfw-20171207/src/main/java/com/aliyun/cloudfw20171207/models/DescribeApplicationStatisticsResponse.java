// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationStatisticsResponseBody body;

    public static DescribeApplicationStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatisticsResponse self = new DescribeApplicationStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationStatisticsResponse setBody(DescribeApplicationStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationStatisticsResponseBody getBody() {
        return this.body;
    }

}
