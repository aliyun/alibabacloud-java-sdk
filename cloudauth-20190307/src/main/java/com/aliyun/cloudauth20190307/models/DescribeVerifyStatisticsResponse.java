// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyStatisticsResponseBody body;

    public static DescribeVerifyStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyStatisticsResponse self = new DescribeVerifyStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyStatisticsResponse setBody(DescribeVerifyStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyStatisticsResponseBody getBody() {
        return this.body;
    }

}
