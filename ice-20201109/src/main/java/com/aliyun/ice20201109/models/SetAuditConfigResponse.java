// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetAuditConfigResponseBody body;

    public static SetAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAuditConfigResponse self = new SetAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAuditConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAuditConfigResponse setBody(SetAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAuditConfigResponseBody getBody() {
        return this.body;
    }

}
