// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAuditRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuditRequestResponseBody body;

    public static UpdateAuditRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRequestResponse self = new UpdateAuditRequestResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuditRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuditRequestResponse setBody(UpdateAuditRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuditRequestResponseBody getBody() {
        return this.body;
    }

}
