// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAuditLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAuditLogConfigResponse setBody(DescribeAuditLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditLogConfigResponseBody getBody() {
        return this.body;
    }

}
