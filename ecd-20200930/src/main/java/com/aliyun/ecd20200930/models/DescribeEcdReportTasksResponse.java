// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeEcdReportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEcdReportTasksResponseBody body;

    public static DescribeEcdReportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcdReportTasksResponse self = new DescribeEcdReportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEcdReportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEcdReportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEcdReportTasksResponse setBody(DescribeEcdReportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEcdReportTasksResponseBody getBody() {
        return this.body;
    }

}
