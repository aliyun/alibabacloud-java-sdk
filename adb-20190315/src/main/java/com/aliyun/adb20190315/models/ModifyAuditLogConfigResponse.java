// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAuditLogConfigResponseBody body;

    public static ModifyAuditLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigResponse self = new ModifyAuditLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAuditLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAuditLogConfigResponse setBody(ModifyAuditLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAuditLogConfigResponseBody getBody() {
        return this.body;
    }

}
