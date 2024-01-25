// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReportSubscriptionsResponseBody body;

    public static DescribeReportSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportSubscriptionsResponse self = new DescribeReportSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReportSubscriptionsResponse setBody(DescribeReportSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
