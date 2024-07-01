// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditLogRecordsResponseBody body;

    public static DescribeAuditLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogRecordsResponse self = new DescribeAuditLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditLogRecordsResponse setBody(DescribeAuditLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogRecordsResponseBody getBody() {
        return this.body;
    }

}
