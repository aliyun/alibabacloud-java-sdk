// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateAuditCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAuditCallbackResponseBody body;

    public static CreateAuditCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditCallbackResponse self = new CreateAuditCallbackResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuditCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuditCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuditCallbackResponse setBody(CreateAuditCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuditCallbackResponseBody getBody() {
        return this.body;
    }

}
