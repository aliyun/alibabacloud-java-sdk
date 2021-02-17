// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAuditLogFilterResponse setBody(DescribeAuditLogFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogFilterResponseBody getBody() {
        return this.body;
    }

}
