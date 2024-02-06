// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTableStatisticsResponseBody body;

    public static DescribeTableStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableStatisticsResponse self = new DescribeTableStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTableStatisticsResponse setBody(DescribeTableStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableStatisticsResponseBody getBody() {
        return this.body;
    }

}
