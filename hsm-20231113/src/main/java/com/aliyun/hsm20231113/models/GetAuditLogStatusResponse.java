// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetAuditLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditLogStatusResponseBody body;

    public static GetAuditLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditLogStatusResponse self = new GetAuditLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditLogStatusResponse setBody(GetAuditLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditLogStatusResponseBody getBody() {
        return this.body;
    }

}
