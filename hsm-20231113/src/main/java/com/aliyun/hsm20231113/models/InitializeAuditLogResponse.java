// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class InitializeAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeAuditLogResponseBody body;

    public static InitializeAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeAuditLogResponse self = new InitializeAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public InitializeAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeAuditLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeAuditLogResponse setBody(InitializeAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeAuditLogResponseBody getBody() {
        return this.body;
    }

}
