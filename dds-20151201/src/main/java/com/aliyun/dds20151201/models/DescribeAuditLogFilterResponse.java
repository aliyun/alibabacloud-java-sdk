// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditLogFilterResponseBody body;

    public static DescribeAuditLogFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogFilterResponse self = new DescribeAuditLogFilterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditLogFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditLogFilterResponse setBody(DescribeAuditLogFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogFilterResponseBody getBody() {
        return this.body;
    }

}
