// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSqlAuditResponseBody body;

    public static EnableSqlAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditResponse self = new EnableSqlAuditResponse();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSqlAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSqlAuditResponse setBody(EnableSqlAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSqlAuditResponseBody getBody() {
        return this.body;
    }

}
