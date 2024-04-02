// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuditCallbackResponseBody body;

    public static UpdateAuditCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditCallbackResponse self = new UpdateAuditCallbackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuditCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuditCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuditCallbackResponse setBody(UpdateAuditCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuditCallbackResponseBody getBody() {
        return this.body;
    }

}
