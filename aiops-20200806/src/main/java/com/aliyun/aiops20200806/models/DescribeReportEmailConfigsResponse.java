// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportEmailConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReportEmailConfigsResponseBody body;

    public static DescribeReportEmailConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportEmailConfigsResponse self = new DescribeReportEmailConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportEmailConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportEmailConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReportEmailConfigsResponse setBody(DescribeReportEmailConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportEmailConfigsResponseBody getBody() {
        return this.body;
    }

}
