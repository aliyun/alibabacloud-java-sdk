// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReportDataResponseBody body;

    public static DescribeReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportDataResponse self = new DescribeReportDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReportDataResponse setBody(DescribeReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportDataResponseBody getBody() {
        return this.body;
    }

}
