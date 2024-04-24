// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DisableSqlAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSqlAuditResponseBody body;

    public static DisableSqlAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlAuditResponse self = new DisableSqlAuditResponse();
        return TeaModel.build(map, self);
    }

    public DisableSqlAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSqlAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSqlAuditResponse setBody(DisableSqlAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSqlAuditResponseBody getBody() {
        return this.body;
    }

}
