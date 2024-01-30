// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAuditLogFilterResponseBody body;

    public static ModifyAuditLogFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogFilterResponse self = new ModifyAuditLogFilterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAuditLogFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAuditLogFilterResponse setBody(ModifyAuditLogFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAuditLogFilterResponseBody getBody() {
        return this.body;
    }

}
