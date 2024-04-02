// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditContentItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditContentItemResponseBody body;

    public static DescribeAuditContentItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditContentItemResponse self = new DescribeAuditContentItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditContentItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditContentItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditContentItemResponse setBody(DescribeAuditContentItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditContentItemResponseBody getBody() {
        return this.body;
    }

}
