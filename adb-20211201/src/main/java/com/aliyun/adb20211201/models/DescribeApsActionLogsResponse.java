// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsActionLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsActionLogsResponseBody body;

    public static DescribeApsActionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsActionLogsResponse self = new DescribeApsActionLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsActionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsActionLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsActionLogsResponse setBody(DescribeApsActionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsActionLogsResponseBody getBody() {
        return this.body;
    }

}
