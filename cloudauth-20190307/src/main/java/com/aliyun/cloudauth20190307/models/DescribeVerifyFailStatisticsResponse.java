// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyFailStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifyFailStatisticsResponseBody body;

    public static DescribeVerifyFailStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyFailStatisticsResponse self = new DescribeVerifyFailStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyFailStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyFailStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifyFailStatisticsResponse setBody(DescribeVerifyFailStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyFailStatisticsResponseBody getBody() {
        return this.body;
    }

}
