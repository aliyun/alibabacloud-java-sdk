// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditCallbackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditCallbackListResponseBody body;

    public static DescribeAuditCallbackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditCallbackListResponse self = new DescribeAuditCallbackListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditCallbackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditCallbackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditCallbackListResponse setBody(DescribeAuditCallbackListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditCallbackListResponseBody getBody() {
        return this.body;
    }

}
