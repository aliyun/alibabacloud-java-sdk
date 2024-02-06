// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInclinedTablesResponseBody body;

    public static DescribeInclinedTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesResponse self = new DescribeInclinedTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInclinedTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInclinedTablesResponse setBody(DescribeInclinedTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInclinedTablesResponseBody getBody() {
        return this.body;
    }

}
