// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowLogRecordsResponseBody body;

    public static DescribeSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponse self = new DescribeSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowLogRecordsResponse setBody(DescribeSlowLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogRecordsResponseBody getBody() {
        return this.body;
    }

}
