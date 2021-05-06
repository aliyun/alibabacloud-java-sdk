// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAuditLogRecordsResponse setBody(DescribeAuditLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogRecordsResponseBody getBody() {
        return this.body;
    }

}
