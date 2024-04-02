// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class AuditItemSubmitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuditItemSubmitResponseBody body;

    public static AuditItemSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        AuditItemSubmitResponse self = new AuditItemSubmitResponse();
        return TeaModel.build(map, self);
    }

    public AuditItemSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuditItemSubmitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuditItemSubmitResponse setBody(AuditItemSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public AuditItemSubmitResponseBody getBody() {
        return this.body;
    }

}
