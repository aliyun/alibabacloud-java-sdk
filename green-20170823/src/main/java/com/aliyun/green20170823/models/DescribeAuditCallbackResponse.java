// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditCallbackResponseBody body;

    public static DescribeAuditCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditCallbackResponse self = new DescribeAuditCallbackResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditCallbackResponse setBody(DescribeAuditCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditCallbackResponseBody getBody() {
        return this.body;
    }

}
