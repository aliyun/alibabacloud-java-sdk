// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertDetailTrendDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertDetailTrendDataResponseBody body;

    public static DescribeAlertDetailTrendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertDetailTrendDataResponse self = new DescribeAlertDetailTrendDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertDetailTrendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertDetailTrendDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertDetailTrendDataResponse setBody(DescribeAlertDetailTrendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertDetailTrendDataResponseBody getBody() {
        return this.body;
    }

}
