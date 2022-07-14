// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImAuditResponseBody body;

    public static ImAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        ImAuditResponse self = new ImAuditResponse();
        return TeaModel.build(map, self);
    }

    public ImAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImAuditResponse setBody(ImAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public ImAuditResponseBody getBody() {
        return this.body;
    }

}
