// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckSqlAuditEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSqlAuditEnableStatusResponseBody body;

    public static CheckSqlAuditEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditEnableStatusResponse self = new CheckSqlAuditEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSqlAuditEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSqlAuditEnableStatusResponse setBody(CheckSqlAuditEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSqlAuditEnableStatusResponseBody getBody() {
        return this.body;
    }

}
