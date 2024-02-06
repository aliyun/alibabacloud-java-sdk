// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditLogConfigResponseBody body;

    public static DescribeAuditLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogConfigResponse self = new DescribeAuditLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditLogConfigResponse setBody(DescribeAuditLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogConfigResponseBody getBody() {
        return this.body;
    }

}
