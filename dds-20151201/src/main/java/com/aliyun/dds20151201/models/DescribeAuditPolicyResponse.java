// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditPolicyResponseBody body;

    public static DescribeAuditPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditPolicyResponse self = new DescribeAuditPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditPolicyResponse setBody(DescribeAuditPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditPolicyResponseBody getBody() {
        return this.body;
    }

}
