// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeErrorLogRecordsResponseBody body;

    public static DescribeErrorLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsResponse self = new DescribeErrorLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeErrorLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeErrorLogRecordsResponse setBody(DescribeErrorLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeErrorLogRecordsResponseBody getBody() {
        return this.body;
    }

}
