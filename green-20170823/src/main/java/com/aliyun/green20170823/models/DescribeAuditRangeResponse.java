// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditRangeResponseBody body;

    public static DescribeAuditRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRangeResponse self = new DescribeAuditRangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditRangeResponse setBody(DescribeAuditRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditRangeResponseBody getBody() {
        return this.body;
    }

}
