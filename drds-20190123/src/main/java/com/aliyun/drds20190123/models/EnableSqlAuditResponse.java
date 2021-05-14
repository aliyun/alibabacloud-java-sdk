// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableSqlAuditResponse setBody(EnableSqlAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSqlAuditResponseBody getBody() {
        return this.body;
    }

}
