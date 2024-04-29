// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebReportTopIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebReportTopIpResponseBody body;

    public static DescribeWebReportTopIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebReportTopIpResponse self = new DescribeWebReportTopIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebReportTopIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebReportTopIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebReportTopIpResponse setBody(DescribeWebReportTopIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebReportTopIpResponseBody getBody() {
        return this.body;
    }

}
