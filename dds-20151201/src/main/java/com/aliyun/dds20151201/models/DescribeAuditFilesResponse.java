// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAuditFilesResponseBody body;

    public static DescribeAuditFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditFilesResponse self = new DescribeAuditFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditFilesResponse setBody(DescribeAuditFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditFilesResponseBody getBody() {
        return this.body;
    }

}
