// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditContentResponseBody body;

    public static DescribeAuditContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditContentResponse self = new DescribeAuditContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditContentResponse setBody(DescribeAuditContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditContentResponseBody getBody() {
        return this.body;
    }

}
