// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRunningLogRecordsResponseBody body;

    public static DescribeRunningLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsResponse self = new DescribeRunningLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRunningLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRunningLogRecordsResponse setBody(DescribeRunningLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRunningLogRecordsResponseBody getBody() {
        return this.body;
    }

}
