// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertDetailDataResponseBody body;

    public static DescribeAlertDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertDetailDataResponse self = new DescribeAlertDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertDetailDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertDetailDataResponse setBody(DescribeAlertDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertDetailDataResponseBody getBody() {
        return this.body;
    }

}
