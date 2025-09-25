// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAuditLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkAuditLogRecordsResponseBody body;

    public static DescribeSparkAuditLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAuditLogRecordsResponse self = new DescribeSparkAuditLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAuditLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkAuditLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkAuditLogRecordsResponse setBody(DescribeSparkAuditLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkAuditLogRecordsResponseBody getBody() {
        return this.body;
    }

}
